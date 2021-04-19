package pl.edu.pw.mini.po.solution.task1a.groundobject;

import java.util.Random;

public class Soil extends GroundObject {

	private double density;

	public Soil(int nutritionalValue) {
		super(nutritionalValue);
		this.density = (new Random().nextDouble() + 1.4);
	}

	public String toString() {
		return "#";
	}

}
