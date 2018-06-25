package br.com.trab.compra.ingresso.dto;

import java.util.ArrayList;
import java.util.Arrays;

public class EstadioMaracanaDTO extends EstadioDTO {
	
	private ArrayList<Double> precosLugares = new ArrayList<>(Arrays.asList(250.00, 150.00, 450.00));

	public EstadioMaracanaDTO(String nomeEstadio, int capacidade) {
		super(nomeEstadio, capacidade);
		nomeEstadio = "Maracanã";
		capacidade = 75000;
		
	}
	
	public ArrayList<Double> getPrecosLugares() {
		return precosLugares;
	}

	public void setPrecosLugares(ArrayList<Double> precosLugares) {
		this.precosLugares = precosLugares;
	}

}
