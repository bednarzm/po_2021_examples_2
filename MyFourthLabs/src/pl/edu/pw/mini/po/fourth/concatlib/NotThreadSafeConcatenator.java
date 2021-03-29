package pl.edu.pw.mini.po.fourth.concatlib;

public class NotThreadSafeConcatenator extends ThreadConcatenator {

	private StringBuilder stringBuilder = new StringBuilder();

	@Override
	protected void resetBuffer() {
		stringBuilder = new StringBuilder();
	}

	@Override
	protected void finish() {
		stringBuilder.toString();
	}

	@Override
	protected void concatenate() {
		stringBuilder.append("Add something");
	}

	/*Tak bylo wczesniej, bez refactoringu
	public void simulateConcatenation(int interations) {
		String result = "";

		System.out.println("Fastest and no thread safe String cancatenantion ");
		StringBuilder stringBuilder = new StringBuilder(result);
		long before = System.currentTimeMillis();
		for (int i = 0; i < 5000000; i++) {
			stringBuilder.append("Add something");
		}
		result = stringBuilder.toString();
		long time = System.currentTimeMillis() - before;
		System.out.println(" Total time: " + time / 1000.0);
	}*/

}
