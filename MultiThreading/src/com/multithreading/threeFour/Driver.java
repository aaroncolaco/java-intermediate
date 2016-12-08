package com.multithreading.threeFour;

public class Driver {

	public static void main(String[] args) {
		Storage storage = new Storage();
		
		Counter counter = new Counter(storage);
		Printer printer = new Printer(storage);
	}

}
