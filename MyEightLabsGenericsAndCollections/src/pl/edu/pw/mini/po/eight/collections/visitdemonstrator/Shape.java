package pl.edu.pw.mini.po.eight.collections.visitdemonstrator;

public abstract class Shape {

	protected abstract double area();

	protected abstract void apply(ShapeVisitor visitor);

}
