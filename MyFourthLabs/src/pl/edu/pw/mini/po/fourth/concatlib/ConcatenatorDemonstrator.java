package pl.edu.pw.mini.po.fourth.concatlib;

public class ConcatenatorDemonstrator {
	
	public static void main(String...strings) {
		Concatenator concatenator = new ThreadSafeConcatenator();
		show(concatenator);
	}
	
	private static void show(Concatenator concatenator) {
		concatenator.simulateConcatenation(5000);
		
		if(concatenator instanceof ThreadSafeConcatenator) {
			ThreadSafeConcatenator threadSafeConcatenator = (ThreadSafeConcatenator)concatenator;
			
		} else if(concatenator instanceof NotThreadSafeConcatenator) {
			NotThreadSafeConcatenator threadSafeConcatenator = (NotThreadSafeConcatenator)concatenator;
			
		}
		
		
	}
	
}
