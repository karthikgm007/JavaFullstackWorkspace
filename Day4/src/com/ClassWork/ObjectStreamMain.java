package com.ClassWork;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class ObjectStreamMain {

	public static void main(String[] args) throws IOException {

		Customer c = new Customer("sdsad", 33);
		
		FileOutputStream fos = new FileOutputStream("obj.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject("c");
		oos.close();
		fos.close();
		
		
		FileInputStream fis = new FileInputStream("obj.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Customer c1 = new Customer("sdssadsadad", 313);
		System.out.println(c1);

		File f1 = new File("MyFile");
		f1.createNewFile();
		
		//CHATGPT
		// Define paths for demonstration
        Path sourcePath = Paths.get("source.txt");
        Path destPath = Paths.get("destination.txt");
        Path directoryPath = Paths.get("new_directory");

        // Create a new file
        Files.createFile(sourcePath);
        System.out.println("File created: " + sourcePath);

        // Create a directory
        Files.createDirectory(directoryPath);
        System.out.println("Directory created: " + directoryPath);

        // Delete a file
        Files.delete(sourcePath);
        System.out.println("File deleted: " + sourcePath);

        // Delete a directory (must be empty)
        Files.delete(directoryPath);
        System.out.println("Directory deleted: " + directoryPath);

        // Recreate the directory for further operations
        Files.createDirectory(directoryPath);

        // Create another file to demonstrate copy and move operations
        Path sourceFile = Paths.get("source.txt");
        Files.createFile(sourceFile);
        System.out.println("File created: " + sourceFile);

        // Copy a file to another location
        Path copiedFile = Files.copy(sourceFile, destPath, StandardCopyOption.REPLACE_EXISTING);
        System.out.println("File copied to: " + copiedFile);

        // Move a file to another location
        Path movedFile = Files.move(sourceFile, directoryPath.resolve(sourceFile.getFileName()), StandardCopyOption.REPLACE_EXISTING);
        System.out.println("File moved to: " + movedFile);
		
		
	}

}
