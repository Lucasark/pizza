package br.com.trab.compra.ingresso.service;

import br.com.trab.compra.ingresso.dto.ConcertoArcticMonkeysDTO;
import br.com.trab.compra.ingresso.dto.ConcertoColdPlayDTO;
import br.com.trab.compra.ingresso.dto.ConcertoPearlJamDTO;
import br.com.trab.compra.ingresso.dto.EstadioBeiraRioDTO;
import br.com.trab.compra.ingresso.dto.EstadioMaracanaDTO;
import br.com.trab.compra.ingresso.dto.EstadioMorumbiDTO;
import java.util.Scanner;

public class CompraService implements CompraServiceInterface {
	
	
	private int opcao;
	private String saida;
	
	
	
	private ConcertoArcticMonkeysDTO concertoA = new ConcertoArcticMonkeysDTO("ArcticMonkeys", "Tranquility Base Hotel and Casino");
	private ConcertoColdPlayDTO concertoB = new ConcertoColdPlayDTO("ColdPlay","A Head Full of Dreams");
	private ConcertoPearlJamDTO concertoC = new ConcertoPearlJamDTO("PearlJam", "Ten");
		
	private EstadioMaracanaDTO estadio1 = new EstadioMaracanaDTO("Maracana", 75000);
	private EstadioMorumbiDTO estadio2 = new EstadioMorumbiDTO("Morumbi", 60000);
	private EstadioBeiraRioDTO estadio3 = new EstadioBeiraRioDTO("Beira Rio", 55000);
	
	Scanner entrada = new Scanner(System.in);
	
