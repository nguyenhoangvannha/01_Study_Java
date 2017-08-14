package edu.ducky.oop;

import java.io.File;
import java.io.IOException;

public class Unit45FileDirectory {
	public static void main(String args[]){
		
		//Create file
		File file = new File("test.txt");
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Create directory
		File directory = new File("testdirectory");
		directory.mkdir();
		
	}
}
