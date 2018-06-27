import java.util.Scanner;

public class Ingresso {
	private String data,cidade;
	private double preco;
	
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

	Ingresso(String data,String cidade, double preco) {
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
		int preco = new Scanner(System.in).nextInt();
		Ingresso ingresso = new Ingresso(data, cidade, preco);
		return ingresso;
	}
	
	public void imprimirImgresso() {
		System.out.println(this.data + " - " + 
						   this.cidade + " - " +
						   this.preco + "\n");
		return;
	}
	
}
