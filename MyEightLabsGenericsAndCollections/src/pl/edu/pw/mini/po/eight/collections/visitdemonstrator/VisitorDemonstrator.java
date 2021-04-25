package pl.edu.pw.mini.po.eight.collections.visitdemonstrator;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class VisitorDemonstrator {

	public static void main(String[] args) {
		print();
		
	}
	
	private static void print() {
		List<Shape> shapes = new LinkedList<>();
		shapes.add(new Circle(1));
		shapes.add(new Square(2));
		shapes.add(new Square(2));
		
		for(Shape shape : shapes) {
			System.out.println("Shape: " + shape.area());
		}
	}
	
	private static void getMapExample() {
		List<Shape> shapes = new LinkedList<>();
		shapes.add(new Circle(1));
		shapes.add(new Square(2));
		shapes.add(new Square(2));
		getMap(shapes);
	}
	
	private static Map<String, Double> getMap(List<Shape> shapes) {
		Map<String, Double> result = new HashMap<String, Double>();
		
		
		ShapeVisitorImpl circleVisitorImpl = new ShapeVisitorImpl();
		for(Shape shape : shapes) {
			
			/*
			Jak widac wykonujemy zaplanowane prace na kazdym obiekcie z iterowanej kolekcji
			bez potrzeby rozpoznawania typu obiektu (czy jest to Circle czy Square) 
			jaki kryje sie pod ogolna referencja na nadklase (Shape). 
			 */
			shape.apply(circleVisitorImpl);
			
			/*
			if(shape instanceof Circle) {
				Circle circle = (Circle)shape;
				result.put("BOK", square.getA());
			} else if (shape instanceof Square) {
				Square square = (Square)shape;
				result.put("PROMIEN", circle.getRadius());
			}
			*/
		}
		
		return result;
	}
	
	
	
}
