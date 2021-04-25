package pl.edu.pw.mini.po.eight.collections.visitdemonstrator;

import java.util.HashMap;
import java.util.Map;
/**
 * Jest to oczywiscie propozycja implementacji 
 * wzorca visitor. 
 */
public class ShapeVisitorImpl implements ShapeVisitor {

	private Map<String, Double> result = new HashMap<String, Double>();
	
	/**
	 * Kazda z metod visitSquare lub visitCircle wyknuje prace na rzecz 
	 * konkretnego typu ktorym jest zaiteresowana. 
	 */
	
	/**
	 * Metoda dla konkretnego typu (Square).
	 * Jak widac otrzymuje juz referencje na kwadrat wiec ma do niego dostep 
	 * i moze na nim pracowac jesli istnieje koniecznosc wykonywania 
	 * operacji z referencja do konkretnego podtypu "w reku".
	 */
	public void visitSquare(Square square) {
		result.put("BOK", square.getA());
	}

	/**
	 * Metoda dla konkretnego typu (Curcle).
	 * Jak widac otrzymuje juz referencje na kwadrat wiec ma do niego dostep 
	 * i moze na nim pracowac jesli istnieje koniecznosc wykonywania 
	 * operacji z referencja do konkretnego podtypu "w reku".
	 */
	public void visitCircle(Circle circle) {
		result.put("PROMIEN", circle.getRadius());
	}

	public Map<String, Double> getResult() {
		return result;
	}

}
