import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Menu {
	
	List<Estadio> estadios = new ArrayList<Estadio>(0);
	List<Concerto> concertos = new ArrayList<Concerto>(0);
	List<Ingresso> ingressos = new ArrayList<Ingresso>(0);
	
	Scanner input = new Scanner(System.in);
	private Scanner input1;
	
	public int menu() {
		System.out.println("[1] - Comprar\n"
						+ "[2] - Ver Ingressos\n"
						+ "[3] - Acesso ADMIN\n"
						+ "[4] - Cancelar");
		
		int opcao = input.nextInt();
		
		switch(opcao) {
			case 1:
				System.out.println("1");
				
				break;
			case 2:
				System.out.println("2");
				break;
			case 3:
				System.out.println("SENHA:");
				Scanner input = new Scanner(System.in);
				int senha = input.nextInt();
				if (senha == 12345) {
					int i = 0;
					do {
						System.out.println("[1] - Adicionar Estadio\n"
										+ "[2] - Imprimir Estadios\n"
										+ "[3] - Adicionar Concerto\n"
										+ "[4] - Imprimir Estadios\n"
										+ "[5] - Adicionar Ingresso\n"
										+ "[6] - Imprimir Ingresso\n"
										+ "[7] - Voltar");
						input1 = new Scanner(System.in);
						int eADMIN = input1.nextInt();
						switch(eADMIN) {
							case 1:
								Estadio estadio = new Estadio();
								estadio = estadio.leEstadio();
								estadios.add(estadio);
								System.out.println("Estadio CRIADO!");
								break;
							case 2:
								if (estadios.size() == 0) System.out.println("VAZIO!");
								for(Estadio m: estadios){   
						              System.out.printf(m.getNomeEstadio() + " - " +
				            		  			 		m.getLugarDireito() + " - "+
				            		  			 		m.getLugarEsquerdo() + " - " +
				            		  			 		m.getCentro() + " - " +
				            		  			 		m.getSuperior() + "\n");
								}
								System.out.println("Estadios Impresso");
								break;
							case 3:
								System.out.println("Ingresso");
								break;
							case 4:
								System.out.println("V-SUCESSO");
								i = 1;
								break;
						} 
					} while(i != 1);
				}
				else {
					System.out.println("Senha Incorreta");
				}
				break;
				
			case 4:
				return 0;
		}
		return 1;
	}
	
	private void addConcerto() {
		System.out.println("Nome da Banda: ");
		String nomeBanda = new Scanner(System.in).next();
		System.out.println("Nome Turne: ");
		String nomeTurne = new Scanner(System.in).next();
		concertos.add(new Concerto(nomeBanda, nomeTurne));
	}
	
	private void addIngresso() {
		System.out.println("Data do show do ingresso: ");
		String data = new Scanner(System.in).next();
		System.out.println("Cidade do show do ingresso: ");
		String cidade = new Scanner(System.in).next();
		System.out.println("Preco do ingresso: ");
		Double preco = new Scanner(System.in).nextDouble();
		ingressos.add(new Ingresso(data, cidade, preco));
	}
	
}

