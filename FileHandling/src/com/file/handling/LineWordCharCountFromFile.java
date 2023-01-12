package com.file.handling;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class LineWordCharCountFromFile {

	public static void main(String[] args) throws IOException {

//		File f = new File("abc.txt");
//		System.out.println(f.exists());
		Path p = Paths.get("C:\\Users\\Komal\\eclipse-workspace\\FileHandling\\abc.txt");
		
		try {
			List<String> lines = Files.readAllLines(p);
			System.out.println(lines);
			System.out.println("Total no of lines : "+lines.size());
			List<String> words = new ArrayList();
			
			for(String line : lines) {		
				line = line.trim();
				words.addAll(Arrays.asList(line.split(" ")));
			}
			System.out.println("total no of words : "+words.size());
			int charcount = 0;
			for(String word : words) {
				charcount += word.length();
			}
			System.out.println("Total no of characters : "+charcount);
			
//			ArrayList<String> al = new ArrayList();
//			HashMap<String,Integer> h = new HashMap(al);
			
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
	
	}
}


