package pl.edu.pw.mini.po.fourth.concatlib;
/**
 * 
 * Posrednia klasa wplatajaca czesc wspolna podklas (metoda finish())
 * do procesu pomiaru laczenia Stringow. 
 *
 */
public abstract class ThreadConcatenator extends Concatenator {

	protected abstract void finish();

	@Override
	public void simulateConcatenation(int iterations) {
		processConcatenation(iterations);
		finish();
		timeSummary();
	}

}
