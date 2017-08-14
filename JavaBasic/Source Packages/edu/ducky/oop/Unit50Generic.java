package edu.ducky.oop;

import java.util.ArrayList;
import java.util.HashMap;

public class Unit50Generic {
	public static void main(String args[]){
		ArrayList<AA> al = new ArrayList<AA>();
		al.add(new AA());
		al.add(new AA());
		for(int i = 0; i < al.size(); i++){
			al.get(i).show();
		}
		HashMap<String, BB > map = new HashMap<String,BB>();
		map.put(new String("Hello"), new BB());
		map.put("Hi", new BB());
	}
}
class AA {
	public void show(){
		
	}
}
class BB{
	public void go(){
		
	}
}