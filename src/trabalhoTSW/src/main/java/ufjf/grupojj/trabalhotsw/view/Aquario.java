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

	public Aquario(int dim_x, int dim_y, int ra, int rb, int ma, int mb) {
		
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

	public List<PeixeA> getPeixesA()
	{
		return peixesA;
	}
	
	public List<PeixeB> getPeixesB()
	{
		return peixesB;
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

/*1*/	public void inicializar(int quantPeixes_a, int quantPeixes_b) {
/*1*/		Random rand = new Random();
/*1*/		// colocando espaços vazio na matriz
/*1*/		for (int i = 0; i < this.dim_x; i++) {
/*2*/			for (int j = 0; j < this.dim_y; j++) {
/*3*/				aquario[i][j] = ' ';
/*4*/			}
/*5*/		}
/*5*/		// adicionar peixes A
/*5*/		for (int i = 0; i < quantPeixes_a; i++) {
/*6*/			int x, y;
/*6*/			do {
/*6*/				x = rand.nextInt(this.dim_x);
/*6*/				y = rand.nextInt(this.dim_y);
/*7*/			} while (aquario[x][y] != ' ');
/*8*/			PeixeA peixe = new PeixeA('A', x, y);
/*8*/			peixesA.add(peixe);
/*8*/			aquario[x][y] = 'A';
/*9*/		}
			// adicionar peixes B
/*9*/		for (int i = 0; i < quantPeixes_b; i++) {
/*10*/			int x, y;
/*10*/			do {
/*10*/				x = rand.nextInt(this.dim_x);
/*10*/				y = rand.nextInt(this.dim_y);
/*11*/			} while (aquario[x][y] != ' ');
/*12*/			PeixeB peixe = new PeixeB('B', x, y);
/*12*/			peixesB.add(peixe);
/*12*/			aquario[x][y] = 'B';
/*13*/		}
/*14*/	}

	public void atualizarAquario() {
		int x, y;

		for (int i = 0; i < peixesA.size(); i++) {
			x = peixesA.get(i).getPosicao_x();
			y = peixesA.get(i).getPosicao_y();
			movimentaA(x, y, i);
		}

		for (int i = 0; i < peixesB.size(); i++) {
			x = peixesB.get(i).getPosicao_x();
			y = peixesB.get(i).getPosicao_y();
			movimentaB(x, y, i);
		}
	}

	
/*1*/	public void movimentaA(int x, int y, int i) {
/*1*/		// se peixe A tiver alguma célula vizinha vazia, se movimenta
/*1*/		if (x - 1 >= 0 && aquario[x - 1][y] == ' ') {
/*2*/			peixesA.get(i).setPosicao_x(x - 1);
/*2*/			aquario[x - 1][y] = 'A';
/*2*/			aquario[x][y] = ' ';
/*2*/			// reinicia a contagem de ma, porque o peixe se movimentou.
/*2*/			atualizaPosMovimentoA(x, y, i);
/*3*/		} else if (y - 1 >= 0 && aquario[x][y - 1] == ' ') {
/*4*/			peixesA.get(i).setPosicao_y(y - 1);
/*4*/			aquario[x][y - 1] = 'A';
/*4*/			aquario[x][y] = ' ';
/*4*/			atualizaPosMovimentoA(x, y, i);
/*5*/		} else if (x + 1 < dim_x && aquario[x + 1][y] == ' ') {
/*6*/			peixesA.get(i).setPosicao_x(x + 1);
/*6*/			aquario[x + 1][y] = 'A';
/*6*/			aquario[x][y] = ' ';
/*6*/			atualizaPosMovimentoA(x, y, i);
/*7*/		} else if (y + 1 < dim_y && aquario[x][y + 1] == ' ') {
/*8*/			peixesA.get(i).setPosicao_y(y + 1);
/*8*/			aquario[x][y + 1] = 'A';
/*8*/			aquario[x][y] = ' ';
/*8*/			atualizaPosMovimentoA(x, y, i);
/*9*/		}
/*9*/		// senão, atualiza valor de ma (não se movimenta, todas as células ao seu redor
/*9*/		// estão ocupadas)
/*9*/		else {
/*9*/			int aux_ma = peixesA.get(i).getMa() + 1;
/*9*/			peixesA.get(i).setMa(aux_ma);
/*9*/			// se ma atingir valor máximo, peixe morre.
/*10*/			if (aux_ma == ma) {
/*11*/				peixesA.remove(i);
/*11*/				aquario[x][y] = ' ';
/*12*/			}
/*12*/			// senão apenas reinicia o valor de ra.
/*12*/			else {
/*12*/				peixesA.get(i).setRa(0);
/*13*/			}
/*14*/		}
/*14*/	}

	public void movimentaB(int x, int y, int i) {

		// verifica se tem algum peixe A ao lado de um peixe B
		// peixe A em cima de B
		if (x - 1 >= 0 && aquario[x - 1][y] == 'A') {
			// come
			aquario[x - 1][y] = 'B';
			aquario[x][y] = ' ';
			// aumenta rb
			peixesB.get(i).setRb(peixesB.get(i).getRb() + 1);
			// reseta mb
			peixesB.get(i).setMb(0);
		}
		// peixe A em baixo de B
		else if (x + 1 < dim_x && aquario[x + 1][y] == 'A') {
			// come
			aquario[x + 1][y] = 'B';
			aquario[x][y] = ' ';
			// aumenta rb
			peixesB.get(i).setRb(peixesB.get(i).getRb() + 1);
			// reseta mb
			peixesB.get(i).setMb(0);
		}
		// peixe A a direita de B
		else if (y + 1 < dim_y && aquario[x][y + 1] == 'A') {
			// come
			aquario[x][y + 1] = 'B';
			aquario[x][y] = ' ';
			// aumenta rb
			peixesB.get(i).setRb(peixesB.get(i).getRb() + 1);
			// reseta mb
			peixesB.get(i).setMb(0);
		}
		// peixe A a esquerda de B
		else if (y - 1 >= 0 && aquario[x][y - 1] == 'A') {
			// come
			aquario[x][y - 1] = 'B';
			aquario[x][y] = ' ';
			// aumenta rb
			peixesB.get(i).setRb(peixesB.get(i).getRb() + 1);
			// reseta mb
			peixesB.get(i).setMb(0);
		}
		// senão tiver ao lado de nunhum peixe A, movimenta-se para uma célula vazia
		else {
			// vazio em cima de B
			if (x - 1 >= 0 && aquario[x - 1][y] == ' ') {
				// movimenta
				aquario[x - 1][y] = 'B';
				aquario[x][y] = ' ';
				// aumenta mb
				peixesB.get(i).setMb(peixesB.get(i).getMb() + 1);
			}
			// vazio em baixo de B
			else if (x + 1 < dim_x && aquario[x + 1][y] == ' ') {
				// movimenta
				aquario[x + 1][y] = 'B';
				aquario[x][y] = ' ';
				// aumenta mb
				peixesB.get(i).setMb(peixesB.get(i).getMb() + 1);
			}
			// vazio a direita de B
			else if (y + 1 < dim_y && aquario[x][y + 1] == ' ') {
				// movimenta
				aquario[x][y + 1] = 'B';
				aquario[x][y] = ' ';
				// aumenta mb
				peixesB.get(i).setMb(peixesB.get(i).getMb() + 1);
			}
			// vazio a esquerda de B
			else if (y - 1 >= 0 && aquario[x][y - 1] == ' ') {
				// movimenta
				aquario[x][y - 1] = 'B';
				aquario[x][y] = ' ';
				// aumenta mb
				peixesB.get(i).setMb(peixesB.get(i).getMb() + 1);
			}
		}
		atualizaPosMovimentoB(x, y, i);
	}

	
	public void atualizaPosMovimentoB(int x, int y, int i) {
		// verificar se morreu de fome
		if (peixesB.get(i).getMb() == this.mb) {
			aquario[x][y] = ' ';
			peixesB.remove(i);
		}else if (peixesB.get(i).getRb() == this.rb) {
			
			// verificar se pode criar filho
			if (peixesB.get(i).getRb() == this.rb) {
				PeixeB b = new PeixeB('B');
				
				if (x > 0 && x < dim_x && y > 0 && y < dim_y) {
					
					if (aquario[x - 1][y] != 'B' && aquario[x + 1][y] != 'B' &&
						aquario[x][y - 1] != 'B' && aquario[x][y + 1] != 'B') {
						
						b.setPosicao_x(x - 1);
						b.setPosicao_y(y);
						peixesB.add(b);
					}
					
				} else {
					if (x == 0 && y == 0 && (aquario[x+1][y] != 'B' && aquario[x][y+1] != 'B')) {
						if (aquario[x+1][y] == ' ') {
							b.setPosicao_x(x + 1);
							b.setPosicao_y(y);
						} else {
							b.setPosicao_x(x);
							b.setPosicao_y(y+1);
						}
						peixesB.add(b);
					}
					
					else if (x == dim_x - 1 && y == 0 && (aquario[x-1][y] != 'B' && aquario[x][y+1] != 'B')) {
						if (aquario[x-1][y] == ' ') {
							b.setPosicao_x(x-1);
							b.setPosicao_y(y);
						} else {
							b.setPosicao_x(x);
							b.setPosicao_y(y+1);
						}
						peixesB.add(b);
					}
					
					else if (x == dim_x - 1 && y == dim_y - 1 && (aquario[x-1][y] != 'B' && aquario[x][y-1] != 'B')) {
						if (aquario[x-1][y] == ' ') {
							b.setPosicao_x(x-1);
							b.setPosicao_y(y);
						} else {
							b.setPosicao_x(x);
							b.setPosicao_y(y-1);
						}
						peixesB.add(b);
					}
					
					else if (x == 0 && y == dim_y - 1 && (aquario[x+1][y] != 'B' && aquario[x][y-1] != 'B')) {
						if (aquario[x+1][y] == ' ') {
							b.setPosicao_x(x+1);
							b.setPosicao_y(y);
						} else {
							b.setPosicao_x(x);
							b.setPosicao_y(y-1);
						}
						peixesB.add(b);
					}
					
				}
				
				// adiciona peixe a lista de peixes do tipo B
				
			}
		}
	}

	
/*1*/	public void atualizaPosMovimentoA(int x, int y, int i) {
/*1*/		// reinicia a contagem de ma, porque o peixe se movimentou.
/*1*/		peixesA.get(i).setMa(0);
/*1*/		// atualiza valor de ra.
/*1*/		int aux_ra = peixesA.get(i).getRa() + 1;
/*1*/		peixesA.get(i).setRa(aux_ra);
/*1*/		if (aux_ra == this.ra) {
/*2*/			// da posição que A saiu anteriormente, seu filho ocupa esse lugar.
/*2*/			PeixeA peixeFilho = new PeixeA('A', x, y);
/*2*/			peixeFilho.setRa(0);
/*2*/			peixeFilho.setMa(0);
/*2*/			peixesA.add(peixeFilho);
/*2*/			aquario[x][y] = 'A';
/*3*/		}
/*3*/	}
/*3*/}
