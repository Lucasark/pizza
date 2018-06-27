import java.util.List;
import java.util.Scanner;
//import java.util.Arrays;
//import java.util.ArrayList;

public class Estadio{
	
	private String nomeEstadio;
	private int LugarDireito;
	private int LugarEsquerdo;
	private int Centro;
	private int Superior;
	
	public Estadio() {
		return;
	}
	
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
	
	public Estadio leEstadio() {
		System.out.println("Nome do Estadio:");
		String nomeEstadio = new Scanner(System.in).next();
		System.out.println("Lugar Esquerdo:");
		int lugarEsquerdo = new Scanner(System.in).nextInt();
		System.out.println("Lugar Direito:");
		int lugarDireito = new Scanner(System.in).nextInt();
		System.out.println("Centro:");
		int Centro = new Scanner(System.in).nextInt();
		System.out.println("Superior:");
		int Superior = new Scanner(System.in).nextInt();
		Estadio estadio = new Estadio(nomeEstadio, lugarDireito, lugarEsquerdo, Centro, Superior);
		return estadio;
	}
	
	public void imprimirEstadio() {
		
	}
	
}