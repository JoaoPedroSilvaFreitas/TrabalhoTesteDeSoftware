package ufjf.grupojj.trabalhotsw.test;

import org.junit.jupiter.api.Test;

import ufjf.grupojj.trabalhotsw.view.Aquario;

class AquarioTestGrafoDefUso {

// METODO INICIALIZAR ----------------------------------------------
// Todas difinicoes
	
//	@Test
//	void testDef_ini_quantPeixesA() {
//		Aquario aquario = new Aquario(3, 3, 1, 1, 1, 1);
//		aquario.inicializar(0, 0);
//	}
//	
//	@Test
//	void testDef_ini_quantPeixesB() {
//		Aquario aquario = new Aquario(4, 4, 2, 2, 2, 2);
//		aquario.inicializar(0, 0);
//	}
//	
//	@Test
//	void testDef_ini_rand() {
//		Aquario aquario = new Aquario(4, 4, 1, 1, 1, 1);
//		aquario.inicializar(0, 0);
//	}
//	
//	@Test
//	void testDef_ini_i() {
//		Aquario aquario = new Aquario(1, 1, 1, 1, 1, 1);
//		aquario.inicializar(0, 0);
//	}
//	
//	@Test
//	void testDef_ini_j() {
//		Aquario aquario = new Aquario(4, 4, 2, 2, 2, 2);
//		aquario.inicializar(0, 0);
//	}
//	
//
//	@Test
//	void testDef_ini_x() {
//		Aquario aquario = new Aquario(3, 3, 0, 0, 0, 0);
//		aquario.inicializar(2, 2);
//	}
	
//	@Test
//	void testDef_ini_y() {
//		Aquario aquario = new Aquario(5, 5, 0, 0, 0, 0);
//		aquario.inicializar(5, 5);
//	}
	
//	@Test
//	void testDef_ini_peixe() {
//		Aquario aquario = new Aquario(5, 5, 1, 1, 1, 1);
//		aquario.inicializar(12, 12);
//	}
	
//	@Test
//	void testDef_ini_peixesA() {
//		Aquario aquario = new Aquario(4, 4, 0, 0, 0, 0);
//		aquario.inicializar(8, 0);
//	}
	
//	@Test
//	void testDef_ini_peixesB() {
//		Aquario aquario = new Aquario(4, 4, 0, 0, 8, 8);
//		aquario.inicializar(0, 2);
//	}
	
// Todos p-usos
	
//	@Test
//	void testPuso_ini_i() {
//		Aquario aquario = new Aquario(1, 1, 2, 2, 2, 2);
//		aquario.inicializar(0, 0);
//	}
//	
//	@Test
//	void testPuso_ini_j() {
//		Aquario aquario = new Aquario(5, 5, 2, 3, 2, 3);
//		aquario.inicializar(0, 0);
//	}
//	
//	@Test
//	void testPuso_ini_quantPeixesA() {
//		Aquario aquario = new Aquario(2, 2, 0, 0, 0, 0);
//		aquario.inicializar(0, 0);
//	}
//	
//	@Test
//	void testPuso_ini_quantPeixesB() {
//		Aquario aquario = new Aquario(3, 3, 1, 1, 2, 2);
//		aquario.inicializar(0, 0);
//	}
//	
//	@Test
//	void testPuso_ini_aquario() {
//		Aquario aquario = new Aquario(5, 5, 1, 2, 3, 4);
//		aquario.inicializar(12, 12);
//	}
	
// Todos c-usos
	
//	@Test
//	void testCuso_ini_i() {
//		Aquario aquario = new Aquario(7, 7, 0, 0, 0, 0);
//		aquario.inicializar(10, 10);
//	}
//	
//	@Test
//	void testCuso_ini_j() {
//		Aquario aquario = new Aquario(7, 7, 0, 0, 0, 0);
//		aquario.inicializar(15, 20);
//	}
	
//METODO MOVIMENTA A ----------------------------------------------
// Todas difinicoes
	
	@Test
	void testDef_movA1_peixesA() {
		Aquario aquario = new Aquario(2, 2, 0, 0, 1, 1);
		aquario.inicializar(1, 0);
	
		char [][] aux_aquario = aquario.getAquario();
		aux_aquario[0][0] = ' ';
		aux_aquario[1][0] = 'A';
		aux_aquario[0][1] = ' ';
		aux_aquario[1][1] = ' ';
		
		aquario.setAquario(aux_aquario);
				
		aquario.movimentaA(1, 0, 0);		
	}
	
	@Test
	void testDef_movA2_peixesA() {
		Aquario aquario = new Aquario(2, 2, 0, 0, 1, 1);
		aquario.inicializar(1, 0);
	
		char [][] aux_aquario = aquario.getAquario();
		aux_aquario[0][0] = ' ';
		aux_aquario[1][0] = ' ';
		aux_aquario[0][1] = 'A';
		aux_aquario[1][1] = ' ';
		
		aquario.setAquario(aux_aquario);
				
		aquario.movimentaA(0, 1, 0);		
	}
	
	@Test
	void testDef_movA3_peixesA() {
		Aquario aquario = new Aquario(2, 2, 0, 0, 1, 1);
		aquario.inicializar(1, 0);
	
		char [][] aux_aquario = aquario.getAquario();
		aux_aquario[0][0] = 'A';
		aux_aquario[1][0] = ' ';
		aux_aquario[0][1] = ' ';
		aux_aquario[1][1] = ' ';
		
		aquario.setAquario(aux_aquario);
				
		aquario.movimentaA(0, 0, 0);		
	}
	
	@Test
	void testDef_movA4_peixesA() {
		Aquario aquario = new Aquario(2, 2, 0, 0, 1, 1);
		aquario.inicializar(1, 0);
	
		char [][] aux_aquario = aquario.getAquario();
		aux_aquario[0][0] = 'A';
		aux_aquario[1][0] = 'A';
		aux_aquario[0][1] = 'A';
		aux_aquario[1][1] = ' ';
		
		aquario.setAquario(aux_aquario);
				
		aquario.movimentaA(1, 0, 0);		
	}
	
	@Test
	void testDef_movA5_peixesA() {
		Aquario aquario = new Aquario(2, 2, 0, 0, 1, 1);
		aquario.inicializar(1, 0);
		
		char [][] aux_aquario = aquario.getAquario();
		aux_aquario[0][0] = 'A';
		aux_aquario[1][0] = 'A';
		aux_aquario[0][1] = 'A';
		aux_aquario[1][1] = 'A';
		
		aquario.setAquario(aux_aquario);
				
		aquario.movimentaA(1, 0, 0);		
	}
	
	@Test
	void testDef_movA6_peixesA() {
		Aquario aquario = new Aquario(2, 2, 0, 0, 2, 1);
		aquario.inicializar(1, 0);
		
		char [][] aux_aquario = aquario.getAquario();
		aux_aquario[0][0] = 'A';
		aux_aquario[1][0] = 'A';
		aux_aquario[0][1] = 'A';
		aux_aquario[1][1] = 'A';
		
		aquario.setAquario(aux_aquario);
				
		aquario.movimentaA(1, 0, 0);		
	}
}
