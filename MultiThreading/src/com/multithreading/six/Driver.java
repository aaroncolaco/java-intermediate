package com.multithreading.six;

public class Driver {

	public static void main(String[] args) {
		String fileName1 , fileName2;
		MultiFileReader multiFileReader1, multiFileReader2;
		
		fileName1 = "./DisplayFile1.txt";
		fileName2 = "./DisplayFile2.txt";
		
		multiFileReader1 = new MultiFileReader(fileName1);
		multiFileReader2 = new MultiFileReader(fileName2);
	}

}
