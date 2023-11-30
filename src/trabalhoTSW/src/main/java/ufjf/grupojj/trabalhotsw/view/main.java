/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ufjf.grupojj.trabalhotsw.view;

import java.util.InputMismatchException;
import java.util.Scanner;

public class main {

	// função auxiliar para teste
	public static void jogoAtivo(Aquario aquario, int pa, int pb) {

		aquario.inicializar(pa, pb);
		boolean ativo = true;
		int rodada = 1;
		while (ativo) {
			System.out.println("\n------------------------ Rodada " + rodada + " -------------------------------");

			aquario.atualizarAquario();
			aquario.printAquario();

			ativo = verificaFim(pb);

			rodada++;
		}

	}

	// função auxiliar para teste
	public static void iniciaJogo(int dim_x, int dim_y, int pa, int pb, int ra, int rb, int ma, int mb) {

		try {

			if (dim_x < 0 || dim_y < 0) {
				throw new NegativeValueException();
			} else if (dim_x == 0 || dim_y == 0) {
				System.out.println("[ERRO] Dimensão de matriz inválida!");
				return;
			}

			if (pa < 0 || ra < 0 || ma < 0) {
				throw new NegativeValueException();
			}

			if (pb < 0 || rb < 0 || mb < 0) {
				throw new NegativeValueException();
			}

		} catch (NegativeValueException e) {
			System.out.println(e.getMessage());
			return;
		}

		if (pa + pb > dim_x * dim_y) {
			System.out.println("[ERRO] Quantidade de peixe não cabe no aquário!");
			return;
		}

		Aquario aquario = new Aquario(dim_x, dim_y, ra, rb, ma, mb);
		jogoAtivo(aquario, pa, pb);

	}

	/* 1 */ public static boolean verificaFim(int peixes_b) {
		/* 1 */ if (peixes_b <= 0) {
			/* 2 */ return false;
			/* 3 */ }
		/* 3 */ Scanner sc = new Scanner(System.in);
		/* 3 */ try {
			/* 4 */ System.out.println();
			/* 4 */ System.out.println("Deseja finalizar o jogo?");
			/* 4 */ System.out.println("1 - sim");
			/* 4 */ int op = sc.nextInt();
			/* 4 */ if (op == 1) {
				/* 5 */ return false;
				/* 6 */ } else
				/* 6 */ return true;
			/* 7 */ } catch (InputMismatchException e) {
			/* 7 */ System.out.println("Valor inválido!");
			/* 7 */ }
		/* 8 */ return true;
		/* 9 */ }

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		boolean ativo = true; // se jogo estiver acontecendo = treu caso acabe = false

		int dim_x = 0; // quantidade de linhas do aquario
		int dim_y = 0; // quantidade de colunas do aquario

		int peixes_a = 0; // quantidade de peixes do tipo A
		int ra = 0; // movimentos para criar filho
		int ma = 0; // movimentos para morrer de fome

		int peixes_b = 0; // quantidade de peixes do tipo A
		int rb = 0; // quantidade de peixes comidos para criar filho
		int mb = 0; // movimentos para morrer de fome

		try {
			System.out.println("Tamanho do aquario: (NxM)");
			dim_x = sc.nextInt();
			dim_y = sc.nextInt();

			if (dim_x < 0 || dim_y < 0) {
				extracted();
			} else if (dim_x == 0 || dim_y == 0) {
				System.out.println("[ERRO] Dimensão de matriz inválida!");
				System.exit(1);
			}

			System.out.println("Quantidade de peixes de tipo A:");
			peixes_a = sc.nextInt();
			ra = sc.nextInt();
			ma = sc.nextInt();

			if (peixes_a < 0 || ra < 0 || ma < 0) {
				extracted();
			}

			System.out.println("Quantidade de peixes de tipo B:");
			peixes_b = sc.nextInt();
			rb = sc.nextInt();
			mb = sc.nextInt();

			if (peixes_b < 0 || rb < 0 || mb < 0) {
				extracted();
			}

		} catch (NegativeValueException e) {
			System.out.println(e.getMessage());
			System.exit(1);
		}

		Aquario aquario = new Aquario(dim_x, dim_y, ra, rb, ma, mb);
		aquario.inicializar(peixes_a, peixes_b);

		System.out.println("\nEstado Inicial do Aquário");
		aquario.printAquario();

		int rodada = 1;
		while (ativo) {
			System.out.println("\n------------------------ Rodada " + rodada + " -------------------------------");

			aquario.atualizarAquario();
			aquario.printAquario();

			ativo = verificaFim(aquario.getPeixesB().size());

			rodada++;
		}

		sc.close();
	}

	private static void extracted() throws NegativeValueException {
		throw new NegativeValueException();
	}
}
