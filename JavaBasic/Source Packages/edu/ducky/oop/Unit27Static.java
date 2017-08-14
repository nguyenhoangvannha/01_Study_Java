package edu.ducky.oop;

public class Unit27Static {

	public static void main(String args[]){
		Room r = new Room();
		r.number = 10;
		System.out.println(r.number);
		System.out.println("R area after:" + r.area);
		r.area = 300;
		System.out.println("R area before:" + r.area);
		
		Room r2 = new Room();
		
		r2.number = 20;
		System.out.println(r2.number);
		Room.area = 400;
		System.out.println("R2 area = " + r2.area);
		
		Room r3 = new Room();
		 
		r3.number = 50;
		System.out.println(r3.number);
		System.out.println("R3 area = " + r3.area);
	}
}
class Room{
	static int area = 200;
	int number = 5;
	public static void show(){
		System.out.println("Show");
		//number = 9; loi
	}
}
