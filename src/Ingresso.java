
public class Ingresso {
	private String data,cidade;
	private double preco;
	
	public String getData() {
		return data;
	}

	public String getCidade() {
		return cidade;
	}

	public double getPreco() {
		return preco;
	}

	Ingresso(String data,String cidade, double preco) {
		this.data=data;
		this.cidade=cidade;
		this.preco=preco;
	}
	
	
}
