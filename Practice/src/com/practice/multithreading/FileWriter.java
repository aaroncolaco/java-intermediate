package com.practice.multithreading;

public class FileWriter extends Thread{
	
	FileIO fileIO;
	
	public FileWriter(FileIO fileIO) {
		this.fileIO = fileIO;
		this.start();
	}
	
	@Override
	public void run() {
		super.run();
		while (true) {
			fileIO.appendToFile();
		}
	}
	
}
