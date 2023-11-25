package ufjf.grupojj.trabalhotsw.view;

public class NegativeValueException extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NegativeValueException() {
        super("[ERRO] Valores Negativos não são válidos!");
    }
}