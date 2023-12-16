package ufjf.grupojj.trabalhotsw.test;

//import org.junit.jupiter.api.Test;

import org.junit.Test;

import ufjf.grupojj.trabalhotsw.view.Aquario;
import ufjf.grupojj.trabalhotsw.view.main;

import static org.junit.Assert.*;

public class AquarioTest {
/*
	@Test
	public void testeFuncional1(){
		System.out.println("Teste 1");
		int var = 0; //Utilizada quando o valor da variavel não importa no caso de teste
		//Inicia jogo com as variáveis
		// dim_x, dim_y, peixes_a, peixes_b, RA, RB, MA, MB
		main.iniciaJogo(0,1,var,var,var,var,var,var);
	}

	@Test
	public void testeFuncional2(){
		System.out.println("Teste 2");
		int var = 0;//Utilizada quando o valor da variavel não importa no caso de teste
		//Inicia jogo com as variáveis
		// dim_x, dim_y, peixes_a, peixes_b, RA, RB, MA, MB
		main.iniciaJogo(-1,1,var,var,var,var,var,var);
	}
	
	@Test
	public void testeFuncional3(){
		System.out.println("Teste 3");
		int var = 0;//Utilizada quando o valor da variavel não importa no caso de teste
		//Inicia jogo com as variáveis
		// dim_x, dim_y, peixes_a, peixes_b, RA, RB, MA, MB
		main.iniciaJogo(1,0,var,var,var,var,var,var);
	}
	
	@Test
	public void testeFuncional4(){
		System.out.println("Teste 4");
		int var = 0;//Utilizada quando o valor da variavel não importa no caso de teste
		//Inicia jogo com as variáveis
		// dim_x, dim_y, peixes_a, peixes_b, RA, RB, MA, MB
		main.iniciaJogo(1,-1,var,var,var,var,var,var);
	}
	
	@Test
	public void testeFuncional5(){
		System.out.println("Teste 5");
		int var = 0;//Utilizada quando o valor da variavel não importa no caso de teste
		//Inicia jogo com as variáveis
		// dim_x, dim_y, peixes_a, peixes_b, RA, RB, MA, MB
		main.iniciaJogo(1,1,-1,0,var,var,var,var);
	}
	
	@Test
	public void testeFuncional6(){
		System.out.println("Teste 6");
		int var = 0;//Utilizada quando o valor da variavel não importa no caso de teste
		//Inicia jogo com as variáveis
		// dim_x, dim_y, peixes_a, peixes_b, RA, RB, MA, MB
		main.iniciaJogo(1,1,0,-1,var,var,var,var);
	}
	
	@Test
	public void testeFuncional7(){
		System.out.println("Teste 7");
		int var = 0;//Utilizada quando o valor da variavel não importa no caso de teste
		//Inicia jogo com as variáveis
		// dim_x, dim_y, peixes_a, peixes_b, RA, RB, MA, MB
		main.iniciaJogo(1,1,1,1,var,var,var,var);
	}
	
	
	@Test
	public void testeFuncional8(){
		System.out.println("Teste 8");
		int var = 0;//Utilizada quando o valor da variavel não importa no caso de teste
		//Inicia jogo com as variáveis
		// dim_x, dim_y, peixes_a, peixes_b, RA, RB, MA, MB
		main.iniciaJogo(1, 2, 1, 1, -1, 0,var,var);
	}
	
	@Test
	public void testeFuncional9(){
		System.out.println("Teste 9");
		int var = 0;//Utilizada quando o valor da variavel não importa no caso de teste
		//Inicia jogo com as variáveis
		// dim_x, dim_y, peixes_a, peixes_b, RA, RB, MA, MB
		main.iniciaJogo(1, 2, 1, 1, 0, -1,var,var);
	}
	
	@Test
	public void testeFuncional10(){
		System.out.println("Teste 10");
		int var = 0;//Utilizada quando o valor da variavel não importa no caso de teste
		//Inicia jogo com as variáveis
		// dim_x, dim_y, peixes_a, peixes_b, RA, RB, MA, MB
		main.iniciaJogo(2, 1, 1, 1, 1, 1, -1, 0);
	}
	
	@Test
	public void testeFuncional11(){
		System.out.println("Teste 11");
		int var = 0;//Utilizada quando o valor da variavel não importa no caso de teste
		//Inicia jogo com as variáveis
		// dim_x, dim_y, peixes_a, peixes_b, RA, RB, MA, MB
		main.iniciaJogo(2, 1, 1, 1, 1, 1, 0, -1);
	}
	
	@Test
	public void testeFuncional12(){
		System.out.println("Teste 12");
		int var = 0;//Utilizada quando o valor da variavel não importa no caso de teste
		//Inicia jogo com as variáveis
		// dim_x, dim_y, peixes_a, peixes_b, RA, RB, MA, MB
		main.iniciaJogo(2, 2, 1, 1, 1, 1, 1, 1);
	}
	*/
	// ---------------------------------------------------------------
	
	@Test
	public void testeCobertura01() {
		Aquario aquario = new Aquario(10, 10, 3, 3, 3, 3);
		aquario.inicializar(50, 50);
		aquario.atualizarAquario();
	}

	@Test
	public void testeCobertura02() {
		Aquario aquario = new Aquario(9, 9, 3, 3, 3, 3);
		aquario.inicializar(0, 10);
		aquario.movimentaB(0, 0, 0);
		aquario.movimentaB(0, 8, 1);
		aquario.movimentaB(8, 8, 2);
		aquario.movimentaB(8, 0, 3);
		aquario.movimentaB(5, 5, 4);
		aquario.movimentaB(1, 8, 5);
		aquario.movimentaB(2, 8, 6);
		aquario.movimentaB(3, 8, 7);
		aquario.movimentaB(4, 8, 8);
}
	
	@Test
	public void testeCobertura03() {
		Aquario aquario = new Aquario(10, 10, 3, 3, 3, 3);
		aquario.inicializar(50, 1);
		aquario.atualizarAquario();
	}
	

	
}
