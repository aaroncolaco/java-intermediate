package com.collections.uniquechar;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CharCounter {
	private static Map<String, Integer> cachedCharMap;

	CharCounter() {
		cachedCharMap = new HashMap<String, Integer>();
	}

	public int getUniqueChars(String sentence) {
		sentence = sentence.toLowerCase().trim().replace(" ", "");
		int uniqueCharCount = 0;

		Set<Character> uniqueCharSet = new HashSet<>();

		char[] sentenceChars = sentence.toCharArray();

		if (cachedCharMap.containsKey(sentence)) {
			System.out.println("Cached.");
			uniqueCharCount = cachedCharMap.get(sentence);
		} else {
			System.out.println("Not cached.");

			for (char ch : sentenceChars) {
				if (Character.isLetter(ch)) {
					uniqueCharSet.add(ch);
				}
			}

			uniqueCharCount = uniqueCharSet.size();
			cachedCharMap.put(sentence, uniqueCharCount);
		}

		return uniqueCharCount;
	}
	
	public static void main(String[] args) {
		CharCounter charCounter = new CharCounter();
		
		String[] sentences = { "Hello World", "heLLo world", "helloworld", "hello   world", "Blah blah" };
		
		for (String sentence : sentences) {
			System.out.println(charCounter.getUniqueChars(sentence));
		}
	}
}
