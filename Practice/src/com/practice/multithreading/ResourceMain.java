package com.practice.multithreading;

public class ResourceMain {

	public static void main(String[] args) {
		Resource resource = new Resource();
		new ResourceThread(resource, "Hi");
		new ResourceThread(resource, "Java");
		new ResourceThread(resource, "Multithreading");
	}

}
