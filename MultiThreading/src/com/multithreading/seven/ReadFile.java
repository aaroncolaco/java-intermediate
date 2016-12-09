package com.multithreading.seven;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadFile extends Thread {
	private String fileName;
	FactorialCalculator factorialCalculator;
	
	public ReadFile(FactorialCalculator fc, String fileName) {
		this.factorialCalculator = fc;
		this.fileName = fileName;
		this.start();
	}
	
	@Override
	public void run() {
		super.run();
		String line = "";
		int number = 1;
		
		try (BufferedReader br = new BufferedReader(new FileReader(this.fileName))) {
			while ((line = br.readLine()) != null) {
				if (line.trim().isEmpty()) {
					this.factorialCalculator.setEndProg(true); // end prog since EOF
					break;
				}

				number = Integer.parseInt(line);
				this.factorialCalculator.setFactorial(number);
			}
			this.factorialCalculator.setEndProg(true); // end prog since no more lines
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
