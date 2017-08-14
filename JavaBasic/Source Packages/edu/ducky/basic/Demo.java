package edu.ducky.basic;
//Access modifiers:
//public ở đâu cũng xài được
//private chỉ ở trong class
//protected trong class và lớp con ngoài package cũng được
//default chỉ ở trong package

//Non-Access modifiers:
//final
//static
//abstract 

public class Demo {
	public Demo(){
		
	}
	public int ngaysinh = 12;
	final public float SO_PI = 3.14f;
	public void setName(String name){
		
	}
	public static void main(String args[]){
		System.out.println("Max int : " + Integer.MAX_VALUE);
		
	}
}
