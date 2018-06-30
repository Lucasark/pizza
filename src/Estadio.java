import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//import java.util.Arrays;
//import java.util.ArrayList;

public class Estadio{
	
	private String nomeEstadio;
	List<Lugar> lugares = new ArrayList<Lugar>(0);
	Scanner input = new Scanner(System.in);
	
	public Estadio() {
		return;
	}
	
	public String getNomeEstadio() {
		return nomeEstadio;
	}
	
	public List<String> getlugares() {
		List<String> temp = new ArrayList<String>(0);
		for (Lugar m: lugares) {
			temp.add(m.getTipoLugar());
		}
		return temp;
	}
	
	public Estadio(String nomeEstadio, List<Lugar> lugares) {
		this.nomeEstadio = nomeEstadio;
		this.lugares = lugares;
	}
	
	public Estadio leEstadio() {
		int i = 0;
		System.out.println("Nome do Estadio:");
		String nomeEstadio = input.next();
		do {
			Lugar lugar = new Lugar();
			lugar = lugar.leLugar();
			lugares.add(lugar);
			System.out.println("Digite [1] para finalizar ou [0] para continuar:");
			i = input.nextInt();
		} while(i != 1 || i != 1);
		Estadio estadio = new Estadio(nomeEstadio, lugares);
		return estadio;
	}
	
	public void imprimirEstadio() {
        System.out.printf(this.nomeEstadio + "\n");
        for (Lugar m: lugares) {
        	m.imprimirLugar();
        }
        return;
	}
	
}