
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Compra {
	
	/*Compra é a class Model*/
	Evento eventoA;
	
	public Compra() {
		Concerto concertoA = new Concerto("Pearl Jam", "Atom");
		Concerto concertoB = new Concerto("Red", "TurnA");
		
		Estadio estadioA = new Estadio("Marcana", 100, 100, 200, 350);
		Estadio estadioB = new Estadio("Mineirinho", 150, 8100, 6200, 5350);
		
		List<String> datasA = Arrays.asList("12/12", "12/13", "12/15");
		List<String> cidadesA = Arrays.asList("RJ", "SP", "BH");
		List<Double> precosA = Arrays.asList(100.00, 150.00, 160.00);
		
		List<Ingresso> ingressos = new ArrayList<Ingresso>(0);
		
		for(int i=0; i<datasA.size(); i++) {
			ingressos.add(new Ingresso(datasA.get(i),cidadesA.get(i),precosA.get(i)));
		}
		
		eventoA = new Evento(concertoA, estadioA, ingressos);
		
		
		List<Evento> eventos = Arrays.asList(eventoA);
		
	}
	
	

	
}
