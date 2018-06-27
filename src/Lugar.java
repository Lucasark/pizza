import java.util.Scanner;

public class Lugar {
	private String TipoLugar;
	private int qtd;
	
	public Lugar() {
		return;
	}
	
	public String getTipoLugar() {
		return TipoLugar;
	}

	public int getqtd() {
		return qtd;
	}
	

	Lugar(String tipoLugar, int qtd) {
		this.TipoLugar = tipoLugar;
		this.qtd = qtd;
	}
	
	public Lugar leLugar() {
		System.out.println("Tipo do Lugar:");
		String tipoLugar = new Scanner(System.in).next();
		System.out.println("Quantidade:");
		int qtd = new Scanner(System.in).nextInt();
		Lugar lugar = new Lugar(tipoLugar, qtd);
		return lugar;
	}
	
	public void imprimirLugar() {
		System.out.println("Escolha um estadio digitando um numero: ");
		System.out.println(this.TipoLugar + " - " + 
						   this.qtd + "\n");
		return;
	}
	
}
