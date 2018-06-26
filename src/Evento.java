
import java.util.List;

public class Evento {
	private Concerto Concerto;
	private Estadio Estadio;
	private List<String> Data;
	private List<String> Cidades;
	private List<Double> Preco;
	
	public Evento(Concerto Concerto, Estadio Estadio, List<String> Data, List<String> Cidades, List<Double> Preco) {
		super();
		this.Concerto = Concerto;
		this.Estadio = Estadio;
		this.Data= Data;
		this.Cidades = Cidades;
		this.Preco = Preco;
	}
	public String getConcerto() {
		String nomeBanda = this.Concerto.getNomeBanda();
		String turneBanda = this.Concerto.getNomeTurne();
		
		return nomeBanda;
	}
	public void setConcerto(Concerto concerto) {
		Concerto = concerto;
	}
	public Estadio getEstadio() {
		return Estadio;
	}
	public void setEstadio(Estadio estadio) {
		Estadio = estadio;
	}
	public List<String> getData() {
		return Data;
	}
	public void setData(List<String> data) {
		Data = data;
	}
	public List<String> getCidades() {
		return Cidades;
	}
	public void setCidades(List<String> cidades) {
		Cidades = cidades;
	}
	public List<Double> getPreco() {
		return Preco;
	}
	public void setPreco(List<Double> preco) {
		Preco = preco;
	}
	
}
