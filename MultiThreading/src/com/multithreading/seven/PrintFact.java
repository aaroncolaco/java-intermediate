package com.multithreading.seven;

public class PrintFact extends Thread {
	FactorialCalculator factorialCalculator;
	
	public PrintFact(FactorialCalculator fc) {
		this.factorialCalculator = fc;
		this.start();
	}
	
	@Override
	public void run() {
		super.run();
		
		while(!this.factorialCalculator.isEndProg()) {
			this.factorialCalculator.printFactorial();
		}
	}
}
