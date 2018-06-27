import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Menu {
	
	List<Estadio> estadios = new ArrayList<Estadio>(0);
	
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
										+ "[2] - Adicionar Concerto\n"
										+ "[3] - Adicionar Ingresso\n"
										+ "[4] - Voltar");
						input1 = new Scanner(System.in);
						int eADMIN = input1.nextInt();
						switch(eADMIN) {
							case 1:
								addEstadio();
								System.out.println("Estadio CRIADO!");
								break;
							case 2:
								System.out.println("Concerto");
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
	private void addEstadio() {
		//int i = 0;
		System.out.println("Nome do Estadio:");
		String nomeEstadio = new Scanner(System.in).next();
		System.out.println("Lugar Esquerdo:");
		int lugarEsquerdo = new Scanner(System.in).nextInt();
		System.out.println("Lugar Direito:");
		int lugarDireito = new Scanner(System.in).nextInt();
		System.out.println("Centro:");
		int Centro = new Scanner(System.in).nextInt();
		System.out.println("Superior:");
		int Superior = new Scanner(System.in).nextInt();
		estadios.add(new Estadio(nomeEstadio, lugarDireito, lugarEsquerdo, Centro, Superior));
		return;
	}
	
}

