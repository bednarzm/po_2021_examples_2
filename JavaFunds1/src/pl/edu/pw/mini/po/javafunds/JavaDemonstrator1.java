package pl.edu.pw.mini.po.javafunds;

import java.util.Random;

public class JavaDemonstrator1 {

	public static void main(String[] args) {

		//basics();
		//loops();
		//additionals();
		
	}

	private static void additionals() {
		System.out.println("TEST1");
		String first = "Baeldung"; 
		String second = "Baeldung"; 
		System.out.println("String pool XXX: " + (first == second));
		System.out.println("TEST2");
		
		Integer a = 100;
		Integer b = 100;
		
		Integer c = new Integer(100);
		Integer d = new Integer(100);

		System.out.println(" > " + (a == b));
		System.out.println(" > " + (c == d));
		
		String tralala = "tralala";
		String common = "";
		String result;
		long before = System.currentTimeMillis();
		for(int i=0;i<1000_00;i++) {
			common+= tralala;
		}
		long time = System.currentTimeMillis() - before;
		System.out.println("Without StringBuffer: " + time);
		
		before = System.currentTimeMillis();
		StringBuffer myStringBuffer = new StringBuffer();
		for(int i=0;i<1000_000;i++) {
			myStringBuffer.append(tralala);
		}
		result = myStringBuffer.toString();
		
		time = System.currentTimeMillis() - before;
		System.out.println("StringBuffer: " + time);
		
		before = System.currentTimeMillis();
		StringBuilder myStringBuilder = new StringBuilder();
		for(int i=0;i<1000_000;i++) {
			myStringBuilder.append(tralala);
		}
		result = myStringBuilder.toString();
		
		time = System.currentTimeMillis() - before;
		System.out.println("StringBuilder: " + time);
	}
	
	private static void basics() {
//		System.out.println("Hello!");
		System.out.print("One ");
		System.out.print("Two ");
		System.out.print("Three ");
		System.out.println();
		System.out.print("Four ");

		byte myByte = 123;
		System.out.println("The value: " + myByte);

		short nrPoety = 1000;

		char mycha = 100;

		int myInt = 200_000_000;

		long theBiggestRange = 100_000_000_000_000l;

		float lowerPrec = 1.5f;

		double gretherPrec = 10.10009;

		// int short

		int sum = nrPoety;

		int biggerOne = 1000000000;

		short smallerOne = (short) biggerOne;

		int smallerInt = 10000;
		smallerOne = (short) smallerInt;

		int[] myArray = new int[10];
		// index 0->n-1

		myArray[2] = 7;

		System.out.println("MyArray[0]: " + myArray[0] + " MyArray[0]: " + myArray[2] + "length: " + myArray.length);

		int[] myArray2 = { 1, 2, 3 };

		int[][] myMatrix = { { 1, 2 }, { 3, 4 } };

		int[][] myMatrixInitializedLater = new int[10][];

		myMatrixInitializedLater[0] = new int[10];

		int[][][][] multiDim = { { { { 1, 2, 3, 4 } } } };

		byte promotedSum;

		byte substract1 = 1;
		byte substract2 = 1;

		promotedSum = (byte) (substract1 + substract2);

		long[] empty = null;

		// System.out.println("Empty array: " + empty[1]);

		boolean flag = true;
		if (flag) {

		} else {

		}

		short shortFlag = 10;
		if (shortFlag == 10) {

		} else if (shortFlag == 11) {

		} else {

		}

		int result;
		if (shortFlag == 10) {
			result = 1;
		} else {
			result = 2;
		}

		result = shortFlag == 10 ? 1 : 2;

		if (shortFlag == 10) {
			result = 1;
		} else if (shortFlag == 11) {
			result = 2;
		} else {
			result = 3;
		}

		result = shortFlag == 10 ? 1 : shortFlag == 11 ? 2 : 3;

		switch (shortFlag) {
		case 10:
			break;
		case 11:
		case 12:
		case 13:

			break;
		default:

		}

		if (true) {
			if (false) {
				if (shortFlag == 1) {

				}
			}
		}

		// Moj komentarz.
		/*
		 * int s; int y;
		 */

		int s;
		int y;

	}

	/**
	 * Ta metoda robi to i to.
	 */
	private static void loops() {
		
		for (int i = 0; i < 10; i++) {
			System.out.print("I value: " + i);
		}
		
	}

}
