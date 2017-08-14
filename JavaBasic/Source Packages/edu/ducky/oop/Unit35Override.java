package edu.ducky.oop;

public class Unit35Override extends Turorial35 {
	public static void main(String args[]){
		Unit35Override u = new Unit35Override();
		u.show();
	}
	public void show(){
		System.out.println("Show unit 35");
	}
}
class Turorial35{
	protected void show(){
		System.out.println("show tutorial");
	}
} 
