package com.practice.multithreading;

public class MyThread extends Thread{
	
	@Override
	public void run() {
		// 3. Running - run method is executing
		super.run();
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread: " + i);
			try {
				sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	// 4. Dead state - complete / interrupted / terminated explicitly
	
	public static void main(String[] args) {
		// 1. New Born - creation of thread
		MyThread myThread = new MyThread();
		
		// 2. Ready or Runnable - ready to run
		myThread.start();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Main method: " + i);
			try {
				sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
