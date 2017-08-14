package edu.ducky.oop;

public class Unit37Enum {
	enum COLOR{RED,GREEN,WHILE,YELLOW}
	public static void main(String args[]){
		System.out.println(COLOR.RED);
		COLOR c = COLOR.GREEN;
		System.out.println(c);
		switch(c)
		{
		case RED: System.out.println(c); break;
		case GREEN:System.out.println(c); break;
		case WHILE: System.out.println(c); break;
		case YELLOW: System.out.println(c); break;
		}
	}
}
