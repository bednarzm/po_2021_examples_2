package pl.edu.pw.mini.po.eight.collections.lists;

import java.util.Date;
import java.util.Random;

public class Person implements Comparable<Person>{

	private int id; 
	private String name;
	private String surname;

	private int random = new Random().nextInt();
	private Date date = new Date();
	
	public Person(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}

	public Person(int id, String name, String surname) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", surname=" + surname + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
/*
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (id != other.id)
			return false;
		return true;
	}

	*/
	
	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		
		if (obj instanceof Person) {
			Person externalPerson = (Person)obj;			
				result = this.name.equals(externalPerson.name);
		}

		return result;
	}

	public String getSurname() {
		return surname;
	}

	@Override
	public int compareTo(Person o) {
		return surname.compareTo(o.surname);
	}

}
