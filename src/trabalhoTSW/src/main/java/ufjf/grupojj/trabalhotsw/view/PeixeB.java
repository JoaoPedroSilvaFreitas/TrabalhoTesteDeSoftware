package ufjf.grupojj.trabalhotsw.view;

public class PeixeB {

    char id;
    //variáveris para guardar posição dos peixes na matriz.
    int posicao_x;
    int posicao_y;
    //número de peixes comidos.
    int rb;
    //número de vezes sem comer nenhum peixe.
    int mb;

    public PeixeB() {
        this.id = ' ';
    }

    public PeixeB(char id, int posicao_x, int posicao_y) {
        this.id = id;
        this.posicao_x = posicao_x;
        this.posicao_y = posicao_y;
        this.rb = 0;
        this.mb = 0;
    }

    public char getId() {
        return id;
    }

    public void setId(char id) {
        this.id = id;
    }

    public int getPosicao_x() {
        return posicao_x;
    }

    public void setPosicao_x(int posicao_x) {
        this.posicao_x = posicao_x;
    }

    public int getPosicao_y() {
        return posicao_y;
    }

    public void setPosicao_y(int posicao_y) {
        this.posicao_y = posicao_y;
    }

    public int getRb() {
        return rb;
    }

    public void setRb(int rb) {
        this.rb = rb;
    }

    public int getMb() {
        return mb;
    }

    public void setMb(int mb) {
        this.mb = mb;
    }
    
    
}
