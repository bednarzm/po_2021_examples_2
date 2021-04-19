package pl.edu.pw.mini.po.solution.task1a.environment;

import java.util.Random;

import pl.edu.pw.mini.po.solution.task1a.environment.mole.Mole;
import pl.edu.pw.mini.po.solution.task1a.environment.mole.MoleMotion;
import pl.edu.pw.mini.po.solution.task1a.environment.mole.MoleSpecious;
import pl.edu.pw.mini.po.solution.task1a.groundobject.GroundObject;
import pl.edu.pw.mini.po.solution.task1a.groundobject.Larva;
import pl.edu.pw.mini.po.solution.task1a.groundobject.MassGroundObject;
import pl.edu.pw.mini.po.solution.task1a.groundobject.Soil;
import pl.edu.pw.mini.po.solution.task1a.groundobject.Worm;

public class Environment {

	private static final int WORM_NUTRITIONAL_VALUE = 3;

	private GroundObject[][] groundObjects;
	private MoleMotion moleMotion;

	public Environment(int m, int n, int nLarvas, int nWorms, MoleSpecious moleSpecious) {
		this(m, n, nLarvas, nWorms);
		this.moleMotion = new Mole(moleSpecious, groundObjects);
	}

	public Environment(int m, int n, int nLarvas, int nWorms) {
		this.groundObjects = new GroundObject[m][n];
		Random random = new Random();

		for (int i = 0; i < nLarvas; i++) {
			putObjectToEmptyPlace(new Larva(random.nextInt(3) + 3), m, n);
		}

		for (int i = 0; i < nWorms; i++) {
			putObjectToEmptyPlace(new Worm(WORM_NUTRITIONAL_VALUE), m, n);
		}

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (this.groundObjects[i][j] == null) {
					this.groundObjects[i][j] = new Soil(0);
				}
			}
		}

	}

	public void runMole() {
		for (int i = 0; i < 10; i++) {
			moleMotion.goMole();
			printMe();
		}
	}

	private void putObjectToEmptyPlace(MassGroundObject massGroundObject, int m, int n) {
		Random random = new Random();
		int a, b;
		do {
			a = random.nextInt(m);
			b = random.nextInt(n);
		} while (this.groundObjects[a][b] != null);
		this.groundObjects[a][b] = massGroundObject;
	}

	public void printMe() {
		System.out.println();
		for (int i = 0; i < groundObjects.length; i++) {
			System.out.println();
			for (int j = 0; j < groundObjects[0].length; j++) {
				if (this.groundObjects[i][j] == null) {
					System.out.print(" ");
				} else {
					System.out.print(this.groundObjects[i][j]);
				}
			}
		}
		System.out.println();
	}

}
