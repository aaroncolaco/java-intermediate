package com.animal;

public interface Animal {
	
	public void eat();
	public void speak();
	
	public default void legs(String name) {
		System.out.println(name + " has 4 legs.");
	}
}
