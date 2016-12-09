package com.methodRefs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonDriver {
	public static void main(String[] args) {
		Person p1, p2, person;
		List<Person> personsList = new ArrayList<>();
		
		p1 = new Person();
		p2 = new Person();
		person = new Person();
		
		p1.setAge(22);
		p1.setName("John Doe");
		
		p2.setAge(25);
		p2.setName("Jane Doe");
		
		personsList.add(p1);
		personsList.add(p2);
		
		System.out.println("Before sorting: " + personsList);
		
		System.out.println("\nUsing instance methods to sort");
		
		Collections.sort(personsList, person::compareByName);
		System.out.println("Sort by name: " + personsList);
		
		Collections.sort(personsList, person::compareByAge);
		System.out.println("Sort by age: " + personsList);
		
		
		System.out.println("\nUsing static methods to sort");
		
		Collections.sort(personsList, Person::compareByNameStatic);
		System.out.println("Sort by name: " + personsList);
		
		Collections.sort(personsList, Person::compareByAgeStatic);
		System.out.println("Sort by age: " + personsList);
	}
}
