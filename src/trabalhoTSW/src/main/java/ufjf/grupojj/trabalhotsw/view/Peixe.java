package ufjf.grupojj.trabalhotsw.view;

public class Peixe {

    char id;
    //variáveris para guardar posição dos peixes na matriz.
    int posicao_x;
    int posicao_y;

    public Peixe() {
        this.id = ' ';
    }

    public Peixe(char id, int posicao_x, int posicao_y) {
        this.id = id;
        this.posicao_x = posicao_x;
        this.posicao_y = posicao_y;
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
    
    
}
