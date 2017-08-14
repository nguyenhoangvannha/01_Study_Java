package edu.ducky.oop;

import java.util.HashMap;

public class Unit49Map {
	public static void main(String argv[]){
		HashMap map = new HashMap();
		map.put("instucturekey", "Value 1");
		map.put("namekey", "Name 1");
		map.put("namekey", "name 2");
		map.put(new Integer(5), "Viet Nam");
		map.remove(5);
		System.out.println(map.get("instructurekey"));
		System.out.println(map.size());	
		map.clear();
	}
}
