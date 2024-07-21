package Assignment;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ParagraphMain {

	public static void main(String[] args) throws IOException {
		
		File f1 = new File("assignment.txt");
		FileWriter fw = new FileWriter(f1);
		String s = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. \n Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, \n when an unknown printer took a galley of type and scrambled \n  it to make a type specimen book. It has survived not only five centuries, \n but also the leap into electronic typesetting, remaining essentially unchanged. \n It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop \n publishing software like Aldus PageMaker including versions of Lorem Ipsum";
		for(char c:s.toCharArray())
			fw.write(c);
			fw.close();
			
		
		FileReader fr =  new FileReader(f1);
		
		int charCount=0;
		int words=0;
		int lines=0;
		
		int ch;
		StringBuffer sbf = new StringBuffer();
		while((ch= fr.read())!=-1){
			
			if(ch == '\n') lines++;
			if(ch == ' ') words++;
			sbf.append((char)ch);
			charCount++;
		}
		fr.close(); 
		
		System.out.println("chars " + charCount + " words " + words + " lines " + lines);
	}

}
