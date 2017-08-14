package edu.ducky.oop;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Unit47ReadFile {
	public static void main(String args[]){
		File file = new File("blog.txt");
		
		try {
			FileReader fr = new FileReader(file);
			
			BufferedReader br = new BufferedReader(fr);
			
			String line = "";
			try {
				while((line = br.readLine()) != null){
					//Do something
					System.out.println(line);
				}
				
				 br.close();
				 fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
