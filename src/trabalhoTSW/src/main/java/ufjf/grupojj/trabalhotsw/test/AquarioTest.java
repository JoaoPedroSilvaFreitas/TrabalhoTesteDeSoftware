package ufjf.grupojj.trabalhotsw.test;

import org.junit.jupiter.api.Test;

import ufjf.grupojj.trabalhotsw.view.main;

import static org.junit.Assert.*;

public class AquarioTest {

	@Test
	void teste1(){
		int var = 0;
		main.iniciaJogo(0,1,var,var,var,var,var,var);
	}
	
	
	@Test
	void teste2(){
		int var = 0;
		main.iniciaJogo(-1,1,var,var,var,var,var,var);
	}
	
	
}
