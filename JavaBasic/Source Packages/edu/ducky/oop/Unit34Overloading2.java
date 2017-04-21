package edu.ducky.oop;

public class Unit34Overloading2 extends Tutorials {
	public static void main(String args[]){
		Unit34Overloading2 unit = new Unit34Overloading2();
		System.out.println(unit.add("Toi la ", " Nha"));
	}
	public int add(int a,int b){
		return a + b;
	}
	public float add(float a,float b){
		return a + b;
	}
}
class Tutorials{
	public String add(String str1, String str2){
		return str1 + str2;
	}
}
