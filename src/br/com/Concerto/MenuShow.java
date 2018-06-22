package br.com.Concerto;

public class MenuShow {
	
	public int escolha;
	public int valor;
	
	
	
	public int getEscolha() {
		return escolha;
	}

	public void setEscolha(int escolha) {
		this.escolha = escolha;
	}

	public void imprimirMenu() {
		System.out.println("[1] COMPRAR 	\n"
				    + 	   "[2] CANCELAR");
	}
	
	public int getValor() {
		return valor;
	}
	
	public void setValor(int numero) {
		this.escolha = numero;
	}
	
	private void selecao(int x) {
		if(x == 1) {
			System.out.println("COMPRA");
		}
		if(x == 2) {
			System.out.println("CANCELADO");
			System.out.println("DESEJA CANCELAR A OPERACAO?");
			
		}
		else {
			System.out.println("OPCAO INVALIDA");
		}
	}
	
	
}
