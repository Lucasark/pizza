import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
	
    public static void main(String[] args) {
    	List<Cliente> clientes = new ArrayList<Cliente>(0);
    	Carrinho carrinho;
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
							System.out.println("----Cliente criado----");
						}
					}
					else {
						System.out.println("Selecione o Cliente:");
						int q = 1;
						for(Cliente m: clientes) {
				    		System.out.println("[" + q + "]"+m.getnome());
				    	}
						System.out.println(clientes.get(q-1).getSenha());
						System.out.print("Digite sua senha:");
						int w = input.nextInt();
						if (w == clientes.get(q-1).getSenha()) {
							menu.leNomesEventos();
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
