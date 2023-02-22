package control;

import javax.swing.JButton;

public class Mybutton extends JButton {
	private Coordenada coordenada;

	public Mybutton(Coordenada coordenada) {
		super("");
		this.coordenada = coordenada;
	}

	public Coordenada getCoordenada() {
		return coordenada;
	}
	
	
}
