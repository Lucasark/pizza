import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Evento {
	private String nomeEvento;
	private Concerto concerto;
	private Estadio estadio;
	private List<Ingresso> ingressos = new ArrayList<Ingresso>(0);
	
	public Evento(String nomeEvento, Concerto Concerto, Estadio Estadio, List<Ingresso> ingressos) {
		this.nomeEvento = nomeEvento;
		this.concerto = Concerto;
		this.estadio = Estadio;
		this.ingressos = ingressos;
	}
	
	public Evento(){
		return;
	}
	
	public String getConcerto() {
		String nomeBanda = this.concerto.getNomeBanda();
		String turneBanda = this.concerto.getNomeTurne();
		return nomeBanda;
	}
	
	public Estadio getEstadio() {
		return estadio;
	}
	
	public List<String> getData() {
		return ingressos.stream().map(i -> i.getData()).collect(Collectors.toList());
	}
	
	public List<String> getCidades() {
		return ingressos.stream().map(i -> i.getCidade()).collect(Collectors.toList());
	}
	
	
	public List<Double> getPreco() {
		return ingressos.stream().map(i -> i.getPreco()).collect(Collectors.toList());
	}
	
	public Evento leEvento(Estadio estadio, Concerto concerto) {
		String i = "Y";
		System.out.println("Nome do Evento:");
		String nomeEvento = new Scanner(System.in).next();
		System.out.println("Definir Ingresso: ");
		List<String> estTemp;
		estTemp = estadio.getlugares();
		for (int l=0; l<estTemp.size(); l++) {
			System.out.println("#" + estTemp.get(l)+ "#");
			Ingresso ingresso = new Ingresso();
			ingresso = ingresso.leIngresso();
			ingressos.add(ingresso);
		}
		Evento evento = new Evento(nomeEvento, concerto, estadio, ingressos);
		return evento;
	}
	
	public void imprimirEventos() {
		System.out.println("Nome do Evento: " + this.nomeEvento + "\n" 
						+ "Nome da Banda: " + this.concerto.getNomeBanda() + "\n"
						+ "Nome do Estadio: " + this.estadio.getNomeEstadio());
		System.out.println("|Tipo|Dia|Local|Preço| ");
		List<String> temp = new ArrayList<String>(0);
		temp = estadio.getlugares();
		for (int l=0; l<ingressos.size(); l++) {
			System.out.println(temp.get(l));
			this.ingressos.get(l).imprimirIngresso();
		}
		return;
	}
	
}
