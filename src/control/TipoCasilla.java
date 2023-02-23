package control;

public class TipoCasilla {
	private String[] tipos = {"X","O"};

	public String getTipo(int turno) {
		if(turno == 1) return tipos[1];
		else return tipos[0];
	}
}
