package com.practice.multithreading;

public class ThreadDemo extends Thread {
	
	
	public ThreadDemo(String name) {
		this.setName(name);
		this.start();
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(getName() + " - " + i);
			try {
				sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		ThreadDemo t1 = new ThreadDemo("ONE");
		ThreadDemo t2 = new ThreadDemo("TWO");
		ThreadDemo t3 = new ThreadDemo("THREE");
		
		t1.setPriority(6);
		t2.setPriority(4);
		t3.setPriority(10);
		
//		System.out.println(t1);
//		System.out.println(t2);
//		System.out.println(t3);
		
//		t1.start();
//		t2.start();
//		t3.start();
		
	}
}
