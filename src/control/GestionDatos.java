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
	
	
	public boolean jugarPosicion(Coordenada coordenada, int i) {
		int ficha = tablero.getValorPosicion(coordenada);
		
		if(ficha == 0) {
			tablero.setValorPosicion(coordenada, i);
			if(tablero.comprobarTresEnRaya()) {
				System.out.println("TERMINADO"); 
			}
			tablero.mostrarTablero();
			return true;
		}
		return false;

	}
	
	/* Comprobar si la posicion es valida */
	public boolean comprobarCasilla() {
		return false;
	}
}

