package pl.edu.pw.mini.po.task1b.mineobjects;

import pl.edu.pw.mini.po.task1b.mineobjects.evaluator.MineryObjectEvaluator;

public abstract class MineObject implements MineryObjectEvaluator {

	protected double basicMarketValue;

	public MineObject(double basicMarketValue) {
		this.basicMarketValue = basicMarketValue;
	}

	@Override
	public String toString() {
		return String.valueOf(basicMarketValue);
	}

}
