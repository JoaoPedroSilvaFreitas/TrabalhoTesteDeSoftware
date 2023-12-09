package ufjf.grupojj.trabalhotsw.test;

//import org.junit.jupiter.api.Test;

import ufjf.grupojj.trabalhotsw.view.Aquario;
import ufjf.grupojj.trabalhotsw.view.main;

import static org.junit.Assert.*;

import org.junit.Test;

public class AquarioTestGrafo {

	@Test
	public void testeFuncional1(){
		System.out.println("Teste 1");
		int var = 0;
		main.iniciaJogo(2, 2, 1, 1, 1, 1, 1, 1);
	}

	@Test
	public void testeFuncional2(){
		System.out.println("Teste 2");
		int var = 0;
		main.iniciaJogo(0,1,var,var, var, var, var,var);
	}
	
	@Test
	public void testeFuncional3(){
		System.out.println("Teste 3");
		int var = 0;
		main.iniciaJogo(-1,1,var,var, var, var, var,var);
	}

	@Test
	public void testeFuncional4(){
		System.out.println("Teste 4");
		int var = 0;
		main.iniciaJogo(1,0,var,var, var, var, var,var);
	}


	@Test
	public void testeFuncional5(){
		System.out.println("Teste 5");
		int var = 0;
		main.iniciaJogo(1,-1,var,var, var, var, var,var);
	}
	
	@Test
	public void testeFuncional6(){
		System.out.println("Teste 6");
		int var = 0;
		main.iniciaJogo(2,2,-1,var, var, var, var,var);
	}


	@Test
	public void testeFuncional7(){
		System.out.println("Teste 7");
		int var = 0;
		main.iniciaJogo(2,2,-1,var, var, var, var,var);
	}
	
	@Test
	public void testeFuncional8(){
		System.out.println("Teste 8");
		int var = 0;
		main.iniciaJogo(2,2,1,1,-1, var, var,var);
	}
	
	
	@Test
	public void testeFuncional9(){
		System.out.println("Teste 9");
		int var = 0;
		main.iniciaJogo(2,2,1,1,1,-1, var,var);
	}


	@Test
	public void testeFuncional10(){
		System.out.println("Teste 10");
		int var = 0;
		main.iniciaJogo(2,2,1,1,1,1,-1,var);
	}
	
	
	@Test
	public void testeFuncional11(){
		System.out.println("Teste 11");
		int var = 0;
		main.iniciaJogo(2,2,1,1,1,1,1,-1);
	}
	
	
	@Test
	public void testeFuncional12(){
		System.out.println("Teste 12");
		int var = 0;
		main.iniciaJogo(1,1,1,1,1,1,1,1);
	}


	
}
