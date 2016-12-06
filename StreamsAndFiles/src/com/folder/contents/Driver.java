package com.folder.contents;

public class Driver {
	public static void main(String[] args) {
		Folder folder = new Folder();

		folder.displayFolderContents("./testFolder");

		System.out.println("Root Map: " + folder.getRootMap());
	}
}
