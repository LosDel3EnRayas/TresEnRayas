package control;

public class GestionDatos {
	private Tablero tablero=new Tablero();
	private int numerojugada = 1;
	/**
	 * Informa de quien es el turno actual
	 * 
	 * @return 1 o 0 dependiendo de quien sea el propietario del turno
	 */
	public int verTurno() {
		if (numerojugada % 2 == 0)
			return 2;
		return 1;

	}
	/**
	 * Incrementa el turno
	 */
	public void incrementarTurno() {
		this.numerojugada += 1;
	}
	
	
	public void jugarPosicion(Coordenada coordenada, int i) {
		tablero.setValorPosicion(coordenada, i);
	}
}

