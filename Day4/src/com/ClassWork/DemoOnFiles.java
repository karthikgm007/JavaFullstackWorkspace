package com.ClassWork;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DemoOnFiles {

	public static void main(String[] args) throws IOException {
		File file = new File("Demo.txt");
		System.out.println(file.getName());
		System.out.println(file.getPath());
		System.out.println(file.getParent());
		System.out.println(file.getAbsolutePath());
		
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		System.out.println(file.canExecute());
		
		FileWriter fw = new FileWriter(file);
		fw.write('f');
		
		String s = "Helloo from demo";
		
		//WRITING to the file
		for(char c:s.toCharArray())
		fw.write(c);
		fw.close();
		
		//READING from file
		FileReader fr = new FileReader("Demo.txt");
		int ch;
		StringBuffer sbf = new StringBuffer();
		while((ch= fr.read())!=-1){
			sbf.append((char)ch);
		}
		String s1 = sbf.toString();
		System.out.println(s1);
		fr.close();
			
		
		
		
	}
}
