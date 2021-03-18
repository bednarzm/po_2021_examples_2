package pl.edu.pw.mini.po.third.additional;

public class Human {
	
	public static final String GREETINGS = "Hello";
	
	public static int counter; 

	public int id;
	public int age = 125;
	public static String name;
	public String surname;
	public double weight; 
	private int hello;
	public int getHello() {
		return hello;
	}

	public void setHello(int hello) {
		this.hello = hello;
	}

	private String nationalId = "11231";
	protected int salary;
	
	public Human() {
		System.out.println("Constructor.");
	}
	
	{
		
	}
	
	public Human(int id, int age, String name, String surname, double weight) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
		this.surname = surname;
		this.weight = weight;
		
	}

	public Human(int age, String name, String surname) {
		this.id = ++counter;
		this.age = age;
		this.name = name;
		this.surname = surname;
	}
	
	public static void MyFirstStaticMethod(int...values) {
		
		//age = 6;a non-static field can not be referred from a static one
	}
	
	/**
	 * To jest nasza cudowna metoda. 
	 * @param value Podaj wartosc.
	 */
	public void myMethod(int value) {
		submethodFirst();
		submethodSecond();
		submethodThird();
		this.weight = 10;
		counter = 1;
	}
	
	public void myMethod(int value, double weight) {
		
	}
	
	public void myMethod(int value, double weight, int... values) {
		//values[0]
	}
	
	private void submethodFirst() {
		
	}
	private void submethodSecond() {
		
	}
	private void submethodThird() {
		
	}
	
	public void setNationalId(String nationalId) {
		this.nationalId = nationalId;
	}
	
	public String getNationalId() {
		return nationalId;
	}

	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	
}
