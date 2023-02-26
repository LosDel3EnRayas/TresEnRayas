package control;

public class Juego {
	private boolean mover;
	private boolean existsBotonAnterior;
	private Mybutton botonAnterior;
	private Mybutton botonActual;
	
	
	
	public Juego() {
		super();
		this.mover = false;
		this.existsBotonAnterior = false;
	}

	public boolean getMover() {
		return mover;
	}
	
	public void setMover(boolean state) {
		this.mover = state;
	}
	

	public Mybutton getBotonAnterior() {
		return botonAnterior;
	}
	
	public void setBotonAnterior(Mybutton botonAnterior) {
		this.botonAnterior = botonAnterior;
	}

	public Mybutton getBotonActual() {
		return botonActual;
	}

	public void setBotonActual(Mybutton botonActual) {
		this.botonActual = botonActual;
	}
	
	public boolean existsBotonAnterior() {
		return existsBotonAnterior;
	}

	public void setExistsBotonAnterior(boolean existsBotonAnterior) {
		this.existsBotonAnterior = existsBotonAnterior;
	}
	

}
