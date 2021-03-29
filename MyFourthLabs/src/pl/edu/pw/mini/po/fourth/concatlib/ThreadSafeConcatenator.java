package pl.edu.pw.mini.po.fourth.concatlib;

public class ThreadSafeConcatenator extends ThreadConcatenator {

	private StringBuffer stringBuffer = new StringBuffer();

	@Override
	protected void resetBuffer() {
		stringBuffer = new StringBuffer();
	}

	@Override
	protected void finish() {
		stringBuffer.toString();
	}

	@Override
	protected void concatenate() {
		stringBuffer.append("Add something");
	}

	/*
	Tak bylo wczesniej, bez refactoringu
	public void simulateConcatenation(int interations) {
		
		String result = "";

		System.out.println("Fast and thread safe String cancatenantion ");
		StringBuffer stringBuffer = new StringBuffer(result);
		long before = System.currentTimeMillis();
		for (int i = 0; i < 5000000; i++) {
			stringBuffer.append("Add something");
		}
		result = stringBuffer.toString();
		long time = System.currentTimeMillis() - before;
		System.out.println(" Total time: " + time / 1000.0);
		
	}*/

}
