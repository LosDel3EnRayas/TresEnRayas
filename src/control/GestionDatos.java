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
	
	public boolean comprobarJugada(Coordenada coordenada, int i) {
		int ficha = tablero.getValorPosicion(coordenada);
		
		if(ficha == 0) {
			jugarPosicion(coordenada, i);
			return true;
		}
		return false;

	}
	
	public void jugarPosicion(Coordenada coordenada, int i) {
		tablero.setValorPosicion(coordenada, i);
		tablero.mostrarTablero();
	}
	
	/* Comprobar si la posicion es valida */
	public boolean comprobarVictoria() {
		if(tablero.comprobarTresEnRaya()) {
			return true;
		}
		return false;
	}
	
	public int getTurno() {
		return this.numerojugada;
	}
	
	public String getCasilla(Coordenada coordenadas) {
		
		int num = tablero.getValorPosicion(coordenadas); 
		switch(num) {
		case 1:
			return "X";
		case 2:
			return "O";
		case 0:
			return null;
		default:
			return null;
		}
	}
	
	public boolean comprobarBloqueos(Coordenada coordenadas) {
		return tablero.comprobarBloqueada(coordenadas);
	}
	
	public boolean comprobarPosicionValida(Coordenada coordenadas, Coordenada destino) {
		System.out.println("coords: " + coordenadas);
		System.out.println("destino: " + destino);
		return coordenadas.casillaContigua(destino) && tablero.mirarCasillaLibre(destino);
	}
	
}

