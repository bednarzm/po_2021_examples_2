package pl.edu.pw.mini.po.task1b.mineobjects.adit;

import java.util.Random;

import pl.edu.pw.mini.po.task1b.mineobjects.Chalcolite;
import pl.edu.pw.mini.po.task1b.mineobjects.MineObject;
import pl.edu.pw.mini.po.task1b.mineobjects.Rock;
import pl.edu.pw.mini.po.task1b.mineobjects.miner.Miner;
import pl.edu.pw.mini.po.task1b.mineobjects.uranite.Uraninite;

public class Adit {

	private MineObject[][] mineObjects;

	private Miner miner;

	/**
	 * Na potrzeby zadania, zakladamy ze parametry sa poprawne.
	 * 
	 * @param maxDistance            - maksymalny dystans pomiedzy korytarzami.
	 * @param mineCorrindorLength    - dlugosc korytarza.
	 * @param numberOfMineCorrindors - ilosc korytarzy.
	 */
	public Adit(int maxDistance, int mineCorrindorLength, int numberOfMineCorrindors) {
		Random random = new Random();
		mineObjects = new MineObject[(maxDistance + 1) * numberOfMineCorrindors][];
		int currentLevel = 0;
		while (numberOfMineCorrindors-- != 0) {
			currentLevel += random.nextInt(maxDistance + 1);
			this.mineObjects[currentLevel++] = createMineCorridor(mineCorrindorLength);
		}
		this.miner = new Miner(mineObjects);
	}

	private static MineObject[] createMineCorridor(int mineCorrindorLength) {
		MineObject[] result = new MineObject[mineCorrindorLength];

		for (int i = 0; i < result.length; i++) {
			result[i] = drawMineObject();
		}

		return result;
	}

	private static MineObject drawMineObject() {
		MineObject result;

		int drawnValue = new Random().nextInt(10);
		if (drawnValue == 0) {
			result = new Uraninite(50);
		} else if (drawnValue < 3) {
			result = new Chalcolite(50);
		} else {
			result = new Rock();
		}

		return result;
	}

	private void printMe() {
		System.out.println();
		for (MineObject[] corridor : mineObjects) {
			if (corridor != null) {
				System.out.print("->");
				for (MineObject corridorCelll : corridor) {
					System.out.print(corridorCelll);
				}
			} else {
				System.out.print(" ");
			}
			System.out.println();
		}
	}

	public void runAdit() {
		miner.goMiner();
		System.out.println("Income: " + miner.getIncome());
	}

}
