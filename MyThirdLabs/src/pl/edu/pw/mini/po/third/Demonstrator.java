package pl.edu.pw.mini.po.third;

import pl.edu.pw.mini.po.third.additional.Human;

public class Demonstrator {

	public static void main(String[] args) {
		
		//first();
		
		second();
		
	}

	private static void second() {
		
		String myString = "aaaa";
		myString = new String("hello");
		
		System.out.println(" My string : " + myString + "aaa");
		
		//String first = new String("jan");
		//String second = new String("jan");
		
		String first = "jan";
		String second = "janX";
		
		int a = 1;
		int b = 1;
		
		if(a == b) {
			System.out.println("The same int:)");
		} else {
			System.out.println("Not the same int :(");
		}
		
		System.out.println("Strings: " + ((Object)first) + " " + ((Object)second));
		if(first == second) {
			System.out.println("The same:)");
		} else {
			System.out.println("Not the same :(");
		}
		
		System.out.println("To jest oki: ");
		String third = null;
		if(third != null && third.equals(second)) {
			System.out.println("The same:)");
		} else {
			System.out.println("Not the same :(");
		}
		
		
		
	}
	
	private static void first() {
		Object object = new Object();
		
		System.out.println("My object: " + object);
		
		object = null;

		Machine machine = new Machine();
		machine.speed = 10;
		Human earlyHuman = new Human();
		Human human = new Human(10, "Piotr", "X");
		System.out.println("Human 1: " + human.name);
		Human human2 = new Human(10, "Jacek", "Y");

		System.out.println("Human 1: " + human.name + " human 2: " + human2.name);
		
		human.weight = 85.5;
		
		human.weight = 10;
		
		human.myMethod(10, 1.5, 1, 2, 3, 4, 6);
		
		Human.counter = 1;
		
	}
	
}
