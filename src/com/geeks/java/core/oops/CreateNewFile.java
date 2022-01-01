package com.geeks.java.core.oops;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class CreateNewFile {
	
	public static void main(String[] args) {
		
		Path filePath = Paths.get("D:/Test/test.txt");
		
		try {
			if(filePath.getParent() != null) {
				Files.createDirectories(filePath.getParent());
			}
			Files.createFile(filePath);
			System.out.println("File Created Succesfully");
			
		}
		catch(FileAlreadyExistsException e) {
			System.out.println("File already exists");
		}
		catch (IOException e) {
            System.out.println("An I/O error occurred: " + e.getMessage());
        } catch (SecurityException e) {
            System.out.println("No permission to create file: " + e.getMessage());
        }

	}

}
