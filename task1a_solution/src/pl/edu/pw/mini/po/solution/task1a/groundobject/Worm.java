package pl.edu.pw.mini.po.solution.task1a.groundobject;

import java.util.Random;

public class Worm extends MassGroundObject {

	public Worm(int nutritionalValue) {
		super(nutritionalValue);
		this.mass = (new Random().nextDouble() / 2);
	}

	public String toString() {
		return "{}";
	}

}
