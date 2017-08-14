package edu.ducky.oop;

public class Unit44StringBuilderAndStringBuffer {
	public static void main(String args[]){
		String name = "Nguyen Hoang Van Nha";
		StringBuilder builder = new StringBuilder("String buider"); //An toan
		StringBuffer buffer = new StringBuffer("String buffer"); //Nhanh hon
		System.out.println(builder);
		builder.append(" is me");
		System.out.println(builder);
		builder.delete(0, 7);
		System.out.println(builder);
		builder.insert(5, " 2017");
		System.out.println(builder); 
	}
}
