public class Estadio{
	
	private String nomeEstadio;
	private int LugarDireito;
	private int LugarEsquerdo;
	private int Centro;
	private int Superior;
	
	public String getNomeEstadio() {
		return nomeEstadio;
	}


	public int getLugarDireito() {
		return LugarDireito;
	}


	public int getLugarEsquerdo() {
		return LugarEsquerdo;
	}


	public int getCentro() {
		return Centro;
	}


	public int getSuperior() {
		return Superior;
	}

	
	public Estadio(String nomeEstadio, int LugarDireito, int LugarEsquerdo, int Centro, int Superior) {
		this.nomeEstadio = nomeEstadio;
		this.LugarDireito = LugarDireito;
		this.LugarEsquerdo = LugarEsquerdo;
		this.Centro = Centro;
		this.Superior = Superior;
	}
	
}