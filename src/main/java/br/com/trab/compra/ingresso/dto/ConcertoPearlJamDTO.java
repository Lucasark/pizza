package br.com.trab.compra.ingresso.dto;




public class ConcertoPearlJamDTO extends ConcertoDTO {
	
	public ConcertoPearlJamDTO(String nomeBanda, String nomeTurne) {
		super(nomeBanda, nomeTurne);
		nomeBanda = "Pearl Jam";
		nomeTurne = "Ten";
	}

}
