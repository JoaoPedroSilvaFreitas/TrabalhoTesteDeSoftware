package ufjf.grupojj.trabalhotsw.test;

//import org.junit.jupiter.api.Test;

import ufjf.grupojj.trabalhotsw.view.Aquario;

import org.junit.Test;

class AquarioTestGrafoDefUso {

// METODO INICIALIZAR ----------------------------------------------
// Todas difinicoes
	
	@Test
	void testDef_ini_quantPeixesA() {
		Aquario aquario = new Aquario(3, 3, 1, 1, 1, 1);
		aquario.inicializar(0, 0);
	}
	
	@Test
	void testDef_ini_quantPeixesB() {
		Aquario aquario = new Aquario(4, 4, 2, 2, 2, 2);
		aquario.inicializar(0, 0);
	}
	
	@Test
	void testDef_ini_rand() {
		Aquario aquario = new Aquario(4, 4, 1, 1, 1, 1);
		aquario.inicializar(0, 0);
	}
	
	@Test
	void testDef_ini_i() {
		Aquario aquario = new Aquario(1, 1, 1, 1, 1, 1);
		aquario.inicializar(0, 0);
	}
	
	@Test
	void testDef_ini_j() {
		Aquario aquario = new Aquario(4, 4, 2, 2, 2, 2);
		aquario.inicializar(0, 0);
	}
	

	@Test
	void testDef_ini_x() {
		Aquario aquario = new Aquario(3, 3, 0, 0, 0, 0);
		aquario.inicializar(2, 2);
	}
	
	@Test
	void testDef_ini_y() {
		Aquario aquario = new Aquario(5, 5, 0, 0, 0, 0);
		aquario.inicializar(5, 5);
	}
	
	@Test
	void testDef_ini_peixe() {
		Aquario aquario = new Aquario(5, 5, 1, 1, 1, 1);
		aquario.inicializar(12, 12);
	}
	
	@Test
	void testDef_ini_peixesA() {
		Aquario aquario = new Aquario(4, 4, 0, 0, 0, 0);
		aquario.inicializar(8, 0);
	}
	
	@Test
	void testDef_ini_peixesB() {
		Aquario aquario = new Aquario(4, 4, 0, 0, 8, 8);
		aquario.inicializar(0, 2);
	}
	
// Todos p-usos
	
	@Test
	void testPuso_ini_i() {
		Aquario aquario = new Aquario(1, 1, 2, 2, 2, 2);
		aquario.inicializar(0, 0);
	}
	
	@Test
	void testPuso_ini_j() {
		Aquario aquario = new Aquario(5, 5, 2, 3, 2, 3);
		aquario.inicializar(0, 0);
	}
	
	@Test
	void testPuso_ini_quantPeixesA() {
		Aquario aquario = new Aquario(2, 2, 0, 0, 0, 0);
		aquario.inicializar(0, 0);
	}
	
	@Test
	void testPuso_ini_quantPeixesB() {
		Aquario aquario = new Aquario(3, 3, 1, 1, 2, 2);
		aquario.inicializar(0, 0);
	}
	
	@Test
	void testPuso_ini_aquario() {
		Aquario aquario = new Aquario(5, 5, 1, 2, 3, 4);
		aquario.inicializar(12, 12);
	}
	
// Todos c-usos
	
	@Test
	void testCuso_ini_i() {
		Aquario aquario = new Aquario(7, 7, 0, 0, 0, 0);
		aquario.inicializar(10, 10);
	}
	
	@Test
	void testCuso_ini_j() {
		Aquario aquario = new Aquario(7, 7, 0, 0, 0, 0);
		aquario.inicializar(15, 20);
	}
	
//METODO MOVIMENTA A ----------------------------------------------
// Todas difinicoes
	
