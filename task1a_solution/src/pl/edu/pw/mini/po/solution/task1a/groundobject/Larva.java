package pl.edu.pw.mini.po.solution.task1a.groundobject;

import java.util.Random;

public class Larva extends MassGroundObject {

	public Larva(int nutritionalValue) {
		super(nutritionalValue);
		this.mass = (new Random().nextDouble() + 2);
	}

	public String toString() {
		return "@";
	}

}
