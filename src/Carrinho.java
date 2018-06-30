
import java.util.List;


public class Carrinho {
	private int quantidade;
	List<String> carrinho;
	
	public Carrinho() {}
	
	public Carrinho(List<String> carrinho, int quantidade) {
		this.carrinho = carrinho;
		this.quantidade = quantidade;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public List<String> getCarrinho() {
		return carrinho;
	}
	public void setCarrinho(List<String> carrinho) {
		this.carrinho = carrinho;
	}
	
	public Carrinho leCarrinho() {
		int quantidade = 0;
		List<String> itens = null;
		Carrinho carrinho = new Carrinho(itens, quantidade);
		return carrinho;
	}
	
	public void imprimirCarrinho(List<String> carrinho) {
		if(carrinho.size() != 0) {
			for(int i = 0; i < carrinho.size() ; i++) {
				System.out.println("["+ i + "]" + " - " + carrinho.get(i));
			}
			System.out.println("\n[NUMERO DE TIPOS DE LUGARES ADQUIRIDOS]: "+ carrinho.size());
		}else {
			System.out.println("Seu carrinho esta vazio.");
		}
	}
	
	public void dadosCarrinho(float total) {
		System.out.println("[EVENTO] [BANDA] [TURNE] [ESTADIO] [TIPO LUGAR]  [DATA]  [CIDADE] [VALOR] \n");
		this.imprimirCarrinho(this.carrinho);
		System.out.println("[QUANTIDADE DE ITENS]: "+this.getQuantidade() +" [TOTAL]: R$"+ total );
	}
	
}
	
