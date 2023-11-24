package ufjf.grupojj.trabalhotsw.view;

import java.util.ArrayList;
import java.util.List;

import java.util.Random;

public class Aquario {

    int dim_x;
    int dim_y;
    int ra;
    int rb;
    int ma;
    int mb;
    char[][] aquario;
    List<PeixeA> peixesA;
    List<PeixeB> peixesB;

    Aquario(int dim_x, int dim_y, int ra, int rb, int ma, int mb) {
        this.dim_x = dim_x;
        this.dim_y = dim_y;
        this.ra = ra;
        this.rb = rb;
        this.ma = ma;
        this.mb = mb;
        this.aquario = new char[dim_x][dim_y];
        peixesA = new ArrayList<PeixeA>();
        peixesB = new ArrayList<PeixeB>();
    }

    public int getDim_x() {
        return dim_x;
    }

    public void setDim_x(int dim_x) {
        this.dim_x = dim_x;
    }

    public int getDim_y() {
        return dim_y;
    }

    public void setDim_y(int dim_y) {
        this.dim_y = dim_y;
    }

    public char[][] getAquario() {
        return aquario;
    }

    public void setAquario(char[][] aquario) {
        this.aquario = aquario;
    }

    // Imprime aquario
    public void printAquario() {
        for (int i = 0; i < dim_x; i++) {
            System.out.println();
            for (int j = 0; j < dim_y; j++) {
                System.out.print("[" + aquario[i][j] + "]");
            }
        }
        System.out.println();
    }

    public void inicializar(int quantPeixes_a, int quantPeixes_b) {
        Random rand = new Random();

        // colocando espaços vazio na matriz
        for (int i = 0; i < this.dim_x; i++) {
            for (int j = 0; j < this.dim_y; j++) {
                aquario[i][j] = ' ';
            }
        }

        // adicionar peixes A
        for (int i = 0; i < quantPeixes_a; i++) {
            int x, y;

            do {
                x = rand.nextInt(this.dim_x);
                y = rand.nextInt(this.dim_y);
            } while (aquario[x][y] != ' ');

            PeixeA peixe = new PeixeA('A', x, y);
            peixesA.add(peixe);
            aquario[x][y] = 'A';
            System.out.println("Peixe" + i + " " + x + "-" + y);
        }

        // adicionar peixes B
        for (int i = 0; i < quantPeixes_b; i++) {
            int x, y;

            do {
                x = rand.nextInt(this.dim_x);
                y = rand.nextInt(this.dim_y);
            } while (aquario[x][y] != ' ');

            PeixeB peixe = new PeixeB('B', x, y);
            peixesB.add(peixe);
            aquario[x][y] = 'B';
        }
    }

    public void atualizaPosMovimentoA(int x, int y, int i) {
        // reinicia a contagem de ma, porque o peixe se movimentou.
        peixesA.get(i).setMa(0);
        // atualiza valor de ra.
        int aux_ra = peixesA.get(i).getRa() + 1;
        peixesA.get(i).setRa(aux_ra);

        if (aux_ra == this.ra) {
            // da posição que A saiu anteriormente, seu filho ocupa esse lugar.
            aquario[x][y] = 'A';
        }
    }

    public void atualizarAquario() {

        for (int i = 0; i < peixesA.size(); i++) {
            int x = peixesA.get(i).getPosicao_x();
            int y = peixesA.get(i).getPosicao_y();

            // se peixe A tiver alguma célula vizinha vazia, se movimenta
            if (x - 1 >= 0 && aquario[x - 1][y] == ' ') {
                peixesA.get(i).setPosicao_x(x - 1);
                aquario[x - 1][y] = 'A';
                aquario[x][y] = ' ';
                // reinicia a contagem de ma, porque o peixe se movimentou.
                atualizaPosMovimentoA(x, y, i);
                System.out.println(x + " " + y + " para " + (x - 1) + " " + y);
                printAquario();
            } else if (y - 1 >= 0 && aquario[x][y - 1] == ' ') {
                peixesA.get(i).setPosicao_y(y - 1);
                aquario[x][y - 1] = 'A';
                aquario[x][y] = ' ';
                atualizaPosMovimentoA(x, y, i);
                System.out.println(x + " " + y + " para " + x + " " + (y - 1));
                printAquario();
            } else if (x + 1 < dim_x && aquario[x + 1][y] == ' ') {
                peixesA.get(i).setPosicao_x(x + 1);
                aquario[x + 1][y] = 'A';
                aquario[x][y] = ' ';
                atualizaPosMovimentoA(x, y, i);
                System.out.println(x + " " + y + " para " + (x + 1) + " " + y);
                printAquario();
            } else if (y + 1 < dim_y && aquario[x][y + 1] == ' ') {
                peixesA.get(i).setPosicao_y(y + 1);
                aquario[x][y + 1] = 'A';
                aquario[x][y] = ' ';
                atualizaPosMovimentoA(x, y, i);
                System.out.println(x + " " + y + " para " + x + " " + (y + 1));
                printAquario();
            }
            // senão, atualiza valor de ma (não se movimenta, todas as células ao seu redor
            // estão ocupadas)
            else {
                int aux_ma = peixesA.get(i).getMa() + 1;
                peixesA.get(i).setMa(aux_ma);
                // se ma atingir valor máximo, peixe morre.
                if (aux_ma == ma) {
                    peixesA.remove(i);
                    i--;
                    aquario[x][y] = ' ';
                }
                // senão apenas reinicia o valor de ra.
                else {
                    peixesA.get(i).setRa(0);
                }
                printAquario();
            }

        }
        movimentaB();
    }

