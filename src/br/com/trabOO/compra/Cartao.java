package br.com.trabOO.compra;
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
		String numeroCartao = teclado.nextLine();
		System.out.println("Digite a validade do cartao no formato MM/AA: \n");
		String validadeCartao = teclado.nextLine();
		System.out.println("Digite o codigo de seguranca do cartao com 3 digitos: \n");
		int codigoSeguranca = teclado.nextInt();
		Cartao cartao = new Cartao(numeroCartao, validadeCartao, codigoSeguranca);
		return cartao;
	}
	
	public boolean validaCartao(String numero, String validade, int codSeguranca) {
		boolean valido = false;
		numero = numero.replaceAll("\\s+","");
		char caractereValidador = validade.charAt(2);
		String stringValidador = String.valueOf(codSeguranca);
		if(numero.length() == 16) {
			if(caractereValidador == '/' && validade.length() == 5) {
				if(stringValidador.length() == 3) {
					valido = true;
					return valido;
				}
			}
		}
		return valido;
	}
	
	
}
