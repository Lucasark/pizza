
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
}
	
