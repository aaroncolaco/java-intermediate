package com.practice.multithreading;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("Inside Run");
	}
	
	public void start() {
		this.run();
	}

	public static void main(String[] args) {
		MyRunnable myRunnable = new MyRunnable();
		
		Thread thread = new Thread(myRunnable);
		
		thread.start();
	}

}
