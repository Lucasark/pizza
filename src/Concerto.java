import java.util.Scanner;

public class Concerto {
	private String NomeBanda;
	private String NomeTurne;
	
	public Concerto() {
		return;
	}
	public Concerto(String nomeBanda, String nomeTurne) {
		this.NomeBanda = nomeBanda;
		this.NomeTurne = nomeTurne;
	}

	public String getNomeBanda() {
		return NomeBanda;
	}

	public void setNomeBanda(String nomeBanda) {
		this.NomeBanda = nomeBanda;
	}

	public String getNomeTurne() {
		return NomeTurne;
	}

	public void setNomeTurne(String nomeTurne) {
		this.NomeTurne = nomeTurne;
	}
	
	public Concerto leConcerto() {
		System.out.println("Nome da Banda:");
		String nomeBanda = new Scanner(System.in).next();
		System.out.println("Nome Turne:");
		String nomeTurne = new Scanner(System.in).next();
		Concerto concerto = new Concerto(nomeBanda, nomeTurne);
		return concerto;
	}
	
	public void imprimirConcerto() {
		System.out.printf(this.NomeBanda + " - " +
		          this.NomeTurne + "\n");
        return;
	}
}