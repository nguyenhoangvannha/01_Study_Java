package edu.ducky.oop;

import java.io.File;
import java.io.IOException;

public class Unit31TryCatComplier {
	public static void main(String args[]){
		try {
			Thread.sleep(1000);
			File file = new File("test.txt");
			file.createNewFile();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e){
			
		} catch (Exception e){
			//write log
			//show log
			//print cmline
		}
	}
}
