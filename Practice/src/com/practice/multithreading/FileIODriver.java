package com.practice.multithreading;

public class FileIODriver {
	public static void main(String[] args) {
		
		FileIO fileIO = new FileIO();
		ConsoleReader consoleReader = new ConsoleReader(fileIO);
		FileWriter fileWriter = new FileWriter(fileIO);
	}

}
