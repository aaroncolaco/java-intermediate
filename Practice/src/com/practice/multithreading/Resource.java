package com.practice.multithreading;

public class Resource {
	public synchronized void printMessage(String message) {
		System.out.println("[" + message);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("]");
	}
}
