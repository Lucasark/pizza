import java.util.List;
import java.util.ArrayList;
//import java.util.Arrays;
import java.util.Scanner;

//---------> ESTE MENU, ALÉM DE MENU É TBM UM "BANCO DE DADOS"<--------------

public class Menu {
	
	List<Estadio> estadios = new ArrayList<Estadio>(0);
	List<Concerto> concertos = new ArrayList<Concerto>(0);
	List<Evento> eventos = new ArrayList<Evento>(0);
	
	private void leNomesEstadios(){
		if (estadios.size() == 0) System.out.println("Não existe estadios");
		int k = 1;
		for(Estadio m: estadios){   
			System.out.println("[" + k + "]" + " - " + m.getNomeEstadio());
			k++;
		}
		return;
	}
	private void leNomesConcertos(){
		if (concertos.size() == 0) System.out.println("Não existe concertos");
		int k = 1;
		for(Concerto m: concertos){   
			System.out.println("[" + k + "]" + " - " + m.getNomeBanda());
			k++;
		}
		return;
	}
	public void opcoesAdmin() {
		System.out.println("SENHA:");
		int senha = new Scanner(System.in).nextInt();
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
				int eADMIN = new Scanner(System.in).nextInt();
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
					//NÃO APRESENTA NO MENU!
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
							int eEstadio = new Scanner(System.in).nextInt();
							System.out.println("Escolha o concerto");
							leNomesConcertos();
							int eConcertos = new Scanner(System.in).nextInt();
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
	public void opcoesCompraCliente() {
		System.out.println("Clientes");
	}
	public void opcoesCliente() {
		
	}
}


