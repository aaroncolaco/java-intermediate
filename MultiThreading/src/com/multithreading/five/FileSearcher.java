package com.multithreading.five;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileSearcher extends Thread {
	private String searchString, fileName;
	
	public FileSearcher(String string) {
		this.searchString = string.toLowerCase().trim();
		this.fileName = "./SearchFile.txt";
		
		this.start();
	}
	
	public void run() {
		super.run();
		String line = "";
		
		try(BufferedReader br = new BufferedReader(new FileReader(fileName))) {
			while ((line = br.readLine()) != null) {
				line = line.toLowerCase().trim();
				if (line.contains(this.searchString)) {
					System.out.println(this.getName() + " found search string: " + this.searchString);
					return;
				}
			}
			br.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
