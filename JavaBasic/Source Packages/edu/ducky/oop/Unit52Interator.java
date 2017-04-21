package edu.ducky.oop;

import java.util.ArrayList;
import java.util.Iterator;

public class Unit52Interator {
	public static void main(String args[]){
		ArrayList al = new ArrayList();
		al.add("Nha nguyen");
		al.add(" la ");
		al.add(2017); 
		Iterator iterator = al.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
	}
}
