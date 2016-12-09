package com.multithreading.five;

public class Driver {

	public static void main(String[] args) {
		FileSearcher fileSearcher1 = new FileSearcher("anDroid"); // thread 0 
		FileSearcher fileSearcher2 = new FileSearcher("Hello World"); // thread 1
		FileSearcher fileSearcher3 = new FileSearcher("Blah Blah"); // thread 2
		FileSearcher fileSearcher4 = new FileSearcher("How ARE"); // thread 3
	}
}
