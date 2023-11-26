package ufjf.grupojj.trabalhotsw.test;

import org.junit.jupiter.api.Test;

import ufjf.grupojj.trabalhotsw.view.Aquario;
import ufjf.grupojj.trabalhotsw.view.main;

import static org.junit.Assert.*;

public class AquarioTestGrafo {

	@Test
	void testeFuncional1(){
		System.out.println("Teste 1");
		int var = 0;
		main.iniciaJogo(2, 2, 1, 1, 1, 1, 1, 1);
	}

	@Test
	void testeFuncional2(){
		System.out.println("Teste 2");
		int var = 0;
		main.iniciaJogo(0,1,var,var, var, var, var,var);
	}
	
	@Test
	void testeFuncional3(){
		System.out.println("Teste 3");
		int var = 0;
		main.iniciaJogo(-1,1,var,var, var, var, var,var);
	}

	@Test
	void testeFuncional4(){
		System.out.println("Teste 4");
		int var = 0;
		main.iniciaJogo(1,0,var,var, var, var, var,var);
	}


	@Test
	void testeFuncional5(){
		System.out.println("Teste 5");
		int var = 0;
		main.iniciaJogo(1,-1,var,var, var, var, var,var);
	}
	
	@Test
	void testeFuncional6(){
		System.out.println("Teste 6");
		int var = 0;
		main.iniciaJogo(2,2,-1,var, var, var, var,var);
	}


	@Test
	void testeFuncional7(){
		System.out.println("Teste 7");
		int var = 0;
		main.iniciaJogo(2,2,-1,var, var, var, var,var);
	}
	
	@Test
	void testeFuncional8(){
		System.out.println("Teste 8");
		int var = 0;
		main.iniciaJogo(2,2,1,1,-1, var, var,var);
	}
	
	
	@Test
	void testeFuncional9(){
		System.out.println("Teste 9");
		int var = 0;
		main.iniciaJogo(2,2,1,1,1,-1, var,var);
	}


	@Test
	void testeFuncional10(){
		System.out.println("Teste 10");
		int var = 0;
		main.iniciaJogo(2,2,1,1,1,1,-1,var);
	}
	
	
	@Test
	void testeFuncional11(){
		System.out.println("Teste 11");
		int var = 0;
		main.iniciaJogo(2,2,1,1,1,1,1,-1);
	}
	
	
	@Test
	void testeFuncional12(){
		System.out.println("Teste 12");
		int var = 0;
		main.iniciaJogo(1,1,1,1,1,1,1,1);
	}


	
}
