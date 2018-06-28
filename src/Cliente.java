import java.util.Scanner;

public class Cliente {
	private String nome;
  	private String cpf;
	private int senha;
  	private Cartao cartao;  
  	Scanner teclado = new Scanner(System.in);
  	
  	public Cliente() {
  		return;
  	}
  	
  	public Cliente(String nome, String cpf, int senha, Cartao cartao) {
  		this.nome = nome;
  		this.cpf = cpf;
  		this.senha = senha;	
  		this.cartao = cartao;
  	}
	public String getnome() {
		return nome;
	}
	
	public void setSenha(int senha) {
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Cartao getCartao() {
		return cartao;
	}

	public void setCartao(Cartao cartao) {
		this.cartao = cartao;
	}

	public String getCpf() {
		return cpf;
	}
	
	public int getSenha() {
		return senha;
	}
	
	public void imprimirCliente() {
		return;
	}
	
	public Cliente leCliente() {
		
		System.out.println("Nome do cliente: \n");
		String nome = teclado.next();
		System.out.println("Numero do cpf: \n");
		String cpf = teclado.next();
		System.out.println("Numero da senha: \n");
		int senha = teclado.nextInt();
		Cartao cartao = new Cartao();
		cartao = cartao.leCartao();
		Cliente cliente  = new Cliente(nome, cpf, senha, cartao);
		return cliente;
	}
	
	
  
}
