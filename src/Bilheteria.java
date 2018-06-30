import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bilheteria {
	public Bilheteria() {
		List<Cliente> clientes = new ArrayList<Cliente>(0);
		List<Carrinho> carrinhos = new ArrayList<Carrinho>(0);
		int h = 0;
		float total = 0;
		Menu menu = new Menu();
		@SuppressWarnings("resource")
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
					@SuppressWarnings("unused") int a = menu.opcoesCompraCliente();
					if (clientes.size() == 0) {
						System.out.println("Não existe cliente\n - Criar novo cliente [1] Sim [0] Cancelar");
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
							int itens = 0;
							float qtdeTotal = 0;
							List<String> temp = new ArrayList<String>(0);
							do {
								int eInt  = menu.leNomesEventos();
								if (eInt == 1) {
									y = 1;
								}
								else {
									int eNumeroEvento = input.nextInt();
									String dadosEvento = menu.eventos.get(eNumeroEvento-1).getNomeEvento() + " " + 
														 menu.eventos.get(eNumeroEvento - 1).getConcerto() + " " +
														 menu.eventos.get(eNumeroEvento - 1).getEstadio() + " ";
									System.out.println("Voce escolheu o seguinte evento: "
											+ dadosEvento);
									System.out.println("Selecione o tipo de ingresso para o evento: ");
									eInt = menu.leIngressosEvento(eNumeroEvento -1);
									int eNumeroIngressoEvento = input.nextInt();
									dadosEvento += menu.eventos.get(eNumeroEvento-1).getIngressoEvento(eNumeroIngressoEvento-1) + "\n";
									System.out.println("Quantos ingressos desse tipo?");
									h = input.nextInt();
									itens += h;
									
									total += menu.eventos.get(eNumeroEvento-1).getCalculaIngressosEvento(eNumeroIngressoEvento-1, h);
									qtdeTotal = total;
									temp.add(dadosEvento);
									System.out.println("Deseja Continuar? [0] Sim [1] Não");
									y = input.nextInt();
								}
							} while (y != 1);
							carrinhos.get(q-1).setCarrinho(temp);
							carrinhos.get(q-1).setQuantidade(itens);
							Carrinho carrinho = new Carrinho(carrinhos.get(q-1).getCarrinho(), carrinhos.get(q-1).getQuantidade());
							carrinhos.add(carrinho);
							carrinhos.get(q-1).dadosCarrinho(qtdeTotal);
							//
							//MOSTRAR UMA TELA DE CONFIRMAÇÃO
							//ADD CARRINHO
							//ultimo AUTENTICAÇÃO CARTÃO ->ANNE
						}
					}
					break;
				case 2:
					if(clientes.size() == 0) {
						System.out.println("Não existe clientes");
						break;
					}
					else {
						System.out.println("Selecione o Cliente");
						int q = 1;
						for(Cliente m: clientes) {
							System.out.println("[" + q + "]" + m.getnome());
							q++;
						}
						System.out.println("Digite sua senha: ");
						int w = input.nextInt();
						System.out.println(clientes.get(q-2).getSenha());
						if(w == clientes.get(q-2).getSenha()) {
							//ver se carrinho esta vazio
							//fazer a logica de pegar os itens do carinho do cliente
							//com bug violando
							menu.opcoesCliente(carrinhos.get(q-2).getCarrinho());
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
