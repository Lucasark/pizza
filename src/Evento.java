import java.util.List;
import java.util.stream.Collectors;

public class Evento {
	private Concerto Concerto;
	private Estadio Estadio;
	private List<Ingresso> ingressos;
	
	public Evento(Concerto Concerto, Estadio Estadio, List<Ingresso> ingressos) {
		this.Concerto = Concerto;
		this.Estadio = Estadio;
		this.ingressos=ingressos;
	}
	
	public String getConcerto() {
		String nomeBanda = this.Concerto.getNomeBanda();
		String turneBanda = this.Concerto.getNomeTurne();
		return nomeBanda;
	}
	public Estadio getEstadio() {
		return Estadio;
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
	
	
}
