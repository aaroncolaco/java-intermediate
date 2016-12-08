package com.multithreading.threeFour;

public class Counter extends Thread {

	private int counter;
	private Storage storage = null;

	public Counter(Storage storage) {
		this.counter = 0;
		this.storage = storage;
		this.start();
	}

	@Override
	public void run() {
		super.run();

		while (true) {
			storage.setNumber(this.counter);
			System.out.println("Set: " + this.counter);
			this.counter++;
		}
	}
}
