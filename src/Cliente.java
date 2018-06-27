
public class Cliente {
	private String nome;
  	private int cpf;
  	private int senha;
  	private Cartao cartao;  
  	
  	public Cliente() {
  		return;
  	}
  	
  	public Cliente(String nome, int cpf, int senha) {
  		this.nome = nome;
  		this.cpf = cpf;
  		this.senha = senha;	
  	}
	public String getnome() {
		return nome;
	}
	
	public int getCpf() {
		return cpf;
	}
	
	public int getSenha() {
		return senha;
	}
	
	public void imprimirCliente() {
		return;
	}
	
	
  
}
