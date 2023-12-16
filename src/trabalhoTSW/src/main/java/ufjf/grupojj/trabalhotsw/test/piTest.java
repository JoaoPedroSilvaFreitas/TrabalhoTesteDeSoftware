package ufjf.grupojj.trabalhotsw.test;

import org.junit.Test;

import ufjf.grupojj.trabalhotsw.view.Aquario;
import ufjf.grupojj.trabalhotsw.view.main;

import static org.junit.Assert.*;

public class piTest {

	@Test
	public void pitest01() {
		Aquario aquario = new Aquario(10, 10, 3, 3, 3, 3);
		aquario.inicializar(50, 50);
		aquario.atualizarAquario();
	}


	@Test
	public void pitest02() {
		Aquario aquario = new Aquario(10, 10, 3, 3, 3, 3);
		aquario.inicializar(50, 1);
		aquario.atualizarAquario();
	}
	
	@Test
	public void pitest03() {
		Aquario aquario = new Aquario(10, 10, 3, 3, 3, 3);
		aquario.inicializar(0, 0);
		aquario.atualizarAquario();
	}
	
	@Test
	public void pitest04() {
		Aquario aquario = new Aquario(10, 10, 3, 3, 3, 3);
		aquario.inicializar(-1, -1);
		aquario.atualizarAquario();
	}
	
	@Test
	public void pitest05() {
		Aquario aquario = new Aquario(10, 10, 3, 3, 3, 3);
		aquario.inicializar(50, -1);
		aquario.atualizarAquario();
	}
	
	@Test
	public void pitest06() {
		Aquario aquario = new Aquario(10, 10, 3, 3, 3, 3);
		aquario.inicializar(-1, 50);
		aquario.atualizarAquario();
	}
	
	
	@Test
	public void pitest10() {
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
	public void pitest11() {
		Aquario aquario = new Aquario(9, 9, 3, 3, 3, 3);
		aquario.inicializar(10, 0);
		aquario.movimentaA(0, 0, 0);
		aquario.movimentaA(0, 8, 1);
		aquario.movimentaA(8, 8, 2);
		aquario.movimentaA(8, 0, 3);
		aquario.movimentaA(5, 5, 4);
		aquario.movimentaA(1, 8, 5);
		aquario.movimentaA(2, 8, 6);
		aquario.movimentaA(3, 8, 7);
		aquario.movimentaA(4, 8, 8);
	}
	
	@Test
	public void pitest12() {
		Aquario aquario = new Aquario(9, 9, 3, 3, 3, 3);
		aquario.inicializar(10, 10);
		aquario.movimentaA(0, 0, 0);
		aquario.movimentaA(0, 8, 1);
		aquario.movimentaA(8, 8, 2);
		aquario.movimentaA(8, 0, 3);
		aquario.movimentaA(5, 5, 4);
		aquario.movimentaA(1, 8, 5);
		aquario.movimentaA(2, 8, 6);
		aquario.movimentaA(3, 8, 7);
		aquario.movimentaA(4, 8, 8);
		aquario.movimentaB(0, 0, 0);
		aquario.movimentaB(0, 8, 1);
		aquario.movimentaB(8, 8, 2);
		aquario.movimentaB(8, 0, 3);
		aquario.movimentaB(5, 5, 4);
		aquario.movimentaB(1, 8, 5);
		aquario.movimentaB(2, 8, 6);
		aquario.movimentaB(3, 8, 7);
		aquario.movimentaB(4, 8, 8);
		aquario.printAquario();
	}
	
	@Test
	public void pitest13() {
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
	public void pitest14() {
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
	public void pitest15() {
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
