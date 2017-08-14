package edu.ducky.oop;

public class Unit26ThuaKe {
	public static void main(String args[]){
		Book book = new Book();
		book.move();
	}
}
interface Document{
	public static final int PAGE = 10;
	public abstract void showPage();
}
interface ReferentDoc extends Document{
	
}
class Book implements Document{

	@Override
	public void showPage() {
		// TODO Auto-generated method stub
		
	}
	public void move(){
		
	}
	
}
class Paper implements Document{

	@Override
	public void showPage() {
		// TODO Auto-generated method stub
		
	}
	
}
//Nguyen tac class thi don thua ke, interface thi da thua ke
class ReferentBook extends Book implements Document , ReferentDoc{
	
}