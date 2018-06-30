package br.com.trabOO.memoria;
import java.util.Scanner;

public class Lugar {
	private String TipoLugar;
	private int qtd;
	Scanner input = new Scanner(System.in);
	
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
		String tipoLugar = input.nextLine();
		System.out.println("Quantidade:");
		int qtd = input.nextInt();
		Lugar lugar = new Lugar(tipoLugar, qtd);
		return lugar;
	}
	
	public void imprimirLugar() {
		System.out.println(this.TipoLugar + " - " + 
						   this.qtd + "\n");
		return;
	}
	
}
