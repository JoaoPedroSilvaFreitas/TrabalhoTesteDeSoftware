package ufjf.grupojj.trabalhotsw.test;

import org.junit.Test;

import ufjf.grupojj.trabalhotsw.view.Aquario;
import ufjf.grupojj.trabalhotsw.view.PeixeA;
import ufjf.grupojj.trabalhotsw.view.PeixeB;
import ufjf.grupojj.trabalhotsw.view.main;

import static org.junit.Assert.*;

public class piTest {

	@Test
	public void pitest01() {
		Aquario aquario = new Aquario(10, 10, 3, 3, 3, 3);
		aquario.inicializar(50, 50);
		aquario.atualizarAquario();
		aquario.printAquario();
	}


	@Test
	public void pitest02() {
		Aquario aquario = new Aquario(10, 10, 3, 3, 3, 3);
		aquario.inicializar(50, 1);
		aquario.atualizarAquario();
		aquario.printAquario();
	}
	
	@Test
	public void pitest03() {
		Aquario aquario = new Aquario(10, 10, 3, 3, 3, 3);
		aquario.inicializar(0, 0);
		aquario.atualizarAquario();
		aquario.printAquario();
	}
	
	@Test
	public void pitest04() {
		Aquario aquario = new Aquario(10, 10, 3, 3, 3, 3);
		aquario.inicializar(-1, -1);
		aquario.atualizarAquario();
		aquario.printAquario();
	}
	
	@Test
	public void pitest05() {
		Aquario aquario = new Aquario(10, 10, 3, 3, 3, 3);
		aquario.inicializar(50, -1);
		aquario.atualizarAquario();
		aquario.printAquario();
	}
	
	@Test
	public void pitest06() {
		Aquario aquario = new Aquario(10, 10, 3, 3, 3, 3);
		aquario.inicializar(-1, 50);
		aquario.atualizarAquario();
		aquario.printAquario();
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
		
		aquario.printAquario();
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
		
		aquario.printAquario();
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
		
		aquario.printAquario();
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
		
		aquario.printAquario();
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
		
		aquario.printAquario();
	}
	
	
	public void pitest16() {
		Aquario aquario = new Aquario(5, 5, 3, 3, 3, 3);
		aquario.inicializar(5,5);
		
		
		aquario.getPeixesA();
		aquario.getPeixesB();
		
		aquario.getAquario();
		aquario.printAquario();
		
		aquario.getDim_x();
		aquario.setDim_x(10);
		aquario.getDim_y();
		aquario.setDim_y(10);
		
		aquario.getAquario();
		
		aquario.printAquario();
	}
	
	
	public void pitest17() {
		Aquario aquario = new Aquario(5, 5, 3, 3, 3, 3);
		aquario.inicializar(0,1);
		aquario.movimentaA(0, 0, 0);
		aquario.atualizaPosMovimentoB(0, 0, 0);
		aquario.movimentaA(1, 1, 1);
		aquario.atualizaPosMovimentoB(1, 1, 1);
		
	}
	
	 @Test
	    public void pitest18() {
	        Aquario aquario = new Aquario(5, 5, 3, 3, 3, 3);

	        PeixeB peixeB = new PeixeB('B');
	        peixeB.setMb(aquario.getMb());

	        aquario.getPeixesB().add(peixeB);

	        aquario.atualizaPosMovimentoB(0, 0, 0);

	        //assertEquals(0, aquario.getPeixesB().size());
	    }

	    @Test
	    public void pitest19() {
	        Aquario aquario = new Aquario(5, 5, 3, 3, 3, 3);

	        PeixeB peixeB = new PeixeB('B');
	        peixeB.setRb(aquario.getRb());

	        aquario.getPeixesB().add(peixeB);

	        aquario.atualizaPosMovimentoB(0, 0, 0);

	        //assertEquals(2, aquario.getPeixesB().size());
	    }
	    
	    
	    
	    @Test
	    public void pitest20() {
	        Aquario aquario = new Aquario(5, 5, 3, 3, 3, 3);
	        aquario.getAquario()[1][1] = 'A';
	        PeixeA peixeA = new PeixeA('A',0,0);
	        peixeA.setPosicao_x(1);
	        peixeA.setPosicao_y(1);
	        aquario.getPeixesA().add(peixeA);
	        aquario.movimentaA(1, 1, 0);
	    }

	    @Test
	    public void pitest21() {
	        Aquario aquario = new Aquario(5, 5, 3, 3, 3, 3);

	        aquario.getAquario()[1][1] = 'A';
	        aquario.getAquario()[0][1] = 'B';
	        aquario.getAquario()[2][1] = 'B';
	        aquario.getAquario()[1][0] = 'B';
	        aquario.getAquario()[1][2] = 'B';
	        PeixeA peixeA = new PeixeA('A',0,0);
	        peixeA.setPosicao_x(1);
	        peixeA.setPosicao_y(1);
	        aquario.getPeixesA().add(peixeA);
	        aquario.movimentaA(1, 1, 0);
	    }

