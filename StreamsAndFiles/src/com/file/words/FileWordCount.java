package com.file.words;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileWordCount {
	private int wordCount;
	BufferedReader bufferedReader;

	FileWordCount() {
		wordCount = 0;
	}

	public int countWords(String filePath) {
		String line = "";
		String[] splitLines;
		
		try {
			bufferedReader = new BufferedReader(new FileReader(filePath));
			while ((line = bufferedReader.readLine()) != null) {
				line = line.trim();
				
				// don't count empty lines
				if (! line.isEmpty()) {
					splitLines = line.split(" ");
					this.wordCount += splitLines.length;
				}
				
				/*
				 * without the if, empty line is also read. it is not split because no " " char
				 * so each empty line is stored in array as one element
				 * so length is 1 and it contributes to count
				 */
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return this.wordCount;
	}
}
