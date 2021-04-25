package pl.edu.pw.mini.po.eight.collections.sets;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class SetMapDemonstrator {

	public static void main(String[] args) {
		//demonstrateSets1();
		//demonstrateSets2();
		//demonstrateSets3();
		
		demonstrateMaps();
		
	}
	
	private static void demonstrateMaps() {
		Map<String, String> danceMap = new HashMap<>();
		danceMap.put("Iksinski", "Kasiowska");
		danceMap.put("Iksinski1", "Kasiowska");
		danceMap.put("Iksinski12", "Kasiowska");
		
		for(Entry<String, String> entry : danceMap.entrySet()) {
			System.out.println("Entry: " + entry.getKey() + " " + entry.getValue());
		}
		
		Map<String, String> linkedDanceMap = new LinkedHashMap<>();
		
		Map<String, String> treeDanceMap = new HashMap<>();
		
		/*
		Istotne metody:
		danceMap.put(key, value);
		danceMap.get(key);
		danceMap.containsKey(key);
		danceMap.containsValue(value);
		danceMap.remove(key);
		danceMap.keySet();
		danceMap.values();
		danceMap.entrySet();
		danceMap.clear();
		danceMap.size();
		*/
		
	}
	
	private static void demonstrateSets3() {
		Set<Car> cars = new TreeSet<Car>();
		cars.add(new Car("Wolga", "GAZ"));
		cars.add(new Car("Volvo", "XC60"));
		cars.add(new Car("Saab", "93"));
		
		System.out.println("Treeset: " + cars);
		
	}

	private static void demonstrateSets2() {
		Set<Car> carSet = new HashSet<Car>();
		Car saab = new Car("Saab", "93");
		carSet.add(saab);
		
		System.out.println("Set info: " + carSet.size() + " " + carSet.contains(saab));
		Car saabTheSmeApparently = new Car("Saab", "93");
		System.out.println("Set info: " + carSet.size() + " " + carSet.contains(saabTheSmeApparently));
		
		Set<ExperimentalObject> experimentalObjects = generateSet();
		
		System.out.println(experimentalObjects);
		
		Set<NaiveExperimentalObject> naiveObjects = new HashSet<NaiveExperimentalObject>();
		NaiveExperimentalObject naiveExperimentalObject = new NaiveExperimentalObject();
		naiveObjects.add(naiveExperimentalObject);
		System.out.println("Contains? " + naiveObjects.contains(naiveExperimentalObject));
		naiveExperimentalObject.setHashcodeDisturbFacotr(10);
		System.out.println("Contains? " + naiveObjects.contains(naiveExperimentalObject));
		
	}
	
	private static Set<ExperimentalObject> generateSet(){
		Set<ExperimentalObject> result = new HashSet<ExperimentalObject>();
		
		result.add(new ExperimentalObject());
		result.add(new ExperimentalObject());
		result.add(new ExperimentalObject());
		
		return result;
	}
	
	private static void demonstrateSets1() {

		Set<String> mySet = new HashSet<String>();
		mySet.add("Ania");
		mySet.add("Piotrek");
		mySet.add("Adam");
		mySet.add("Stefanek 1900");
		System.out.println("HashSet: " + mySet);

		Set<String> myLinkedSet = new LinkedHashSet<String>();
		myLinkedSet.add("Ania");
		myLinkedSet.add("Piotrek");
		myLinkedSet.add("Adam");
		myLinkedSet.add("Stefanek 1900");
		System.out.println("LinkedHashSet: " + myLinkedSet);

		/*
		Istotne metody:
		mySet.add(e);
		mySet.addAll(c);
		mySet.contains(o);
		mySet.remove(o);
		mySet.size();
		mySet.clear();
		mySet.iterator();
		mySet.removeAll(c);
		*/
		
	}
}
