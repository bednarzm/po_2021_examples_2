package pl.edu.pw.mini.po.eight.collections.visitdemonstrator;

public class Square extends Shape {
	
	private double a;

	public Square(double a) {
		super();
		this.a = a;
	}

	@Override
	protected void apply(ShapeVisitor visitor) {
		/*
		 Metoda ta, to implementacja metody apply dla typu Circle.
		 Wybiera sobie metode z wizytatora (bo wie ze nalezy do typu Square), 
		 wiec przekazuje referencje na siebie (this) do metody ktora ten typ akceptuje.
		 */
		visitor.visitSquare(this);
	}

	public double getA() {
		return a;
	}

	@Override
	protected double area() {
		return a*a;
	}
	
}