    public void atualizaPosMovimentoB(int x, int y, int i) {
        //verificar se morreu de fome
        if (peixesB.get(i).getMb() == this.mb) {
            aquario[x][y] = ' ';
            peixesB.remove(i);
        } 
        //verificar se pode criar filho
        if (peixesB.get(i).getRb() == this.rb) {
            PeixeB b = new PeixeB('B');

            if (x-1 > 0 && aquario[x-1][y] == ' ') {
                b.setPosicao_x(x-1);
                b.setPosicao_y(y);
            } 
            else if (x+1 < dim_x && aquario[x+1][y] == ' ') {
                b.setPosicao_x(x+1);
                b.setPosicao_y(y);
            } 
            else if (y+1 < dim_y && aquario[x][y+1] == ' ') {
                b.setPosicao_x(x);
                b.setPosicao_y(y+1);
            } 
            else if (y-1 < 0 && aquario[x][y-1] == ' ') {
                b.setPosicao_x(x);
                b.setPosicao_y(y-1);
            }
            //adiciona peixe a lista de peixes do tipo B
            peixesB.add(b);
        }
    }

    public void movimentaB() {
        for (int i = 0; i < peixesB.size(); i++) {
            int x = peixesB.get(i).getPosicao_x();
            int y = peixesB.get(i).getPosicao_y();
            //verifica se tem algum peixe A ao lado de um peixe B
            //peixe A em cima de B
            if (x-1 > 0 && aquario[x-1][y] == 'A') {
                //come
                aquario[x-1][y] = 'B';
                aquario[x][y] = ' ';
                //aumenta rb
                peixesB.get(i).setRb(peixesB.get(i).getRb() + 1);
                //reseta mb
                peixesB.get(i).setMb(0);
            }
            //peixe A em baixo de B
            else if (x+1 < dim_x && aquario[x+1][y] == 'A') {
                //come
                aquario[x+1][y] = 'B';
                aquario[x][y] = ' ';
                //aumenta rb
                peixesB.get(i).setRb(peixesB.get(i).getRb() + 1);
                //reseta mb
                peixesB.get(i).setMb(0);
            }
            //peixe A a direita de B
            else if (y+1 < dim_y && aquario[x][y+1] == 'A') {
                //come
                aquario[x][y+1] = 'B';
                aquario[x][y] = ' ';
                //aumenta rb
                peixesB.get(i).setRb(peixesB.get(i).getRb() + 1);
                //reseta mb
                peixesB.get(i).setMb(0);
            }
            //peixe A a esquerda de B
            else if (y-1 < 0 && aquario[x][y-1] == 'A') {
                //come
                aquario[x][y-1] = 'B';
                aquario[x][y] = ' ';
                //aumenta rb
                peixesB.get(i).setRb(peixesB.get(i).getRb() + 1);
                //reseta mb
                peixesB.get(i).setMb(0);
            }
            //senão tiver ao lado de nunhum peixe A, movimenta-se para uma célula vazia
            else {
                //vazio em cima de B
                if (x-1 > 0 && aquario[x-1][y] == ' ') {
                    //movimenta
                    aquario[x-1][y] = 'B';
                    aquario[x][y] = ' ';
                    //aumenta mb
                    peixesB.get(i).setMb(peixesB.get(i).getMb() + 1);
                }
                //vazio em baixo de B
                else if (x+1 < dim_x && aquario[x+1][y] == ' ') {
                    //movimenta
                    aquario[x+1][y] = 'B';
                    aquario[x][y] = ' ';
                    //aumenta mb
                    peixesB.get(i).setMb(peixesB.get(i).getMb() + 1);
                }
                //vazio a direita de B
                else if (y+1 < dim_y && aquario[x][y+1] == ' ') {
                    //movimenta
                    aquario[x][y+1] = 'B';
                    aquario[x][y] = ' ';
                    //aumenta mb
                    peixesB.get(i).setMb(peixesB.get(i).getMb() + 1);
                }
                //vazio a esquerda de B
                else if (y-1 > 0 && aquario[x][y-1] == ' ') {
                    //movimenta
                    aquario[x][y-1] = 'B';
                    aquario[x][y] = ' ';
                    //aumenta mb
                    peixesB.get(i).setMb(peixesB.get(i).getMb() + 1);
                }
            }
            atualizaPosMovimentoB(x, y, i);
        }
    }
}
