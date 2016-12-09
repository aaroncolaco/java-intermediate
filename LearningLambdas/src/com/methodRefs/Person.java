package com.methodRefs;

public class Person {

	private int age;
	private String name;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	public int compareByAge(Person p1, Person p2) {
		return p1.age - p2.age;
	}

	public int compareByName(Person p1, Person p2) {
		return p1.name.compareTo(p2.name);
	}
	
	// ******** or can have static methods too
	public static int compareByAgeStatic(Person p1, Person p2) {
		return p1.age - p2.age;
	}

	public static int compareByNameStatic(Person p1, Person p2) {
		return p1.name.compareTo(p2.name);
	}

}
