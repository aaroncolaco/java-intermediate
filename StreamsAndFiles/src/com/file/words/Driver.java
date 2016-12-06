package com.file.words;

public class Driver {

	public static void main(String[] args) {
		FileWordCount fileWordCount = new FileWordCount();
		
		int wordCount = fileWordCount.countWords("wordCountFile.txt");
		
		System.out.println("Word count: " + wordCount);
	}

}