	    @Test
	    public void pitest22() {
	        Aquario aquario = new Aquario(5, 5, 3, 3, 3, 3);
	        
	        aquario.getAquario()[1][1] = 'A';
	        PeixeA peixeA = new PeixeA('A',0,0);
	        peixeA.setPosicao_x(1);
	        peixeA.setPosicao_y(1);
	        peixeA.setMa(aquario.getMa() - 1);
	        aquario.getPeixesA().add(peixeA);
	        aquario.movimentaA(1, 1, 0);
	    }

	    
	    public void pitest23() {
	        Aquario aquario = new Aquario(5, 5, 3, 3, 3, 3);
	        aquario.getAquario()[aquario.getDim_x() - 1][aquario.getDim_y() - 1] = ' ';
	        PeixeB peixeB = new PeixeB('B');
	        peixeB.setRb(aquario.getRb());
	        aquario.getPeixesB().add(peixeB);
	        aquario.atualizaPosMovimentoB(aquario.getDim_x() - 1, aquario.getDim_y() - 1, 0);
	    }
	    
	    public void pitest24() {
	        Aquario aquario = new Aquario(5, 5, 3, 3, 3, 3);
	        aquario.getAquario()[aquario.getDim_x() - 1][aquario.getDim_y() - 1] = ' ';
	        PeixeA peixeA = new PeixeA('A');
	        peixeA.setRa(aquario.getRa());
	        aquario.getPeixesA().add(peixeA);
	        aquario.atualizaPosMovimentoA(aquario.getDim_x() - 1, aquario.getDim_y() - 1, 0);
	    }
	    
	    
	    @Test
	    public void pitest25() {
	        Aquario aquario = new Aquario(5, 5, 3, 3, 3, 3);
	        aquario.getAquario()[aquario.getDim_x() - 1][aquario.getDim_y() - 1] = 'B';
	        PeixeB peixeB = new PeixeB('B');
	        peixeB.setMb(aquario.getMb()); 
	        aquario.getPeixesB().add(peixeB);
	        aquario.atualizaPosMovimentoB(aquario.getDim_x() - 1, aquario.getDim_y() - 1, 0);

	    }
	    
	    
	    @Test
	    public void pitest26() {
	        Aquario aquario = new Aquario(5, 5, 3, 3, 3, 3);

	        aquario.getAquario()[1][1] = 'A';
	        aquario.getAquario()[0][1] = 'B';
	        aquario.getAquario()[2][1] = 'B';
	        aquario.getAquario()[1][0] = 'B';
	        aquario.getAquario()[1][2] = 'B';
	        PeixeA peixeA = new PeixeA('A');
	        peixeA.setPosicao_x(1);
	        peixeA.setPosicao_y(1);
	        aquario.getPeixesA().add(peixeA);
	        aquario.movimentaA(1, 1, 0);

	    }
	    
	    @Test
	    public void pitest27() {
	        Aquario aquario = new Aquario(5, 5, 3, 3, 3, 3);

	        aquario.getAquario()[1][1] = 'B';
	        aquario.getAquario()[0][1] = 'B';
	        aquario.getAquario()[2][1] = 'B';
	        aquario.getAquario()[1][0] = 'B';
	        aquario.getAquario()[1][2] = 'B';
	        PeixeB peixeB = new PeixeB('B');
	        peixeB.setPosicao_x(1);
	        peixeB.setPosicao_y(1);
	        aquario.getPeixesB().add(peixeB);
	        aquario.movimentaB(1, 1, 0);

	    }
	    
	    @Test
	    public void pitest28() {
	        Aquario aquario = new Aquario(5, 5, 3, 3, 3, 3);

	        PeixeB peixeB = new PeixeB('B',1,1);
	        peixeB.setRb(aquario.getRb());
	        aquario.getPeixesB().add(peixeB);
	        aquario.atualizaPosMovimentoB(1, 1, 0);

	    }
	    
	    @Test
	    public void pitest29() {
	        Aquario aquario = new Aquario(5, 5, 3, 3, 3, 3);

	        PeixeA peixeA = new PeixeA('A',1,1);
	        peixeA.setRa(aquario.getRa());
	        aquario.getPeixesA().add(peixeA);
	        aquario.atualizaPosMovimentoA(1, 1, 0);

	    }

	    
	    @Test
	    public void pitest30() {
	        Aquario aquario = new Aquario(5, 5, 3, 3, 3, 3);

	        PeixeA peixeA = new PeixeA('A',1,1);
	        peixeA.setRa(aquario.getRa());
	        aquario.getPeixesA().add(peixeA);
	        aquario.atualizaPosMovimentoA(1, 1, 0);
	        
	        PeixeB peixeB = new PeixeB('B',1,1);
	        peixeB.setRb(aquario.getRb());
	        aquario.getPeixesB().add(peixeB);
	        aquario.atualizaPosMovimentoB(1, 1, 0);

	    }
	    
	    //*/
}