	public CompraService() {
		
		this.saida = "Para as opcoes de show digite: \n [1] " + this.concertoA.getNomeBanda() + " " + this.concertoA.getNomeTurne() + " \n" +
													"\n [2] "  + this.concertoB.getNomeBanda() + " " + this.concertoB.getNomeTurne() + " \n" +
													"\n [3] "  + this.concertoC.getNomeBanda() + " " + this.concertoC.getNomeTurne() + "\n";
		imprimirOpcoes(saida);
		
		this.opcao = entrada.nextInt();
		
		if(this.opcao == 1) {
			this.saida = "Agora escolha uma cidade com sua respectiva data para o show da banda " + this.concertoA.getNomeBanda() + "\n" + 
						 "[1] " + this.concertoA.getCidadesDisponiveis().get(0) + " data: " + this.concertoA.getDatasDisponiveis().get(0) + " \n" +
						 "[2] " + this.concertoA.getCidadesDisponiveis().get(1) + " data: " + this.concertoA.getDatasDisponiveis().get(1) + " \n" +
						 "[3] " + this.concertoA.getCidadesDisponiveis().get(2) + " data: " + this.concertoA.getDatasDisponiveis().get(2) ;
			
			imprimirCidades(saida);
			
			this.opcao = entrada.nextInt();
			
			if(this.opcao == 1) {
				this.saida = "Agora escolha um local no estadio do " + this.estadio1.getNomeEstadio() + " para o show de " + this.concertoA.getDatasDisponiveis().get(0) + 
						     "[1] " + this.estadio1.getTipoLugares().get(0) + " preco: " + this.estadio1.getPrecosLugares().get(0) + 
						     "[2] " + this.estadio1.getTipoLugares().get(1) + " preco: " + this.estadio1.getPrecosLugares().get(1) +
						     "[3] " + this.estadio1.getTipoLugares().get(2) + " preco: " + this.estadio1.getPrecosLugares().get(2);
				imprimirOpcoes(saida);
				
				this.opcao = entrada.nextInt();
			}
			
			if(this.opcao == 2) {
				this.saida = "Agora escolha um local no estadio do " + this.estadio2.getNomeEstadio() + " para o show de " + this.concertoA.getDatasDisponiveis().get(1) + 
						     "[1] " + this.estadio2.getTipoLugares().get(0) + " preco: " + this.estadio2.getPrecosLugares().get(0) + 
						     "[2] " + this.estadio2.getTipoLugares().get(1) + " preco: " + this.estadio2.getPrecosLugares().get(1) +
						     "[3] " + this.estadio2.getTipoLugares().get(2) + " preco: " + this.estadio2.getPrecosLugares().get(2);
				imprimirOpcoes(saida);
				
				this.opcao = entrada.nextInt();
			}
			
			if(this.opcao == 3) {
				this.saida = "Agora escolha um local no estadio do " + this.estadio3.getNomeEstadio() + " para o show de " + this.concertoA.getDatasDisponiveis().get(2) + 
					     "[1] " + this.estadio3.getTipoLugares().get(0) + " preco: " + this.estadio3.getPrecosLugares().get(0) + 
					     "[2] " + this.estadio3.getTipoLugares().get(1) + " preco: " + this.estadio3.getPrecosLugares().get(1) +
					     "[3] " + this.estadio3.getTipoLugares().get(2) + " preco: " + this.estadio3.getPrecosLugares().get(2);
				imprimirOpcoes(saida);
				
				this.opcao = entrada.nextInt();
		    }
			
			
		}
		
		if(this.opcao == 2) {
			this.saida = "Agora escolha uma cidade com sua respectiva data para o show da banda " + this.concertoB.getNomeBanda() + "\n" + 
						 "[1] " + this.concertoB.getCidadesDisponiveis().get(0) + " data: " + this.concertoB.getDatasDisponiveis().get(3) +  " \n " +
						 "[2] " + this.concertoB.getCidadesDisponiveis().get(1) + " data: " + this.concertoB.getDatasDisponiveis().get(4) +  " \n " +
						 "[3] " + this.concertoB.getCidadesDisponiveis().get(2) + " data: " + this.concertoB.getDatasDisponiveis().get(5) ;
			
			imprimirCidades(saida);
			
			this.opcao = entrada.nextInt();
			
			if(this.opcao == 1) {
				this.saida = "Agora escolha um local no estadio do " + this.estadio1.getNomeEstadio() + " para o show de " + this.concertoB.getDatasDisponiveis().get(3) + 
						     "[1] " + this.estadio1.getTipoLugares().get(0) + " preco: " + this.estadio1.getPrecosLugares().get(0) + 
						     "[2] " + this.estadio1.getTipoLugares().get(1) + " preco: " + this.estadio1.getPrecosLugares().get(1) +
						     "[3] " + this.estadio1.getTipoLugares().get(2) + " preco: " + this.estadio1.getPrecosLugares().get(2);
				imprimirOpcoes(saida);
				
				this.opcao = entrada.nextInt();
			}
			
			if(this.opcao == 2) {
				this.saida = "Agora escolha um local no estadio do " + this.estadio2.getNomeEstadio() + " para o show de " + this.concertoB.getDatasDisponiveis().get(4) + 
						     "[1] " + this.estadio2.getTipoLugares().get(0) + " preco: " + this.estadio2.getPrecosLugares().get(0) + 
						     "[2] " + this.estadio2.getTipoLugares().get(1) + " preco: " + this.estadio2.getPrecosLugares().get(1) +
						     "[3] " + this.estadio2.getTipoLugares().get(2) + " preco: " + this.estadio2.getPrecosLugares().get(2);
				imprimirOpcoes(saida);
				
				this.opcao = entrada.nextInt();
			}
			
			if(this.opcao == 3) {
				this.saida = "Agora escolha um local no estadio do " + this.estadio3.getNomeEstadio() + " para o show de " + this.concertoB.getDatasDisponiveis().get(5) + 
					     "[1] " + this.estadio3.getTipoLugares().get(0) + " preco: " + this.estadio3.getPrecosLugares().get(0) + 
					     "[2] " + this.estadio3.getTipoLugares().get(1) + " preco: " + this.estadio3.getPrecosLugares().get(1) +
					     "[3] " + this.estadio3.getTipoLugares().get(2) + " preco: " + this.estadio3.getPrecosLugares().get(2);
				imprimirOpcoes(saida);
				
				this.opcao = entrada.nextInt();
		    }
			
		}
		
		if(this.opcao == 3) {
			this.saida = "Agora escolha uma cidade com sua respectiva data para o show da banda " + this.concertoC.getNomeBanda() + "\n" + 
						 "[1] " + this.concertoC.getCidadesDisponiveis().get(0) + " data: " + this.concertoC.getDatasDisponiveis().get(6) +  " \n " +
						 "[2] " + this.concertoC.getCidadesDisponiveis().get(1) + " data: " + this.concertoC.getDatasDisponiveis().get(7) +  " \n " +
						 "[3] " + this.concertoC.getCidadesDisponiveis().get(2) + " data: " + this.concertoC.getDatasDisponiveis().get(8)   ;
			
			imprimirCidades(saida);
			
			this.opcao = entrada.nextInt();
			
			if(this.opcao == 1) {
				this.saida = "Agora escolha um local no estadio do " + this.estadio1.getNomeEstadio() + " para o show de " + this.concertoC.getDatasDisponiveis().get(6) + 
						     "[1] " + this.estadio1.getTipoLugares().get(0) + " preco: " + this.estadio1.getPrecosLugares().get(0) + 
						     "[2] " + this.estadio1.getTipoLugares().get(1) + " preco: " + this.estadio1.getPrecosLugares().get(1) +
						     "[3] " + this.estadio1.getTipoLugares().get(2) + " preco: " + this.estadio1.getPrecosLugares().get(2);
				imprimirOpcoes(saida);
				
				this.opcao = entrada.nextInt();
			}
			
			if(this.opcao == 2) {
				this.saida = "Agora escolha um local no estadio do " + this.estadio2.getNomeEstadio() + " para o show de " + this.concertoC.getDatasDisponiveis().get(7) + 
						     "[1] " + this.estadio2.getTipoLugares().get(0) + " preco: " + this.estadio2.getPrecosLugares().get(0) + 
						     "[2] " + this.estadio2.getTipoLugares().get(1) + " preco: " + this.estadio2.getPrecosLugares().get(1) +
						     "[3] " + this.estadio2.getTipoLugares().get(2) + " preco: " + this.estadio2.getPrecosLugares().get(2);
				imprimirOpcoes(saida);
				
				this.opcao = entrada.nextInt();
			}
			
			if(this.opcao == 3) {
				this.saida = "Agora escolha um local no estadio do " + this.estadio3.getNomeEstadio() + " para o show de " + this.concertoC.getDatasDisponiveis().get(8) + 
					     "[1] " + this.estadio3.getTipoLugares().get(0) + " preco: " + this.estadio3.getPrecosLugares().get(0) + 
					     "[2] " + this.estadio3.getTipoLugares().get(1) + " preco: " + this.estadio3.getPrecosLugares().get(1) +
					     "[3] " + this.estadio3.getTipoLugares().get(2) + " preco: " + this.estadio3.getPrecosLugares().get(2);
				imprimirOpcoes(saida);
				
				this.opcao = entrada.nextInt();
		    }
		
		}
		
		else {
			System.out.println("Opcao invalida, programa encerrado.");
		}
	}



	@Override
	public void imprimirOpcoes(String saida) {
		System.out.println(saida);
	}



	@Override
	public void imprimirEstadio(String saida) {
		System.out.println(saida);
		
	}



	@Override
	public void imprimirCidades(String saida) {
		System.out.println(saida);
		
	}



	@Override
	public void imprimirBandaTurne(String saida) {
		System.out.println(saida);
		
	}



	@Override
	public void imprimirDatasPrecos(String saida) {
		System.out.println(saida);
		
	}

	
	
}
