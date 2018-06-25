package br.com.trab.compra.ingresso.dto;

import java.util.ArrayList;
import java.util.Arrays;

public class ConcertoDTO {
	
	/*
	 * Nome da Banda
	 */
	private String nomeBanda;
	
	/*
	 * Nome da Turne
	 */
	private String nomeTurne;
	
	/*
	 * Datas disponiveis
	 */
	private ArrayList<String> datasDisponiveis = new ArrayList<>(Arrays.asList("23/10/2018", "12/11/2018", "30/12/2018",
																			   "12/12/2018", "10/10/2018", "09/11/2018",
																			   "11/11/2018", "08/12/2018", "06/10/2018"));
	
	/*
	 * Cidades disponíveis
	 */
	private ArrayList<String> cidadesDisponiveis = new ArrayList<>(Arrays.asList("Rio de Janeiro", "Sao Paulo", "Porto Alegre"));
	
	public ConcertoDTO(String nomeBanda, String nomeTurne) {
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

	public ArrayList<String> getDatasDisponiveis() {
		return datasDisponiveis;
	}

	public void setDatasDisponiveis(ArrayList<String> datasDisponiveis) {
		this.datasDisponiveis = datasDisponiveis;
	}
	
	public ArrayList<String> getCidadesDisponiveis() {
		return cidadesDisponiveis;
	}

	public void setCidadesDisponiveis(ArrayList<String> cidadesDisponiveis) {
		this.cidadesDisponiveis = cidadesDisponiveis;
	}
	
	
}
