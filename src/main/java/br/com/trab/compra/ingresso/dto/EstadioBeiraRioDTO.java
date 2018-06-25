package br.com.trab.compra.ingresso.dto;

import java.util.ArrayList;
import java.util.Arrays;

public class EstadioBeiraRioDTO extends EstadioDTO {

	private ArrayList<Double> precosLugares = new ArrayList<>(Arrays.asList(300.00, 230.00, 120.00));
	

	public EstadioBeiraRioDTO(String nomeEstadio, int capacidade) {
		super(nomeEstadio, capacidade);
		nomeEstadio = "Beira Rio";
		capacidade = 55000;
	}
	
	public ArrayList<Double> getPrecosLugares() {
		return precosLugares;
	}

	public void setPrecosLugares(ArrayList<Double> precosLugares) {
		this.precosLugares = precosLugares;
	}
	
}
