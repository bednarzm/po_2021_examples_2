package pl.edu.pw.mini.po.eight.collections;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Performance {

	private static final int MAX_LIST_ELEMENTS = 1000000;
	private static final double REMOVE_BY_ITERATOR_FACTOR = 10;

	public static void main(String[] args) {
		//showArrayListVsLinkedList();
		//showArrayListAndLinkedListVsSet();
		showArrayListAndLinkedListVsSet2Person();
		//showArrayListAndLinkedListVsSet2Person2();
	}

	private static void showArrayListVsLinkedList() {
		showArrayListVsLinkedListGetByIndex();
		showArrayListVsLinkedListRemoveByIterator();
		showArrayListVsLinkedListRemoveFirst();
	}

	private static void showArrayListVsLinkedListGetByIndex() {
		System.out.println();

		List<String> arrayList = new ArrayList<String>();
		List<String> linkedList = new LinkedList<String>();

		for (int i = 0; i < MAX_LIST_ELEMENTS; i++) {
			arrayList.add(i + "_");
			linkedList.add(i + "_");
		}

		Random random = new Random();
		long start = System.currentTimeMillis();
		for (int i = 0; i < 1000; i++) {
			arrayList.get(random.nextInt(MAX_LIST_ELEMENTS));
		}
		System.out.println("ArrayList get by index: " + (System.currentTimeMillis() - start));

		start = System.currentTimeMillis();
		for (int i = 0; i < 1000; i++) {
			linkedList.get(random.nextInt(MAX_LIST_ELEMENTS));
		}
		System.out.println("LinkedList get by index: " + (System.currentTimeMillis() - start));
	}

	private static void showArrayListVsLinkedListRemoveByIterator() {
		System.out.println();
		Random random = new Random();

		List<String> arrayList = new ArrayList<String>();
		List<String> linkedList = new LinkedList<String>();

		for (int i = 0; i < MAX_LIST_ELEMENTS; i++) {
			arrayList.add(i + "_");
			linkedList.add(i + "_");
		}

		long start = System.currentTimeMillis();
		Iterator<String> arrayListIterator = arrayList.iterator();
		while (arrayListIterator.hasNext()) {
			arrayListIterator.next();
			if (random.nextInt(10) == 0) {// usuwanie mniej wiecej co dziesiatego elementu
				arrayListIterator.remove();
			}
		}
		System.out.println("ArrayList remove (by Iterator) speed: " + (System.currentTimeMillis() - start));

		start = System.currentTimeMillis();
		Iterator<String> linkedListIterator = linkedList.iterator();
		while (linkedListIterator.hasNext()) {
			linkedListIterator.next();
			if (random.nextInt(10) == 0) {// usuwanie mniej wiecej co dziesiatego elementu
				linkedListIterator.remove();
			}
		}
		System.out.println("LinkedList remove (by iterator) speed: " + (System.currentTimeMillis() - start));
	}

	private static void showArrayListVsLinkedListRemoveFirst() {
		System.out.println();
		Random random = new Random();

		List<String> arrayList = new ArrayList<String>();
		List<String> linkedList = new LinkedList<String>();

		for (int i = 0; i < MAX_LIST_ELEMENTS; i++) {
			arrayList.add(i + "_");
			linkedList.add(i + "_");
		}

		long start = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			arrayList.remove(0);
		}
		System.out.println("ArrayList remove (first) speed: " + (System.currentTimeMillis() - start));

		start = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			linkedList.remove(0);
		}
		System.out.println("LinkedList remove (first) speed: " + (System.currentTimeMillis() - start));

	}

	public static void showArrayListAndLinkedListVsSet() {
		List<Integer> arrayList = new ArrayList<Integer>();
		List<Integer> linkedList = new LinkedList<Integer>();
		Set<Integer> set = new HashSet<>();

		for (int i = 0; i < MAX_LIST_ELEMENTS; i++) {
			arrayList.add(i);
			linkedList.add(i);
			set.add(i);
		}
		Random random = new Random();
		long start = System.currentTimeMillis();
		for (int i = 0; i < 3000; i++) {
			arrayList.contains(random.nextInt(MAX_LIST_ELEMENTS));
		}
		System.out.println("ArrayList contains speed: " + (System.currentTimeMillis() - start));

		start = System.currentTimeMillis();
		for (int i = 0; i < 3000; i++) {
			linkedList.contains(random.nextInt(MAX_LIST_ELEMENTS));
		}
		System.out.println("LinkedList contains speed: " + (System.currentTimeMillis() - start));

		start = System.currentTimeMillis();
		for (int i = 0; i < 3000; i++) {
			set.contains(random.nextInt(MAX_LIST_ELEMENTS));
		}
		System.out.println("Set contains speed: " + (System.currentTimeMillis() - start));
	}

	static class LightPerson {
		private static int idCounter;
		private int id;

		public LightPerson() {
			this.id = idCounter++;
		}
		
		
		
		@Override
		public int hashCode() {
			return 1000;
		}

		@Override
		public boolean equals(Object obj) {
			return this.id == ((LightPerson) obj).id;//tak odwaznie nie robimy 
		}

	}

	public static void showArrayListAndLinkedListVsSet2Person() {
		List<LightPerson> arrayList = new ArrayList<>();
		List<LightPerson> linkedList = new LinkedList<>();
		Set<LightPerson> set = new HashSet<>();

		System.out.println("Preparation started");
		int maxValue = 35000;
		Random random = new Random();
		for (int i = 0; i < maxValue; i++) {
			LightPerson person = new LightPerson();
			arrayList.add(person);
			linkedList.add(person);
			set.add(person);
		}

		System.out.println("Preprocessing done");

		long start = System.currentTimeMillis();
		for (int i = 0; i < 30; i++) {
			arrayList.contains(arrayList.get(random.nextInt(maxValue)));// ArrayList get po indeksie jest w czasie stalym
		}
		System.out.println("ArrayList contains speed: " + (System.currentTimeMillis() - start));

		start = System.currentTimeMillis();
		for (int i = 0; i < 30; i++) {
			linkedList.contains(arrayList.get(random.nextInt(maxValue)));
		}
		System.out.println("LinkedList contains speed: " + (System.currentTimeMillis() - start));

		start = System.currentTimeMillis();
		for (int i = 0; i < 30; i++) {
			set.contains(arrayList.get(random.nextInt(maxValue)));
		}
		System.out.println("Set contains speed: " + (System.currentTimeMillis() - start));
	}

	public static void showArrayListAndLinkedListVsSet2Person2() {
		Set<LightPerson> set = new HashSet<>();

		List<LightPerson> lightPersons = new ArrayList<>();
		
		Random random = new Random();
		long start = System.currentTimeMillis();
		for (int i = 0; i < 40000; i++) {
			LightPerson person = new LightPerson();
			//lightPersons.add(person);
			set.add(person);
		}
		System.out.println("Add same hashcode: " + (System.currentTimeMillis() - start));

	}

}
