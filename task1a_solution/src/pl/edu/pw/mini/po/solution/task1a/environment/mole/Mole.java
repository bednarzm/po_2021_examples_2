package pl.edu.pw.mini.po.solution.task1a.environment.mole;

import java.util.Random;

import pl.edu.pw.mini.po.solution.task1a.groundobject.GroundObject;

public class Mole implements MoleMotion {

	private MoleSpecious specious;
	private int nutritionalValue;
	private GroundObject[][] groundObjects;

	public Mole(MoleSpecious specious, GroundObject[][] groundObjects) {
		this.specious = specious;
		this.groundObjects = groundObjects;
		this.nutritionalValue = new Random().nextInt(41) + 200;
	}

	public void goMole() {
		int mLength = groundObjects.length;
		if (mLength > 0) {
			int nLength = groundObjects[0].length;
			Random random = new Random();
			int mIndex = random.nextInt(mLength);
			int nIndex = random.nextInt(nLength);
			if (this.groundObjects[mIndex][nIndex] != null) {
				int consumedNutritionalValue = this.groundObjects[mIndex][nIndex].getNutritionalValue();
				this.nutritionalValue += consumedNutritionalValue;
				System.out.println("Mniam! " + "consumed nutritional value: " + consumedNutritionalValue + " m index: "
						+ mIndex + " nIndex: " + nIndex);
				this.groundObjects[mIndex][nIndex] = null;
			} else {
				System.out.println(":(");
			}
		}
	}

	public String getNutritionalValue() {
		return String.valueOf(this.nutritionalValue);
	}

}
