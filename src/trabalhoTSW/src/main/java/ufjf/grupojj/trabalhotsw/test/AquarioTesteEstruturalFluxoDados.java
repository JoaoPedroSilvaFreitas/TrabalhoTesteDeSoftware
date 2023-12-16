package ufjf.grupojj.trabalhotsw.test;

//import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

import ufjf.grupojj.trabalhotsw.view.Aquario;
import ufjf.grupojj.trabalhotsw.view.main;

import org.junit.Test;

public class AquarioTesteEstruturalFluxoDados {

	@Test
	public void testeInicializa1(){//todos os arcos
		System.out.println("Teste 1");
		Aquario aquario = new Aquario(2,2,1,1,1,1);//cria aquario
		aquario.inicializar(2,2);//inicializa aquario			
		assertEquals(aquario.getPeixesA().size(),2);//verifica qtd peixes a = 2
		assertEquals(aquario.getPeixesB().size(),2);//verifica qtd peixes b = 2
	}
	
	@Test
	public void testeInicializa2(){//todos os nos
		System.out.println("Teste 2");
		Aquario aquario = new Aquario(2,2,1,1,1,1);//cria aquario
		aquario.inicializar(1,1);//inicializa aquario			
		assertEquals(aquario.getPeixesA().size(),1);//verifica qtd peixes a = 1
		assertEquals(aquario.getPeixesB().size(),1);//verifica qtd peixes b = 1
	}
	
	@Test
	public void testeMovimenta1(){//{1,3,5,7,9,10,11,13}
		System.out.println("Teste 1");
		Aquario aquario = new Aquario(2,2,1,1,1,1);//cria aquario
		aquario.inicializar(2,2);//inicializa aquario			
		aquario.movimentaA(1, 1, 1);
	}
	
	@Test
	public void testeAtualizaPosMov(){//{1,2,3}
		System.out.println("Teste 1");
		Aquario aquario = new Aquario(2,2,1,1,1,1);//cria aquario
		aquario.inicializar(2,2);//inicializa aquario			
		aquario.movimentaA(1, 1, 0);
		aquario.atualizaPosMovimentoA(1,1,0);
	}
	
	/*
	@Test
	public void testeVerificaFim1(){//{1,3,4,5,9}
		System.out.println("Teste 1");
		Aquario aquario = new Aquario(2,2,1,1,1,1);//cria aquario
		aquario.inicializar(2,2);//inicializa aquario			
		main.verificaFim(aquario.getPeixesB().size());
	}
	
	@Test
	public void testeVerificaFim2(){
		System.out.println("Teste 2");
		Aquario aquario = new Aquario(2,2,1,1,1,1);//cria aquario
		aquario.inicializar(2,2);//inicializa aquario			
		main.verificaFim(0);
	}
	
	@Test
	public void testeVerificaFim3(){
		System.out.println("Teste 3");
		Aquario aquario = new Aquario(2,2,1,1,1,1);//cria aquario
		aquario.inicializar(2,2);//inicializa aquario			
		main.verificaFim(aquario.getPeixesB().size());
	}*/
	
	@Test
	public void testeMovimentaA1() {
		Aquario aquario = new Aquario(9, 9, 3, 3, 3, 3);
		aquario.inicializar(1, 10);
		aquario.movimentaA(0, 0, 0);
		aquario.movimentaA(1, 1, 0);
		aquario.movimentaA(2, 2, 0);
		aquario.movimentaA(3, 3, 0);
		aquario.movimentaA(4, 4, 0);
		aquario.movimentaA(5, 5, 0);
		aquario.movimentaA(6, 6, 0);
		aquario.movimentaA(7, 7, 0);
		aquario.movimentaA(8, 8, 0);
	}
	
	@Test
	public void testeMovimentaA2() {
		Aquario aquario = new Aquario(5, 5, 3, 3, 1, 1);
		aquario.inicializar(2, 8);
		aquario.movimentaA(1, 0, 0);
		aquario.movimentaA(2, 1, 0);
		aquario.movimentaA(3, 2, 0);
		aquario.movimentaA(1, 3, 0);
		aquario.movimentaA(2, 4, 0);
		aquario.movimentaA(3, 0, 0);
		aquario.movimentaA(1, 1, 0);
		aquario.movimentaA(2, 2, 0);
		aquario.movimentaA(3, 3, 0);
	}
	
	@Test
	public void testeMovimentaA3() {
		Aquario aquario = new Aquario(5, 5, 3, 3, 3, 3);
		aquario.inicializar(10, 1);
		aquario.movimentaA(1, 0, 0);
		aquario.atualizaPosMovimentoA(1,0,0);
		aquario.atualizaPosMovimentoA(1,0,0);
		aquario.atualizaPosMovimentoA(1,0,0);
		aquario.atualizaPosMovimentoA(1,0,0);
		aquario.movimentaA(1, 0, 0);
	}
	
}
