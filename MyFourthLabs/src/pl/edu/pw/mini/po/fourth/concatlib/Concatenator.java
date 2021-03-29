package pl.edu.pw.mini.po.fourth.concatlib;

public abstract class Concatenator {

	private long before;

	protected abstract void concatenate();

	protected abstract void resetBuffer();

	private void startTimeMeasurement() {
		before = System.currentTimeMillis();
	}

	protected void processConcatenation(int iterations) {
		resetBuffer();
		startTimeMeasurement();
		for (int i = 0; i < iterations; i++) {
			concatenate();
		}
	}

	public void simulateConcatenation(int iterations) {
		processConcatenation(iterations);
		timeSummary();
	}

	protected void timeSummary() {
		long time = System.currentTimeMillis() - before;
		System.out.println(" Total time: " + time / 1000.0);
	}

}
