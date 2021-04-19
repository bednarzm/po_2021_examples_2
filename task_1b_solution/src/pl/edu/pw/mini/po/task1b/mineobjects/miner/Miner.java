package pl.edu.pw.mini.po.task1b.mineobjects.miner;

import pl.edu.pw.mini.po.task1b.mineobjects.MineObject;

public class Miner {

	private double income;

	private MineObject[][] mineObjects;

	public Miner(MineObject[][] mineObjects) {
		this.mineObjects = mineObjects;
	}

	public void goMiner() {
		for (MineObject[] corridor : mineObjects) {
			if (corridor != null) {
				for (int i = 0; i < corridor.length; i++) {
					if (corridor[i] != null) {
						this.income += corridor[i].getModifiedMarketValue();
					}
					corridor[i] = null;
				}
			}
		}
	}

	public double getIncome() {
		return income;
	}
}
