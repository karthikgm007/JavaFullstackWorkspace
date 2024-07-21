package com.ClassWork;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DemoOnByteStreams {

	public static void main(String[] args) throws IOException {

		FileOutputStream fos = new FileOutputStream("data.txt");
		String s = "HEllo Wokrs";
		fos.write(s.getBytes());
		fos.close();
		
		FileInputStream fis = new FileInputStream("data.txt");
		
		int ch;
		StringBuffer sbf = new StringBuffer();
		while((ch= fis.read())!=-1){
			sbf.append((char)ch);
		}
		
		String s1 = sbf.toString();
		System.out.println(s1);
		fis.close();
		
	}

}
