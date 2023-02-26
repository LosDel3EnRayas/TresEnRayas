package control;

import javax.swing.JButton;

public class Mybutton extends JButton {
	private Coordenada coordenada;

	public Mybutton(String coordenada) {
		super("");
		String[] coords = coordenada.split(":");
		this.coordenada = new Coordenada(Integer.parseInt(coords[0]),Integer.parseInt(coords[1]));
	}

	public Coordenada getCoordenada() {
		return coordenada;
	}
	
	
}
