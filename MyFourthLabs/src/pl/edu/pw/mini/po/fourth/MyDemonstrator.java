package pl.edu.pw.mini.po.fourth;

import java.util.Random;

public class MyDemonstrator {

	public static void main(String[] args) throws InterruptedException {
		firstMethod();
		testClassicStringConcatenation();
		testThreadSafeStringConcatenation();
		testFastestThreadNotSafeStringConcatenation();
	}
	
	private static void firstMethod() {
		String myString = "myString ";
		
		int counter;
		Integer integer = Integer.valueOf(11);
		Double doube; 
		int parsedInteger = Integer.parseInt("1234");
		Float myFloat; 
		
		Long myLong = 1l;
		
		if(myLong == 26) {
			
		}
		
		integer.toString();
		RepresentMe representMe = new RepresentMe();
		System.out.println("Parsed int: " + integer);
		System.out.println("Reprezent me: " + representMe.toString());
		
		Math.pow(2, 2);
		Random myRandom = new Random();
		System.out.println("" + (myRandom.nextInt(20) + 100));
		
		for(int i=0;i<50;i++) {
			System.out.println("Random value: " + (myRandom.nextInt(5) + 5));
		}
		
		
		System.out.println("First " + "Second " + "Third " + "Fourth " + "Five ");
		
		System.out.println(new StringBuffer().append("First ").append("Second ").append("Third ").append("Fourth ").append("Five "));
		
		System.out.println("First ".concat("Second ").concat("Third"));
	}
	
	private static void testClassicStringConcatenation() {
		String result = "";
		
		System.out.println("Classic String cancatenation");
		long before = System.currentTimeMillis();
		for(int i=0;i<50000;i++) {
			result += "Add something";
		}
		long time = System.currentTimeMillis() - before;
		System.out.println(" Total time: " + time/1000.0);
		
	}
	
	private static void testThreadSafeStringConcatenation() {
		String result = "";
		
		System.out.println("Fast and thread safe String cancatenantion ");
		StringBuffer stringBuffer = new StringBuffer(result);
		long before = System.currentTimeMillis();
		for(int i=0;i<5000000;i++) {
			stringBuffer.append("Add something");
		}
		result = stringBuffer.toString();
		long time = System.currentTimeMillis() - before;
		System.out.println(" Total time: " + time/1000.0);
		
	}
	
	private static void testFastestThreadNotSafeStringConcatenation() {
		String result = "";
		
		System.out.println("Fastest and no thread safe String cancatenantion ");
		StringBuilder stringBuilder = new StringBuilder(result);
		long before = System.currentTimeMillis();
		for(int i=0;i<5000000;i++) {
			stringBuilder.append("Add something");
		}
		result = stringBuilder.toString();
		long time = System.currentTimeMillis() - before;
		System.out.println(" Total time: " + time/1000.0);
		
	}
	
}
