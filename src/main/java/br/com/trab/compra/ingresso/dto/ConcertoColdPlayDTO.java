package br.com.trab.compra.ingresso.dto;



public class ConcertoColdPlayDTO extends ConcertoDTO {

	public ConcertoColdPlayDTO(String nomeBanda, String nomeTurne) {
		super(nomeBanda, nomeTurne);
		nomeBanda = "ColdPlay";
		nomeTurne = "A Head Full of Dreams";
	}
	
}
