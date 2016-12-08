package com.multithreading.threeFour;

public class Printer extends Thread {

	private Storage storage = null;

	public Printer(Storage storage) {
		this.storage = storage;
		this.start();
	}

	@Override
	public void run() {
		int number = 0;

		super.run();

		while (true) {
			number = storage.getNumber();
			System.out.println("Got: " + number);
		}
	}
}
