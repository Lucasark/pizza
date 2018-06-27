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
								
							case 5:
								break;
								
							case 6:
								break;
								
							case 7:
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

