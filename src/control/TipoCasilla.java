package control;

public class TipoCasilla {
	private String[] tipos = {"X","O"};

	public String getTipo(int turno) {
		if(turno == 1) return tipos[0];
		else return tipos[1];
	}

}
