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
				case 1:
					int a = menu.opcoesCompraCliente();
					if (clientes.size() == 0) {
						System.out.println("Não existe cliente\n - Criar novo cliente [1] Sim [0] Cancelar");
						Scanner input2 = new Scanner(System.in);
						int IO = input2.nextInt();
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
						int q = 1;
						for(Cliente m: clientes) {
				    		System.out.println("[" + q + "]"+m.getnome());
				    		q++;
				    	}
						//System.out.println(clientes.get(q-1).getSenha());
						System.out.print("Digite sua senha:");
						int senha = input.nextInt();
						if (senha == clientes.get(q-1).getSenha()) {
							//----A.FAMIGERADA.COMPRA.COM
							System.out.println("Selecionar Evento: ");
							int y = 0, F =0;
							List<String> temp = new ArrayList<String>(0);
							do {
								menu.leNomesEventos();
								w = input.nextInt();
								temp.add(e);
								System.out.println("Deseja Continuar? [0] Sim [1] Não");
								y = input.nextInt();
								F++;
							} while (y != 1);
							carrinhos.get(q-1);
							
						}
					}
					break;
				case 2:
					menu.opcoesCliente();
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
