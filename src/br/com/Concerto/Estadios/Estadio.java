package br.com.Concerto.Estadios;

import java.util.ArrayList;

public class Estadio {
	
	private String nomeEstadio;
	private String capacidadeEstadio;
	// definir tipos de lugares de estadio. Na posi��o 0 lugar lateral esquerdo,
	// na posi��o 1 lugar lateral direita, na posi��o 2 lugar zona superior,
	// na posi��o 3 pista
	private ArrayList<Integer> qtdeLugar;
	private ArrayList<Double> precos;
	
	
	public ArrayList<Integer> getQtdeLugar() {
		return qtdeLugar;
	}

	public void setQtdeLugar(ArrayList<Integer> qtdeLugar) {
		this.qtdeLugar = qtdeLugar;
	}

	public ArrayList<Double> getPrecos() {
		return precos;
	}

	public void setPrecos(ArrayList<Double> precos) {
		this.precos = precos;
	}


	public String getNomeEstadio() {
		return nomeEstadio;
	}
	
	public void setNomeEstadio(String nomeEstadio) {
		this.nomeEstadio = nomeEstadio;
	}
	
	public String getCapacidadeEstadio() {
		return capacidadeEstadio;
	}
	
	public void setCapacidadeEstadio(String capacidadeEstadio) {
		this.capacidadeEstadio = capacidadeEstadio;
	}
	
}
