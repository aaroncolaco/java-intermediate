package com.movies;

import java.io.BufferedReader;
import java.io.FileReader;

public class MovieFileReader {
	
	enum languageEnum{ english, hindi, marathi };
	
	private void readFile() throws Exception {
		BufferedReader br = new BufferedReader(new FileReader("./src/com/movies/movies.txt"));
		String line = "";
		String[] splitLinesStrings;

		while ((line = br.readLine()) != null) {
			splitLinesStrings = line.trim().split(",");
			
			// number of values should = 4
			if (splitLinesStrings.length != 4) {
				System.out.println("Incorrect Number of params");
				continue;
			}
			
			// language enum check
			boolean invalidLanguage = true;
			
			for (languageEnum enumVar : languageEnum.values()) {
				if (splitLinesStrings[2].equalsIgnoreCase(enumVar.toString()) ) {
					invalidLanguage = false;
					break;
				}
			}
			
			if (invalidLanguage) {
				System.out.println("Invalid language: " + splitLinesStrings[2]);
			}
			
			// movie id check
			try {
				Integer.parseInt(splitLinesStrings[0].trim());
			} catch (Exception e) {
				System.out.println(splitLinesStrings[0] + " - Not a valid movie id. Must be integer");
			}
		}
	}

	public static void main(String[] args) {
		MovieFileReader movieFileReader = new MovieFileReader();
		
		try {
			movieFileReader.readFile();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
