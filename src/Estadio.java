public class Estadio {
	
	private String nomeEstadio;
	public String getNomeEstadio() {
		return nomeEstadio;
	}

	public void setNomeEstadio(String nomeEstadio) {
		this.nomeEstadio = nomeEstadio;
	}

	public int getLugarDireito() {
		return LugarDireito;
	}

	public void setLugarDireito(int lugarDireito) {
		LugarDireito = lugarDireito;
	}

	public int getLugarEsquerdo() {
		return LugarEsquerdo;
	}

	public void setLugarEsquerdo(int lugarEsquerdo) {
		LugarEsquerdo = lugarEsquerdo;
	}

	public int getCentro() {
		return Centro;
	}

	public void setCentro(int centro) {
		Centro = centro;
	}

	public int getSuperior() {
		return Superior;
	}

	public void setSuperior(int superior) {
		Superior = superior;
	}

	private int LugarDireito;
	private int LugarEsquerdo;
	private int Centro;
	private int Superior;
	
	public Estadio(String nomeEstadio, int LugarDireito, int LugarEsquerdo, int Centro, int Superior) {
		super();
		this.nomeEstadio = nomeEstadio;
		this.LugarDireito = LugarDireito;
		this.LugarEsquerdo = LugarEsquerdo;
		this.Centro = Centro;
		this.Superior = Superior;
	}
	
}