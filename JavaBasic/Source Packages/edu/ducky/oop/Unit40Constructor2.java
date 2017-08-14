package edu.ducky.oop;

public class Unit40Constructor2 {
	public static void main(String args[]){
		Sup40 sup = new Sup40();
	}
}
class Super40{
	public Super40(){
		System.out.println("Super");
	}
	public Super40(int a){
		
	}
}
class Sup40 extends Super40{
	public Sup40(){
		System.out.println("Sup");
	}
}