package com.multithreading.six;

import java.io.BufferedReader;
import java.io.FileReader;

public class MultiFileReader extends Thread {
	private String fileName;
	
	public MultiFileReader(String fileName) {
		this.fileName = fileName;
		this.start();
	}
	
	
	@Override
	public void run() {
		super.run();
		String line = "";
		int sleepTime = (int) (Math.random() * 1000 + 1000);
		
		try(BufferedReader br = new BufferedReader(new FileReader(fileName))) {
			
			while ((line = br.readLine()) != null) {
				System.out.println(this.fileName + " -> " + line);
				
				sleep(sleepTime);
			}
			
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
