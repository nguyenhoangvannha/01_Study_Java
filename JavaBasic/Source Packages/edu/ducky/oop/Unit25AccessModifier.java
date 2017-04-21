package edu.ducky.oop;

public class Unit25AccessModifier {
	public static void main(String args[]){
		Boss nha = new Boss();
//		nha.age = 20; nha.name = "Nguyen Hoang Van Nha"; nha.address ="Mars";
//		System.out.println(nha.age);
//		System.out.println(nha.name);
//		System.out.println(nha.address);
		//System.out.println(nha.numberofwinfe); loi
		
		nha.showName();
		nha.showAddress();
		nha.showWife();	
//		nha.showAge(); loi do access modifier
	}
}
class Boss{
	public int age = 20;
	protected String name =  "Nguyen Hoang Van Nha"; //same packages and its subclass (cac class con)
	String address; //Chi trong package
	private int numberofwife; //chi trong class
	
	//Phuong thuc
	private void showAge(){
		System.out.println(age);
	}
	void showName(){
		System.out.println(name);
	}
	protected void showAddress(){
		System.out.println(address);
	}
	public void showWife(){
		System.out.println(numberofwife);
	}
}
