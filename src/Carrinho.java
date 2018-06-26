import java.util.Scanner;

public class Carrinho {
	//private int quantidade;
	//ArrayList<String> Carrinho;
	
	public static int menu() {
		Scanner input= new Scanner(System.in);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		
		int opcao = input.nextInt();
		input.close();		
		return opcao;
	}
	
	public static void trata(int opcao) {
		switch(opcao) {
			
		}
	}
	
	
    public static void main(String[] args) {
    	Compra compraB = new Compra();
    	while(true) {
    		int opcao = menu();
    		trata(opcao);
    	}
    	
    	
    }
	
}
