package edu.ducky.basic;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class TimeDemo {
	public static void main(String Args[]){
		//Get time by millis
		long start = System.currentTimeMillis();
		int sum = 0;
		try{
			for(int i = 0; i <1000 ; i++){
				sum+=i;
				Thread.sleep(2);//milisecons
			}
		} catch (Exception e){
			
		}
		long end = System.currentTimeMillis();
		System.out.println(end - start);
		
		//Get time by nano
		start = System.nanoTime();
		end = System.nanoTime();
		System.out.println("Nano: " + (end - start));
		
		//Display the system time
		
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = new Date();
		String day = dateFormat.format(date);
		System.out.println(day);
	}
}
