package com.practice.multithreading;

public class ConsoleReader extends Thread {
FileIO fileIO;
	
	public ConsoleReader(FileIO fileIO) {
		this.fileIO = fileIO;
		this.start();
	}
	
	@Override
	public void run() {
		super.run();
		while (true) {
			fileIO.readFromConsole();
		}
	}
}
