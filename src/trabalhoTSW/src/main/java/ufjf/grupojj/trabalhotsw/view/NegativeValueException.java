package ufjf.grupojj.trabalhotsw.view;

public class NegativeValueException extends Exception {
    public NegativeValueException() {
        super("[ERRO] Valores Negativos não são válidos!");
    }
}