package com.animal;

public class Dog implements Animal {

	@Override
	public void eat() {
		// TODO Auto-generated method stub

	}

	@Override
	public void speak() {
		// TODO Auto-generated method stub

	}
	
	@Override
	public void legs(String name) {
		// TODO Auto-generated method stub
		Animal.super.legs(name);
		System.out.println(name + " has strong legs");
	}

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.legs("Tommy");
	}

}
