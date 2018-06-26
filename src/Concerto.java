public class Concerto {
	private String nomeBanda;
	private String nomeTurne;
	
	public Concerto(String nomeBanda, String nomeTurne) {
		this.nomeBanda = nomeBanda;
		this.nomeTurne = nomeTurne;
	}

	public String getNomeBanda() {
		return nomeBanda;
	}

	public void setNomeBanda(String nomeBanda) {
		this.nomeBanda = nomeBanda;
	}

	public String getNomeTurne() {
		return nomeTurne;
	}

	public void setNomeTurne(String nomeTurne) {
		this.nomeTurne = nomeTurne;
	}
}