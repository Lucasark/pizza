package br.com.trabOO.compra;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.trabOO.main.Menu;

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
				case 1:
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
									String dadosEvento = "Evento: " + menu.eventos.get(eNumeroEvento-1).getNomeEvento() + " " + 
														 "Turne: " + menu.eventos.get(eNumeroEvento - 1).getConcerto() + " " +
														 "Estadio: " + menu.eventos.get(eNumeroEvento - 1).getEstadio() + " ";
									System.out.println("Voce escolheu o seguinte evento: "
											+ dadosEvento);
									System.out.println("Selecione o tipo de ingresso para o evento: ");
									eInt = menu.leIngressosEvento(eNumeroEvento -1);
									int eNumeroIngressoEvento = input.nextInt();
									dadosEvento += menu.eventos.get(eNumeroEvento-1).getIngressoEvento(eNumeroIngressoEvento-1) + "\n";
									System.out.println("Quantos ingressos desse tipo?");
									int t = input.nextInt();
									itens += t;
									
									total += menu.eventos.get(eNumeroEvento-1).getCalculaIngressosEvento(eNumeroIngressoEvento-1, t);
									qtdeTotal = total;
									temp.add(dadosEvento);
									System.out.println("Deseja Continuar? [0] Sim [1] N�o");
									y = input.nextInt();
								}
							} while (y != 1);
							carrinhos.get(q-1).setCarrinho(temp);
							carrinhos.get(q-1).setQuantidade(itens);
							Carrinho carrinho = new Carrinho(carrinhos.get(q-1).getCarrinho(), carrinhos.get(q-1).getQuantidade());
							carrinhos.add(carrinho);
							carrinhos.get(q-1).dadosCarrinho(qtdeTotal);
							if (itens != 0) {
								System.out.println("Para finalizar sua compra digite [0] para concluir a compra e validar o cart�o ou [1] para cancelar");
								int entrada = input.nextInt();
								if(entrada == 0) {
									boolean validade = clientes.get(q-1).getCartao().validaCartao(clientes.get(q-1).getCartao().getNumeroCartao(),
																			   clientes.get(q-1).getCartao().getValidadeCartao(),
																			   clientes.get(q-1).getCartao().getCodigoSeguranca());
									if(validade == true) {
										System.out.println("CARTAO VALIDADO COM SUCESSO!");
										System.out.println("Compra realizada!");
									}else {
										System.out.println("DADOS INVALIDOS");
										System.out.println("FAVOR REALIZAR NOVAMENTE CADASTRO DE CLIENTE");
										carrinhos.remove(q-1);
									}
								}
								else {
									System.out.println("NAO FOI POSSIVEL CONCLUIR SUA COMPRA, ELA SERA CANCELADA.");
									carrinhos.remove(q-1);
								}
							}
							itens = 0; total = 0; qtdeTotal =0; opcao = 0; 
						}
					}
					break;
				case 2:
					if(clientes.size() == 0) {
						System.out.println("N�o existe clientes");
						break;
					}
					else {
						System.out.println("Selecione o Cliente");
						int q = 1;
						for(Cliente m: clientes) {
							System.out.println("[" + q + "]" + m.getnome());
							q++;
						}
						int j = input.nextInt();
						if (carrinhos.get(j-1) == null) {
							System.out.println("Digite sua senha: ");
							int w = input.nextInt();
							System.out.println(clientes.get(j-1).getSenha());
							if(w == clientes.get(j-1).getSenha()) {
								menu.opcoesCliente(carrinhos.get(j-1).getCarrinho());
							}
						}
						else {
							System.out.println("Sem compras feitas");
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
