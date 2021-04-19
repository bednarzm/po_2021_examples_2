package pl.edu.pw.mini.po.solution.task1a;

import pl.edu.pw.mini.po.solution.task1a.environment.Environment;
import pl.edu.pw.mini.po.solution.task1a.environment.mole.MoleSpecious;

public class Demonstrator {

	public static void main(String[] args) {
		Environment environment = new Environment(10, 10, 10, 20, MoleSpecious.EUROPAEA);
		environment.runMole();
	}

}
