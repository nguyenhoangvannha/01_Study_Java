package edu.ducky.oop;

public class Unit23InerClass {
	public static void main(String args[]){
		Outer out = new Outer();
		out.show();
	}
}
class Outer{
	public void show(){
		Iner in = new Iner();
		in.display();
	}
	class Iner{
		public void display(){
			System.out.println("Toi la Iner.");
		}
	}
}
class C {
	public void show(){
		Outer.Iner in = new Outer().new Iner();
		in.display();
	}
}