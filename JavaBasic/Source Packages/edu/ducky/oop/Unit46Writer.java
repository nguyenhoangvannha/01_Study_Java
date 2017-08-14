package edu.ducky.oop;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Unit46Writer {
	public static void main(String args[]){
		try{
			File file = new File("blog.txt");
			file.createNewFile();
			
			FileWriter fw = new FileWriter(file);
			
			BufferedWriter bw = new BufferedWriter(fw);
			
			String data = "Nguyen Hoang Van Nha";
			bw.write(data + "\n");
			bw.write(data + "\n");
			bw.write(data);
			bw.close();
			fw.close();
		} catch(Exception e){
			System.out.println(e.toString());
		}
	}
}
