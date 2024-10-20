package com.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class RunPerson {
	public static void main(String[] args) {
		Person p1 = new Person(1, "Sam", "US");
		Person p2 = new Person(2, "Dayana", "CZ");
		Person p3 = new Person(3, "Alexa", "UK");

		ArrayList<Person> persons = new ArrayList<>();
		persons.add(p1);
		persons.add(p2);
		persons.add(p3);

		Iterator<Person> ip = persons.iterator();

		for (Person p : persons) {
			System.out.println(p);
		}
		
		for(Person p:persons) {
			System.out.println(p.getId());
			System.out.println(p.getName());
			System.out.println(p.getCountry());
		}
		
		
		
		System.out.println("========== Using Iterator ==========");
		
		
		while(ip.hasNext()) {
			System.out.println(ip.next());
		}

	}

}
