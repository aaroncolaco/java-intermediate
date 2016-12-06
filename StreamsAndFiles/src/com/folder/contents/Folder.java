package com.folder.contents;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Folder {
	
	private File dir;
	private Map<String, List<String>> rootMap;
	
	public Map<String, List<String>> getRootMap() {
		return rootMap;
	}

	public Folder() {
		rootMap = new HashMap<>();
	}
	
	public void displayFolderContents(String path) {
		File[] dirContentsArray = null;
		List<String> fileList = new ArrayList<>();

		dir = new File(path.trim());
		
		dirContentsArray = dir.listFiles();
		
		// ****** IMP *******
		// this has to be here
		// if put at the end of the function it does not append the root directory
		rootMap.put(dir.getPath(), fileList);
		
		for (File f : dirContentsArray) {
			if (f.isDirectory()) {
//				System.out.println("Folder: " + f.getPath());
				rootMap.put(f.getPath(), fileList);
				this.displayFolderContents(f.getPath());
			} else {
//				System.out.println("	File: " + f.getPath());
				fileList.add(f.getPath());
			}
		}
	}
}
