package edu.ducky.oop;

public class Unit28Final extends Unit{
	final float PI = 3.14F;
	int number;
	public static void main(String args[]){
		Unit28Final unit28 = new Unit28Final();
		unit28.number = 100;
		//unit28.PI = 3.177; loi do final
	}
	public void change(){
		number = 100;
		//PI = 4.14;loi
	}
	
//	void show(){ // khong the overides	
//		
//	}
}
class Unit{
	final void show(){
		
	}
}