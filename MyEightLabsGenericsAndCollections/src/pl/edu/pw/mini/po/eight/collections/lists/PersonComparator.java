package pl.edu.pw.mini.po.eight.collections.lists;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		return o1.getSurname().compareTo(o2.getSurname());
	}
	
}
