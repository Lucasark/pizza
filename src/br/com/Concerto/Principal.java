package br.com.Concerto;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
	   
		Scanner teclado = new Scanner(System.in);
		MenuShow menu = new MenuShow();
		
		menu.setEscolha(teclado.nextInt());
		System.out.println(menu.getEscolha());
	   
	}
}
