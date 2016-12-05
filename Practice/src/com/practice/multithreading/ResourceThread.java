package com.practice.multithreading;

public class ResourceThread extends Thread{
	Resource resource;
	String message;
	
	public ResourceThread(Resource resource, String message) {
		this.resource = resource;
		this.message = message;
		this.start();
	}
	
	public void run(){
		resource.printMessage(message);
	}
}
