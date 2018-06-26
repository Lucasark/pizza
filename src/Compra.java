
import java.util.Arrays;

public class Compra {
	Concerto concertoA = new Concerto("Pearl Jam", "Atom");
	Concerto concertoB = new Concerto("Red", "TurnA");
	Estadio estadioA = new Estadio("Marcana", 100, 100, 200, 350);
	Estadio estadioB = new Estadio("Mineirinho", 150, 8100, 6200, 5350);
	
	Evento eventoA = new Evento(concertoA, estadioA,  Arrays.asList("12/12", "12/13", "12/15"),
					 Arrays.asList("RJ", "SP", "BH"),
					 Arrays.asList(100.00, 150.00, 160.00));
	private String saida;
	
	public Compra() {
		this.saida = "Saida --> " + 
					eventoA.getConcerto() + " - " +
					eventoA.getCidades().get(0) + " - " +
					eventoA.getData().get(0) + " - " +
					eventoA.getPreco().get(0) + " - " +
					eventoA.getEstadio();
		
		System.out.println(saida);
	}
}
