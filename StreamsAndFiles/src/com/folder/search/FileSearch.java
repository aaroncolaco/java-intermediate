package com.folder.search;

import java.io.File;

public class FileSearch {
	private File directory;

	public boolean searchFile(String path, String fileName) {
		boolean foundFlag = false;
		File[] filesArray = null;
		directory = new File(path);
		filesArray = directory.listFiles();
		
		for (File file : filesArray) {
			if (file.getName().equalsIgnoreCase(fileName)) {
				foundFlag = true;
				break;
			}
		}
		
		
		return foundFlag;
	}
}
