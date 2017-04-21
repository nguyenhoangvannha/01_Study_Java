package edu.ducky.oop;

public class Unit39Constructor {
	public static void main(String args[]){
		Box b = new Box();
		System.out.println(b.getSize());
		System.out.println(b.getColor());
		
		Box b2 = new Box(15,"YELLOW");
		System.out.println(b2.getSize());
		System.out.println(b2.getColor());
		
	}
}
class Box{
	public Box(){
		size = 10;
		color = "RED";
	}
	public Box(int size,String color){
		this.color = color;
		this.size = size;
	}
	private int size;
	private String color;
	public int getSize(){
		return size;
	}
	public String getColor(){
		return color;
	}
}