package edu.ducky.oop;

import java.util.ArrayList;
import java.util.Vector;

public class Unit48ArrayListVector {
	public static void main(String args[]){
		ArrayList al = new ArrayList();
		al.add("Bat dau array list");
		al.add(new String("Gia tri thu hai"));
		al.add(2017);
		al.add(new Long(10));
		System.out.println(al.get(1));
		al.remove(1);
		
		Object [] array = al.toArray();
		System.out.println("Leng of array: " + al.size());
		
		for(int i =0 ;i < al.size() ; i++){
			//System.out.println(al.get(i));
		}
		
		Vector vector = new Vector();
		
	}
}