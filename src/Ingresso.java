import java.util.Scanner;

public class Ingresso {
	private String data,cidade;
	private float preco;
	
	public Ingresso() {
		return;
	}
	
	public String getData() {
		return data;
	}

	public String getCidade() {
		return cidade;
	}

	public double getPreco() {
		return preco;
	}

	Ingresso(String data,String cidade, float preco) {
		this.data=data;
		this.cidade=cidade;
		this.preco=preco;
	}
	
	public Ingresso leIngresso() {
		System.out.println("Data:");
		String data = new Scanner(System.in).next();
		System.out.println("Cidade:");
		String cidade = new Scanner(System.in).next();
		System.out.println("Preço:");
		float preco = new Scanner(System.in).nextFloat();
		Ingresso ingresso = new Ingresso(data, cidade, preco);
		return ingresso;
	}
	
	public void imprimirIngresso() {
		System.out.println(this.data + " - " + 
						   this.cidade + " - " +
						   this.preco );
		return;
	}
	
}
