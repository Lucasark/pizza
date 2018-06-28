import java.util.Scanner;

public class Cartao {
	private String numeroCartao;
	private String validadeCartao;
	private int codigoSeguranca;
	
	Scanner teclado = new Scanner(System.in);
	
	public Cartao() {}
	
	public Cartao(String numeroCartao, String validadeCartao, int codigoSeguranca) {
		this.numeroCartao = numeroCartao;
		this.validadeCartao = validadeCartao;
		this.codigoSeguranca = codigoSeguranca;
	}

	public String getNumeroCartao() {
		return numeroCartao;
	}

	public void setNumeroCartao(String numeroCartao) {
		this.numeroCartao = numeroCartao;
	}

	public String getValidadeCartao() {
		return validadeCartao;
	}

	public void setValidadeCartao(String validadeCartao) {
		this.validadeCartao = validadeCartao;
	}

	public int getCodigoSeguranca() {
		return codigoSeguranca;
	}

	public void setCodigoSeguranca(int codigoSeguranca) {
		this.codigoSeguranca = codigoSeguranca;
	}
	
	public Cartao leCartao() {
		System.out.println("Digite o numero do cartao: \n");
		String numeroCartao = teclado.next();
		System.out.println("Digite a validade do cartao no formato MM/AA: \n");
		String validadeCartao = teclado.next();
		System.out.println("Digite o codigo de seguranca do cartao com 3 digitos: \n");
		int codigoSeguranca = teclado.nextInt();
		Cartao cartao = new Cartao(numeroCartao, validadeCartao, codigoSeguranca);
		return cartao;
	}
	
	
}
