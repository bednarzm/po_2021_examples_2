package pl.edu.pw.mini.po.seventh;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {

	public static void main(String[] args) {
		
		//parseSomething("123a");
		
	}

	/**
	 * It must be a string value;
	 * @param something
	 */
	public static void parseSomethingOpt(String something) {
		
		try {
			int result = Integer.parseInt(something);
			System.out.println("Result: " + result);
		}catch(NumberFormatException numberFormatException) {
			numberFormatException.printStackTrace();
			System.out.println("The value: " + something + " is not a number!");
		}
		
		System.out.println("Bye!");
		
	}

	/**
	 * All values allowed. 
	 * @param something
	 */
	public static void parseSomethingPes(String something) {
		
		Pattern pattern = Pattern.compile("[/d*]");
		Matcher matcher = pattern.matcher(something);
		if(matcher.matches()) {
			int result = Integer.parseInt(something);
			System.out.println("Result: " + result);
		}

		System.out.println("Bye!");
		
	}
	
}
