package pl.edu.pw.mini.po.eight;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Performance {
	
	public static void main(String[] args) {
		showArrayListVsLinkedList();
		//showArrayListAndLinkedListVsSet();
	}

	public static void showArrayListVsLinkedList() {
		
		List<Integer> arrayList = new ArrayList<Integer>();
		List<Integer> linkedList = new LinkedList<Integer>();
		
		for(int i=0;i<10000000;i++) {
			arrayList.add(i);
			linkedList.add(i);
		}
		
		long start = System.currentTimeMillis();
		for(int i=0;i<1000000;i+=10000) {
			arrayList.remove(i);
		}
		System.out.println("ArrayList delete speed: " + (System.currentTimeMillis() - start));
		
		start = System.currentTimeMillis();
		for(int i=0;i<1000000;i+=10000) {
			linkedList.remove(i);
		}
		System.out.println("LinkedList delete speed: " + (System.currentTimeMillis() - start));

	}

	public static void showArrayListAndLinkedListVsSet() {
		List<Integer> arrayList = new ArrayList<Integer>();
		List<Integer> linkedList = new LinkedList<Integer>();
		Set<Integer> set = new HashSet<>();
		
		for(int i=0;i<10000000;i++) {
			arrayList.add(i);
			linkedList.add(i);
			set.add(i);
		}
		
		long start = System.currentTimeMillis();
		for(int i=0;i<10000000;i+=100000) {
			arrayList.contains(i);
		}
		System.out.println("ArrayList contains speed: " + (System.currentTimeMillis() - start));
		
		start = System.currentTimeMillis();
		for(int i=0;i<10000000;i+=100000) {
			linkedList.contains(i);
		}
		System.out.println("LinkedList contains speed: " + (System.currentTimeMillis() - start));
		
		start = System.currentTimeMillis();
		for(int i=0;i<10000000;i+=100000) {
			set.contains(i);
		}
		System.out.println("Set contains speed: " + (System.currentTimeMillis() - start));
	}
	
}
