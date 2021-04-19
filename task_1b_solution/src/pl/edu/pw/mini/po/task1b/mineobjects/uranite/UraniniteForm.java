package pl.edu.pw.mini.po.task1b.mineobjects.uranite;

public enum UraniniteForm {

	URANOPHANE(1), TORBERNITE(1.5), FOURMARIERITE(2.5);

	private double factor;

	private UraniniteForm(double factor) {
		this.factor = factor;
	}

	public double getFactor() {
		return factor;
	}

}
