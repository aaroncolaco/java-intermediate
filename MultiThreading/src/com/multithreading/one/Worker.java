package com.multithreading.one;


public class Worker extends Thread{
	
	public Worker(String name) {
		setName(name);
	}
	
	public void run() {
		super.run();
		for (int i = 0; i < 3; i++) {
			System.out.println(getName() + "Instance " + i);			
		}
	}
	
	public static void main(String[] args) {
		Worker t1 = new Worker("T1");
		Worker t2 = new Worker("T2");
		Worker t3 = new Worker("T3");
		
		t1.setPriority(MIN_PRIORITY);
		t2.setPriority(NORM_PRIORITY);
		t3.setPriority(MAX_PRIORITY);
		
		t1.start();
		t2.start();
		t3.start();
	}
}
