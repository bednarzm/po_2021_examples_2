package pl.edu.pw.mini.po.solution.task1a.groundobject;

public abstract class GroundObject {

	/* protected is also accepted here */
	private int nutritionalValue;

	public GroundObject(int nutritionalValue) {
		this.nutritionalValue = nutritionalValue;
	}

	public int getNutritionalValue() {
		return nutritionalValue;
	}

}
