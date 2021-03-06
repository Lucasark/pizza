package br.com.trabOO.main;
import java.util.List;
import java.util.ArrayList;
//import java.util.Arrays;
import java.util.Scanner;

import br.com.trabOO.compra.Carrinho;
import br.com.trabOO.memoria.Concerto;
import br.com.trabOO.memoria.Estadio;
import br.com.trabOO.memoria.Evento;

//---------> ESTE MENU, AL�M DE MENU � TBM UM "BANCO DE DADOS"<--------------

public class Menu {
	
	List<Estadio> estadios = new ArrayList<Estadio>(0);
	List<Concerto> concertos = new ArrayList<Concerto>(0);
	public List<Evento> eventos = new ArrayList<Evento>(0);
	
	Scanner teclado = new Scanner(System.in);
	
	public void leNomesEstadios(){
		if (estadios.size() == 0) System.out.println("N�o existe estadios");
		int k = 1;
		for(Estadio m: estadios){   
			System.out.println("[" + k + "]" + " - " + m.getNomeEstadio());
			k++;
		}
		return;
	}
	
	public void leNomesConcertos(){
		if (concertos.size() == 0) System.out.println("N�o existe concertos");
		int k = 1;
		for(Concerto m: concertos){   
			System.out.println("[" + k + "]" + " - " + m.getNomeBanda());
			k++;
		}
		return;
	}
	
	public int leNomesEventos() {
		if (eventos.size() == 0) {
			System.out.println("N�o existe eventos");
			return 1;
		}
		int k = 1;
		for(Evento m: eventos){   
			System.out.println("[" + k + "]" + " - "); m.imprimirEventos();
			k++;
		}
		return 0;
	}
	
	public int leIngressosEvento(int index) {
		if(eventos.size() == 0) {
			System.out.println("N�o existe eventos");
		}
		
		eventos.get(index).imprimirIngressoEvento();
		
		return 0;
	}
	
	public void opcoesAdmin() {
		System.out.println("SENHA:");
		int senha = teclado.nextInt();
		if (senha == 12345) {
			int i = 0;
			do {
				System.out.println("[1] - Adicionar Estadio\n"
								+ "[2] - Imprimir Estadios\n"
								+ "[3] - Adicionar Concerto\n"
								+ "[4] - Imprimir Concertos\n"
								+ "[5] - Adicionar Evento\n"
								+ "[6] - Imprimir Eventos\n"
								+ "[0] - Voltar");
				int eADMIN = teclado.nextInt();
				switch(eADMIN) {
					case 1:
						Estadio estadio = new Estadio();
						estadio = estadio.leEstadio();
						estadios.add(estadio);
						System.out.println("---Estadio CRIADO!---");
						break;
						
					case 2:
						if (estadios.size() == 0) System.out.println("VAZIO!");
						for(Estadio m: estadios){   
							m.imprimirEstadio();
						}
						System.out.println("---Estadios Impresso---");
						break;
						
					case 3:
						Concerto concerto = new Concerto();
						concerto = concerto.leConcerto();
						concertos.add(concerto);
						System.out.println("---Concerto CRIADO!---");
						break;
						
					case 4:
						if (concertos.size() == 0) System.out.println("VAZIO!");
						for(Concerto m: concertos){
							m.imprimirConcerto();
						}
						System.out.println("---Concertos Impresso---");
						break;
					
					//FINALIDADE DE DEBUGAR!
					//N�O APRESENTA NO MENU!
					/*
					case 10:
						List<Ingresso> ingressos = new ArrayList<Ingresso>(0);
						Ingresso ingresso = new Ingresso();
						ingresso = ingresso.leIngresso();
						ingressos.add(ingresso);
						System.out.println("---Ingresso CRIADO!---");
						break;
					/*
					case 11:
						if(ingressos.size() == 0) System.out.println("VAZIO!");
						for(Ingresso m: ingressos) {
							m.imprimirIngresso();
						}
						System.out.println("---Ingresso Impresso---");
						break;
					*/
					case 5:
						if(estadios.size() == 0 || concertos.size() == 0) {
							System.out.println("Voce tem " + estadios.size() + " estadios e " + concertos.size() + " concertos");
							break;
						}else {
							Evento evento = new Evento();
							System.out.println("Escolha o estadio");
							leNomesEstadios();
							int eEstadio = teclado.nextInt();
							System.out.println("Escolha o concerto");
							leNomesConcertos();
							int eConcertos = teclado.nextInt();
							evento = evento.leEvento(estadios.get(eEstadio-1), concertos.get(eConcertos-1));
							eventos.add(evento);
							System.out.println("---Evento CRIADO!---");
						}
						break;
						
					case 6:
						if(eventos.size() == 0) System.out.println("VAZIO!");
						for(Evento m: eventos) {
							m.imprimirEventos();
						}
						System.out.println("---Eventos Impressos!---");
						break;
						
					case 0:
						//soisso
						i = 1;
						break;
				} 
			} while(i != 1);
		}
		else {
			System.out.println("Senha Incorreta");
		}
	}

	public int opcoesCompraCliente() {
		int a = 1;
			if(eventos.size() == 0) { 
				System.out.println("VAZIO!");
			}else {
				for(Evento m: eventos) {
					m.imprimirEventos();
					System.out.println("\n");
				}
				System.out.println("---Eventos Impressos!---");
			}
		return a;
	}	
	
	public void opcoesCliente(List<String> m) {
		Carrinho carrinho  = new Carrinho();
		carrinho.imprimirCarrinho(m);
	}
}


