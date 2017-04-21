package edu.ducky.basic;

public class Student {
	private String name = "Nguyen Hoang Van Nha";
	private int age = 20;

	public void showStudent(){
		System.out.println("I am a student." + name);
		System.out.println("My age: " + age);
	}
	public int addNumber(int a, int b){
		int sum = a + b;
		return sum;
	}
	public static void main(String args[]){
		Student sv1 = new Student();
		sv1.showStudent();
		System.out.println(sv1.addNumber(2000, 17));
	}
}
