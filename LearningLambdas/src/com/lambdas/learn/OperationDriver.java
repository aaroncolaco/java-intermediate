package com.lambdas.learn;

public class OperationDriver {

	public static void main(String[] args) {
		
		Operation operation;
		int x = 10, y = 5;
		
		operation = (a, b) -> a + b;
		System.out.println("Add: " + operation.operations(x, y));
		
		operation = (a, b) -> a - b;
		System.out.println("Subtract: " + operation.operations(x, y));
		
		operation = (a, b) -> a * b;
		System.out.println("Multiply: " + operation.operations(x, y));
		
		operation = (a, b) -> a / b;
		System.out.println("Divide: " + operation.operations(x, y));
		
		operation = (a, b) -> a % b;
		System.out.println("Modulo: " + operation.operations(x, y));
		
		
	}

}
