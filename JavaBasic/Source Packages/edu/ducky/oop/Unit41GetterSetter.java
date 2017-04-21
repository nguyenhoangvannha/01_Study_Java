package edu.ducky.oop;

public class Unit41GetterSetter {
	public static void main(String args[]){
		BookCase b = new BookCase();
		b.setSize(42);
		b.setColor("Do");
		System.out.println("Size: " + b.getSize());
		System.out.println("Color: " + b.getColor());

	}
}

class BookCase{
	private String color;
	private int size;
	public int getSize(){
		return size;
	}
	public String getColor(){
		return color;
	}
	public void setSize(int size){
		this.size = size;
	}
	public void setColor(String color){
		this.color = color;
	}
	private boolean good; //alt s -> r
	public boolean isGood() {
		return good;
	}
	public void setGood(boolean good) {
		this.good = good;
	}
}