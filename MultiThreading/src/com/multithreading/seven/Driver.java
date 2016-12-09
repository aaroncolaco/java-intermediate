package com.multithreading.seven;

public class Driver {

	public static void main(String[] args) {
		FactorialCalculator factorialCalculator = new FactorialCalculator();
		
		ReadFile readFile = new ReadFile(factorialCalculator, "./Numbers.txt");
		PrintFact printFact = new PrintFact(factorialCalculator);
	}

}
