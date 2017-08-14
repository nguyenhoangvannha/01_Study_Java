package edu.ducky.oop;
enum COLOR{
	RED(5), BLUE(6), YELLOW(7), GREEN(8);
	private int value;
	COLOR(int value){
		this.value = value;
	}
	public int getValue(){
		return value;
	}
}
public class Unit38Enum2 {
	public static void main(String args[]){
		COLOR c = COLOR.BLUE;
		System.out.println(c + ": " + c.getValue());
	}
}
