package edu.ducky.oop;

public class Unit21ClassAbstracClassInterface {

}

class Student{
	private String name; //mac dinh la null
	public void study(){
		
	}
}


interface Person{
	//Các thuộc tính của interface là hằng số tĩnh
	public final static String COUNTRY_NAME ="Viet Nam";
	
	//Thân hàm 
	public void show(); //Không có thân hàm thể hiện abstract cái nào kế thừa thì phải emplyment ra
}
abstract class Employee{
	private String name;
	public abstract void move();
}