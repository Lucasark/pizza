package br.com.trab.compra.ingresso.dto;

import java.util.ArrayList;
import java.util.Arrays;

public class EstadioMorumbiDTO extends EstadioDTO {
	
	private ArrayList<Double> precosLugares = new ArrayList<>(Arrays.asList(100.00, 250.00, 550.00));

	public EstadioMorumbiDTO(String nomeEstadio, int capacidade) {
		super(nomeEstadio, capacidade);
		nomeEstadio = "Morumbi";
		capacidade = 60000;
	}

	public ArrayList<Double> getPrecosLugares() {
		return precosLugares;
	}

	public void setPrecosLugares(ArrayList<Double> precosLugares) {
		this.precosLugares = precosLugares;
	}
	
	
	
}
