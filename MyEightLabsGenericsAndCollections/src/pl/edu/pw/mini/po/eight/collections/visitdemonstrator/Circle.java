package pl.edu.pw.mini.po.eight.collections.visitdemonstrator;

public class Circle extends Shape {
	
	private double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	protected void apply(ShapeVisitor visitor) {
		/*
		 Metoda ta, to implementacja metody apply dla typu Circle.
		 Wybiera sobie metode z wizytatora (bo wie ze nalezy do typu Circle), 
		 wiec przekazuje referencje na siebie (this) do metody ktora ten typ akceptuje.
		 */
		visitor.visitCircle(this);
	}

	public double getRadius() {
		return radius;
	}

	@Override
	protected double area() {
		return Math.PI*radius*radius;
	}

}
