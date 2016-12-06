package com.folder.contents;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Folder {
	
	File dir;
	Map<String, List<String>> rootMap;
	
	public Folder() {
		rootMap = new HashMap<>();
	}

	public void displayFolderContents(String path) {
		File[] dirContentsArray = null;
		List<String> fileList = new ArrayList<>();
		
		dir = new File(path.trim());
		
		dirContentsArray = dir.listFiles();
		
		for (File f : dirContentsArray) {
			if (f.isDirectory()) {
				this.displayFolderContents(f.getName());
			}
			fileList.add(f.getName());
		}
		rootMap.put(dir.getName(), fileList);
	}
	
	public static void main(String[] args) {
		Folder folder = new Folder();
		
		folder.displayFolderContents("C:\\Users\\aaron_colaco\\java_501");
		
		System.out.println(folder.rootMap);
	}
}
