package com.multithreading.seven;

public class FactorialCalculator {
	private int factorial, num;
	private boolean factSet, endProg;
	
	public FactorialCalculator() {
		this.factorial = 1;
		factSet = false;
		endProg = false;
	}
	
	/*
	 * if factSet == true:
	 * 	wait()
	 * else:
	 * 	set set num & factorial, factSet=true, notify
	 */
	public synchronized void setFactorial(int number) {
		if (factSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		this.num = number;
		this.factorial = this.calculateFact(number);
		factSet = true;
		notify();
	}
	
	/*
	 * if factSet == false:
	 * 	wait()
	 * else:
	 * 	set factSet=true, print fact, reset fact =1, notify()
	 */
	public synchronized void printFactorial() {
		if (!factSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		System.out.println("Factorial of " + this.num + ": " + this.factorial);
		factSet = false; // since consumed and printed 
		this.factorial = 1;
		notify();
	}

	private int calculateFact(int number) {
		if (number < 2) {
			return this.factorial;
		}
		this.factorial *= number;
		
		return calculateFact(--number);  // O(n) since no stack. tail call optimization
	}

	public boolean isEndProg() {
		return endProg;
	}

	public void setEndProg(boolean endProg) {
		this.endProg = endProg;
	}
}
