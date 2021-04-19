package pl.edu.pw.mini.po.task1b.mineobjects;

public class Chalcolite extends RadiactiveMineral {

	public Chalcolite(double basicMarketValue) {
		super(basicMarketValue);
	}

	@Override
	public double getModifiedMarketValue() {
		return basicMarketValue;
	}

}
