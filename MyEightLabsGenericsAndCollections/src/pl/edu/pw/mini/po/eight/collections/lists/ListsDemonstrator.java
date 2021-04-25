package pl.edu.pw.mini.po.eight.collections.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;
import java.util.Stack;

public class ListsDemonstrator {

	public static void main(String[] args) {
		demonstrateStack();
		demonstrateLists();
		demonstrateLists2();
	}

	public static void demonstrateStack() {

		Stack<String> myStack = new Stack<>();
		myStack.add("Pitrek");
		myStack.add("Asia");
		myStack.add("Alicja");
		myStack.add("Zenon");

		System.out.println("Stack: " + myStack);
		myStack.add("Adamo");
		System.out.println("Stack: " + myStack);

		System.out.println("Pierwszy element: " + myStack.peek());

		System.out.println("Pop: " + myStack.pop());
		System.out.println("Stack: " + myStack);
		System.out.println("Pop: " + myStack.pop());
		System.out.println("Stack: " + myStack);
		
		//Istotne metody
		/*
		myStack.pop();
		myStack.push(item);
		myStack.peek();
		myStack.remove(index)
		myStack.size();
		myStack.clear();
		myStack.empty();
		myStack.listIterator();
		myStack.iterator();
		*/
		
	}

	public static void demonstrateLists() {

		List<String> myArrayList = new ArrayList<String>();
		myArrayList.add("Pitrek");
		myArrayList.add("Asia");
		myArrayList.add("Alicja");
		String zenon1 = new String("Zenon");
		myArrayList.add(zenon1);

		System.out.println("List " + myArrayList);
		System.out.println("List " + myArrayList.size());
		for (String string : myArrayList) {
			System.out.println("List element: " + string);
		}
		for (int i = 0; i < myArrayList.size(); i++) {
			System.out.println("List element by index: " + i + " " + myArrayList.get(i));
		}

		String zenon2 = new String("Zenon");
		myArrayList.add(zenon2);
		System.out.println("List 2 x Zenon " + myArrayList);

		System.out.println("zenon1 == zenon2" + zenon1 == zenon2);
		System.out.println("zenon1 equals zenon2" + zenon1.equals(zenon2));

		//Pamietamy o equals!
		/*
		Istotne metody:
		myArrayList.add(e)
		myArrayList.addAll();
		myArrayList.clear();
		myArrayList.contains(o);
		myArrayList.indexOf(o);
		myArrayList.isEmpty();
		myArrayList.iterator();
		myArrayList.listIterator();
		myArrayList.remove(index);
		myArrayList.size();
		myArrayList.get(index);
		*/
	}

	private static void demonstrateLists2() {

		List<Person> myZenonsList = new ArrayList<Person>();
		Person zenon1 = new Person(1, "Zenon", "Nowak");
		Person zenon2 = new Person(1, "Zenon", "Nowak");

		myZenonsList.add(zenon1);
		System.out.println("zenon1 == zenon2 " + (zenon1 == zenon2));
		System.out.println("zenon1 equals zenon2 " + zenon1.equals(zenon2));

		System.out.println("Last list: " + myZenonsList);
		System.out.println("list constins Zenon1: " + myZenonsList.contains(zenon1));
		System.out.println("list constins Zenon2: " + myZenonsList.contains(zenon2));

		myZenonsList.add(zenon1);

		List<Person> persons = new ArrayList<Person>();
		persons.add(new Person(2, "Piotr", "Skoczylas"));
		persons.add(new Person(3, "Piotr", "Zyla"));

		persons.addAll(myZenonsList);

		System.out.println("All of: " + persons + " size: " + persons.size());

		Iterator<Person> personIterator = persons.iterator();
		while (personIterator.hasNext()) {
			Person iteratedPerson = personIterator.next();
			System.out.println("Person: " + iteratedPerson);
			if (iteratedPerson.equals(zenon1)) {
				persons.remove(iteratedPerson);
			}
		}

		try {
			System.out.println("All of after removing: " + persons + " size: " + persons.size());
			for (Person person : persons) {
				if (person.equals(zenon1)) {
					persons.remove(person);
				}
			}
			// fdsfdsfdfdsfds
			// fdsfdsfds
			// fdsfdsfds
		} catch (ConcurrentModificationException concurrentModificationException) {
			// concurrentModificationException.printStackTrace();
		} finally {
			// posprzatac
		}

		List<Person> tempList1 = List.of(new Person("m", "b"), new Person("a", "c"), new Person("k", "l"));
		List<Person> tempList2 = Arrays.asList(new Person("m", "b"), new Person("a", "c"), new Person("k", "l"));
		System.out.println("Temp list1: " + tempList1.getClass());
		// tempList1.add(new Person("", ""));
		System.out.println("Temp list2: " + tempList2.getClass());
		// tempList2.add(tempList2.iterator());

		List<Person> tempList3 = new ArrayList<Person>();
		tempList3.add(new Person("a", "zzzz"));
		tempList3.add(new Person("a", "a1"));
		tempList3.add(new Person("a", "a3"));
		tempList3.add(new Person("a", "a2"));
		tempList3.add(new Person("a", "aaaaa"));
		System.out.println("Temp list3: " + tempList3.getClass());

		// Collections.sort(persons);
		System.out.println("Before : " + persons);
		Collections.shuffle(persons);
		System.out.println("After: " + persons);

		LinkedList<String> linkedList = new LinkedList<String>();
		
		System.out.println("List iterator:");
		ListIterator<Person> listIterator = tempList3.listIterator();
		while(listIterator.hasNext()) {
			System.out.println(listIterator.next());
			if(new Random().nextBoolean()) {
				if(listIterator.hasPrevious()) {
					System.out.println("Prev: " + listIterator.previous());
				}
			}
		}
		
		System.out.println("\nBefore sort: " + tempList3);
		Collections.sort(tempList3);
		System.out.println("\nAfter sort: " + tempList3);
		/* Opcja z klasa anonimowa
		Collections.sort(tempList3, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return 0;
			}
			
		});
		*/
		
		Collections.sort(tempList3, new PersonComparator());
		System.out.println("\nAfter 2-nd sort: " + tempList3);
	}


	
	
}
 