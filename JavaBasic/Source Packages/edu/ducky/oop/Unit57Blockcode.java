package edu.ducky.oop;

public class Unit57Blockcode {
	{
		System.out.println("Block code 1");
	}
	static {
		System.out.println("Static Block code 1");
	}
	public Unit57Blockcode(){
		System.out.println("Constructure");
	}
	{
		System.out.println("Block code 2");
	}
	static{
		System.out.println("Static Block code 2");
	}
	public static void main(String args[]){
		Unit57Blockcode unit57 = new Unit57Blockcode();
	}
}