	@Test
<<<<<<< HEAD
	public void testDef_movA1_peixesA() {
=======
	void testDef_movA_x() {
		Aquario aquario = new Aquario(3, 3, 0, 0, 0, 0);
		aquario.inicializar(6, 3);
		aquario.movimentaA(2, 2, 0);	
	}
	
	@Test
	void testDef_movA_y() {
		Aquario aquario = new Aquario(4, 4, 0, 0, 0, 0);
		aquario.inicializar(8, 8);
		aquario.movimentaA(0, 0, 1);
	}
	
	@Test
	void testDef_movA_i() {
		Aquario aquario = new Aquario(2, 2, 0, 1, 1, 0);
		aquario.inicializar(2, 2);
		aquario.movimentaA(0, 1, 1);
	}
	
	@Test
	void testDef_movA1_peixesA() {
>>>>>>> ed52d83d4cfb2ca6c5466c809bc03a02ebc9d30c
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
	public void testDef_movA2_peixesA() {
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
	public void testDef_movA3_peixesA() {
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
	public void testDef_movA4_peixesA() {
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
	public void testDef_movA5_peixesA() {
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
	public void testDef_movA6_peixesA() {
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

	@Test
	void testDef_movA1_aquario() {
		Aquario aquario = new Aquario(2, 2, 2, 5, 7, 1);
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
	void testDef_movA2_aquario() {
		Aquario aquario = new Aquario(2, 2, 2, 5, 2, 7);
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
	void testDef_movA3_aquario() {
		Aquario aquario = new Aquario(2, 2, 0, 4, 2, 0);
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
	void testDef_movA4_aquario() {
		Aquario aquario = new Aquario(2, 2, 0, 6, 1, 0);
		aquario.inicializar(3, 0);
		
		char [][] aux_aquario = aquario.getAquario();
		aux_aquario[0][0] = 'A';
		aux_aquario[1][0] = 'A';
		aux_aquario[0][1] = 'A';
		aux_aquario[1][1] = 'A';
		
		aquario.setAquario(aux_aquario);
				
		aquario.movimentaA(1, 0, 0);		
	}
	
	@Test
	void testDef_movA5_aquario() {
		Aquario aquario = new Aquario(2, 2, 3, 1, 1, 0);
		aquario.inicializar(3, 0);
		
		char [][] aux_aquario = aquario.getAquario();
		aux_aquario[0][0] = 'A';
		aux_aquario[1][0] = 'A';
		aux_aquario[0][1] = ' ';
		aux_aquario[1][1] = 'A';
		
		aquario.setAquario(aux_aquario);
				
		aquario.movimentaA(0, 0, 0);		
	}
	
	@Test
	void testDef_movA_auxMa() {
		Aquario aquario = new Aquario(2, 2, 1, 1, 1, 0);
		aquario.inicializar(3, 1);
		
		char [][] aux_aquario = aquario.getAquario();
		aux_aquario[0][0] = 'A';
		aux_aquario[1][0] = 'A';
		aux_aquario[0][1] = ' ';
		aux_aquario[1][1] = 'A';
		
		aquario.setAquario(aux_aquario);
				
		aquario.movimentaA(0, 1, 0);		
	}
	
////Todos P-Usos	

	@Test
	void testPuso_movA_x() {
		Aquario aquario = new Aquario(3, 3, 2, 1, 3, 1);
		aquario.inicializar(8, 1);
		aquario.movimentaA(2, 2, 0);		
	}
	
	@Test
	void testPuso_movA_y() {
		Aquario aquario = new Aquario(3, 3, 2, 2, 3, 1);
		aquario.inicializar(5, 4);
		aquario.movimentaA(1, 2, 1);		
	}
	
	@Test
	void testPuso_movA_aquario() {
		Aquario aquario = new Aquario(4, 5, 0, 1, 3, 1);
		aquario.inicializar(12, 8);
		aquario.movimentaA(2, 3, 2);		
	}
	
	@Test
	void testPuso_movA_ma() {
		Aquario aquario = new Aquario(4, 5, 0, 2, 1, 1);
		aquario.inicializar(12, 0);
		aquario.movimentaA(3, 4, 3);		
	}
	
	@Test
	void testPuso_movA_auxMa() {
		Aquario aquario = new Aquario(2, 3, 1, 5, 1, 1);
		aquario.inicializar(6, 0);
		aquario.movimentaA(1, 1, 0);		
	}
	
//// Todos c-usos	
	
	@Test
	void testCuso_movA_x() {
		Aquario aquario = new Aquario(2, 3, 0, 1, 1, 0);
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
	void testCuso_movA_y() {
		Aquario aquario = new Aquario(3, 2, 2, 1, 2, 0);
		aquario.inicializar(1, 0);
		
		char [][] aux_aquario = aquario.getAquario();
		aux_aquario[0][0] = 'A';
		aux_aquario[1][0] = ' ';
		aux_aquario[0][1] = ' ';
		aux_aquario[1][1] = ' ';
		aquario.setAquario(aux_aquario);
				
		aquario.movimentaA(0, 0, 0);		
	}
	
}
