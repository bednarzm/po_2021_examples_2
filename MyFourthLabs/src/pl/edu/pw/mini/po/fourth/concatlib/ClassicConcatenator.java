package pl.edu.pw.mini.po.fourth.concatlib;

public class ClassicConcatenator extends Concatenator {

	@SuppressWarnings("unused")
	private String result = "";

	@Override
	protected void resetBuffer() {
		result = "";
	}

	@Override
	protected void concatenate() {
		result += "Add something";
	}

	/*Tak bylo wczesniej, bez refactoringu
	public void simulateConcatenation(int interations) {
		
		String result = "";

		System.out.println("Classic String cancatenation");
		long before = System.currentTimeMillis();
		for (int i = 0; i < 50000; i++) {
			result += "Add something";
		}
		long time = System.currentTimeMillis() - before;
		System.out.println(" Total time: " + time / 1000.0);
		
	}*/

}
