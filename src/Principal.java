import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
	
    public static void main(String[] args) {
    	List<Cliente> clientes = new ArrayList<Cliente>(0);
    	List<Carrinho> carrinhos = new ArrayList<Carrinho>(0);
    	int h = 0;
    	int total = 0;
    	Menu menu = new Menu();
    	Scanner input = new Scanner(System.in);
    	do {
    		System.out.println(
    					"[1] - Comprar Ingressos\n"
    				  + "[2] - Ver Ingressos Adquiridos\n"
					  + "[3] - Acesso ADMIN\n"
					  + "[0] - Cancelar");
    		int opcao = input.nextInt();
    		switch(opcao) {
    			//BUG NO SELECIONAR CLIENTE
				case 1:
					int a = menu.opcoesCompraCliente();
					if (clientes.size() == 0) {
						System.out.println("N�o existe cliente\n - Criar novo cliente [1] Sim [0] Cancelar");
						int IO = input.nextInt();
						if (IO == 1) {
							Cliente cliente = new Cliente();
							cliente = cliente.leCliente();
							clientes.add(cliente);
							Carrinho carrinho = new Carrinho();
							carrinhos.add(carrinho);
							System.out.println("----Cliente criado----");
						}
					}
					else {
						System.out.println("Selecione o Cliente:");
						int loop = 1;
						for(Cliente m: clientes) {
				    		System.out.println("[" + loop + "]"+m.getnome());
				    	}
						int q = input.nextInt();
						//System.out.println(clientes.get(q-1).getSenha());
						System.out.print("Digite sua senha:");
						int senha = input.nextInt();
						if (senha == clientes.get(q-1).getSenha()) {
							//----A.FAMIGERADA.COMPRA.COM
							System.out.println("Selecionar Evento: ");
							int y = 0;
							List<String> temp = new ArrayList<String>(0);
							do {
								int eInt  = menu.leNomesEventos();
								if (eInt == 1) {
									y = 1;
								}
								else {
									int eNumeroEvento = input.nextInt();
									String nomeEvento = menu.eventos.get(eNumeroEvento-1).getNomeEvento();
									temp.add(nomeEvento);
									System.out.println("Deseja Continuar? [0] Sim [1] N�o");
									y = input.nextInt();
								}
							} while (y != 1);
							carrinhos.get(q-1).setCarrinho(temp);
							//carrinhos.add();
							//
							//MOSTRAR UMA TELA DE CONFIRMA��O
							//ADD CARRINHO
							//ultimo AUTENTICA��O CART�O ->ANNE
						}
					}
					break;
				case 2:
					if(clientes.size() == 0) {
						System.out.println("Cliente nao existe!");
						break;
					}
					else {
						System.out.println("Selecione o Cliente");
						int q = 1;
						for(Cliente m: clientes) {
							System.out.println("[" + q + "]" + m.getnome());
							q++;
						}
						System.out.println(clientes.get(q-1).getSenha()); // DEBUG
						System.out.println("Digite sua senha: ");
						int w = input.nextInt();
						if(w == clientes.get(q-1).getSenha()) {
							menu.opcoesCliente(carrinhos.get(q-1).getCarrinho());
						}
					}
					break;
				case 3:
					menu.opcoesAdmin();
					break;
				case 0:
					System.out.println("FIM DO PROGRAMA");
					h = 1;
					break;
    		}
    	}while (h != 1);
    }
}
