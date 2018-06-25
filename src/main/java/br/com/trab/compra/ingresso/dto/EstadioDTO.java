package br.com.trab.compra.ingresso.dto;

import java.util.ArrayList;
import java.util.Arrays;

public class EstadioDTO {
	
	/*
	 * Nome do Est�dio
	 */
	private String nomeEstadio;
	
	/*
	 * Capacidade do est�dio
	 */
	private int capacidade;
	
	/*
	 * Tipo de lugares, ser�o sempre superior, inferior e pista
	 */
	private ArrayList<String> tipoLugares = new ArrayList<>(Arrays.asList("superior", "inferior", "pista"));

	public EstadioDTO(String nomeEstadio, int capacidade) {
		super();
		this.nomeEstadio = nomeEstadio;
		this.capacidade = capacidade;
	}
	
	public String getNomeEstadio() {
		return nomeEstadio;
	}

	public void setNomeEstadio(String nomeEstadio) {
		this.nomeEstadio = nomeEstadio;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public ArrayList<String> getTipoLugares() {
		return tipoLugares;
	}

	public void setTipoLugares(ArrayList<String> tipoLugares) {
		this.tipoLugares = tipoLugares;
	}
}
