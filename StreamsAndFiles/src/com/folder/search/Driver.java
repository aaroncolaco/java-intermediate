package com.folder.search;


public class Driver {

	public static void main(String[] args) {
		FileSearch fileSearch = new FileSearch();
		
		boolean fileFound;
		
		fileFound = fileSearch.searchFile(".", "Driver.java");
		System.out.println(fileFound); // false
		
		fileFound = fileSearch.searchFile(".", "testFolderStructure.txt");
		System.out.println(fileFound);	// true
	}

}
