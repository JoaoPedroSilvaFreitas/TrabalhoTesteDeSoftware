package ufjf.grupojj.trabalhotsw.view;

import java.util.Random;

public class Aquario {
    
    int dim_x;
    int dim_y;
    char[][] aquario;

    Aquario(int dim_x, int dim_y) {
        this.dim_x = dim_x;
        this.dim_y = dim_y;
        this.aquario = new char[dim_x][dim_y];
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

    //Imprime aquario
    public void printAquario()
    {
        for(int i = 0; i < dim_x; i++)
        {
            System.out.println();
                for(int j = 0; j < dim_y; j++)
                {
                    System.out.print("[" + aquario[i][j] + "]");
                }
        }
        System.out.println();
    }
    
    public void inicializar(int peixes_a, int peixes_b) {
        Random rand = new Random();

        for(int i = 0; i < this.dim_x; i++) {
            for(int j = 0; j < this.dim_y; j++) {
                aquario[i][j] = ' ';
            }
        }

        //adicionar peixes A
        for (int i = 0; i < peixes_a; i++) {
            int x = rand.nextInt(this.dim_x);
            int y = rand.nextInt(this.dim_y);
            aquario[x][y] = 'A';
        }

        //adicionar peixes A
        for (int i = 0; i < peixes_b; i++) {
            int x, y;

            do {
                x = rand.nextInt(this.dim_x); 
                y = rand.nextInt(this.dim_y);
            } while (aquario[x][y] != ' ');

            aquario[x][y] = 'B';
        }
    }

    public void atualizaPosicao(char[][] tempAquario) {

        for (int i = 0; i < dim_x; i++) {
            for (int j = 0; j < dim_y; j++) {
                
                if (aquario[i][j] == 'A') {
                    aquario[i][j] = ' ';
                }
                if (tempAquario[i][j] == 'A') {
                    aquario[i][j] = 'A';
                }

            }
        }
    }

    public void atualizarAquario() {

        char[][] tempAquario = new char[dim_x][dim_y];

        //regra 1 - peixe A
        for (int i = 0; i < dim_x; i++) {
            for (int j = 0; j < dim_y; j++) {
                
                if (aquario[i][j] == 'A') {
                    //verifica na direita de A
                    if (j+1 < dim_y && aquario[i][j+1] == ' ') {
                        tempAquario[i][j+1] = 'A';
                        aquario[i][j] = ' ';
                    }
                    //verifica em baixo de A
                    else if (i+1 < dim_x && aquario[i+1][j] == ' ') {
                        tempAquario[i+1][j] = 'A';
                        aquario[i][j] = ' ';
                    }
                    //verifica esquerda de A
                    else if (j-1 >= 0 && aquario[i][j-1] == ' ') {
                        tempAquario[i][j-1] = 'A';
                        aquario[i][j] = ' ';
                    }
                    //verifica em cima de A
                    else if (i-1 >= 0 && aquario[i-1][j] == ' ') {
                        tempAquario[i-1][j] = 'A';
                        aquario[i][j] = ' ';
                    }
                }
            }
        }

        atualizaPosicao(tempAquario);
    }
}

