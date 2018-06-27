import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
	List<Cliente> clientes = new ArrayList<Cliente>(0);
    public static void main(String[] args) {
    	int h = 0;
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
					menu.opcoesCompraCliente();
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
    
    public void imprimirClientes() {
    	for(Cliente m: clientes) {
    		System.out.println(m.getnome());
    	}
    	return;
    }
}
