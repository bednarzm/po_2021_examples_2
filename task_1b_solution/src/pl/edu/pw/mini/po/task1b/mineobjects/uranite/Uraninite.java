package pl.edu.pw.mini.po.task1b.mineobjects.uranite;

import java.util.Random;

import pl.edu.pw.mini.po.task1b.mineobjects.RadiactiveMineral;

public class Uraninite extends RadiactiveMineral {

	private UraniniteForm uraniniteForm;

	public Uraninite(double basicMarketValue) {
		super(basicMarketValue);
		this.uraniniteForm = UraniniteForm.values()[new Random().nextInt(UraniniteForm.values().length)];
	}

	@Override
	public double getModifiedMarketValue() {
		return basicMarketValue * this.uraniniteForm.getFactor();
	}

}
