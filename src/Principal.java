
public class Principal {
    public static void main(String[] args) {
    	Menu menu = new Menu();
    	while (true) {
    		int a = menu.menu();
    		if (a==0) {
    			System.out.println("FIM DO PROGRAMA");
    			break;
    		}
    	}
    }
}
