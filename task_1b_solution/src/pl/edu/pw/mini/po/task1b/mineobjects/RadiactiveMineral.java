package pl.edu.pw.mini.po.task1b.mineobjects;

import java.util.Random;

public abstract class RadiactiveMineral extends MineObject {

	protected int radioactiveness;

	public RadiactiveMineral(double basicMarketValue) {
		super(basicMarketValue);
		this.radioactiveness = new Random().nextInt(251) + 700;
	}

}
