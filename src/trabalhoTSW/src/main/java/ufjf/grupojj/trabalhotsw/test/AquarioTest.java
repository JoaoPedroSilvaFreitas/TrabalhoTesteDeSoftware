package ufjf.grupojj.trabalhotsw.test;

import org.junit.jupiter.api.Test;

import ufjf.grupojj.trabalhotsw.view.Aquario;
import ufjf.grupojj.trabalhotsw.view.main;

import static org.junit.Assert.*;

public class AquarioTest {

	@Test
	void testeFuncional1(){
		System.out.println("Teste 1");
		int var = 0;
		main.iniciaJogo(0,1,var,var,var,var,var,var);
	}


	@Test
	void testeFuncional2(){
		System.out.println("Teste 2");
		int var = 0;
		main.iniciaJogo(-1,1,var,var,var,var,var,var);
	}
	
	@Test
	void testeFuncional3(){
		System.out.println("Teste 3");
		int var = 0;
		main.iniciaJogo(1,0,var,var,var,var,var,var);
	}
	
	@Test
	void testeFuncional4(){
		System.out.println("Teste 4");
		int var = 0;
		main.iniciaJogo(1,-1,var,var,var,var,var,var);
	}
	

	@Test
	void testeFuncional5(){
		System.out.println("Teste 5");
		int var = 0;
		main.iniciaJogo(1,1,-1,0,var,var,var,var);
	}
	
}
