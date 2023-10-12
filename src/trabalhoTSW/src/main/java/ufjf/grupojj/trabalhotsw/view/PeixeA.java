package ufjf.grupojj.trabalhotsw.view;

public class PeixeA {

    char id;
    //variáveris para guardar posição dos peixes na matriz.
    int posicao_x;
    int posicao_y;
    //número de vezes que se movimentam em seguida.
    int ra;
    //número de vezes que não se movimentam.
    int ma;

    public PeixeA() {
        this.id = ' ';
    }

    public PeixeA(char id, int posicao_x, int posicao_y) {
        this.id = id;
        this.posicao_x = posicao_x;
        this.posicao_y = posicao_y;
        this.ra = 0;
        this.ma = 0;
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

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }
    
    
}
