package edu.ducky.oop;

public class Unit32ThrowThrows {
	public static void main(){
		Building b = new Building();
		try {
			b.go();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
class MyException extends Exception{
	//Do something
	
}
class Building{
	public void show() throws MyException{
		int numberconect = 0;
		if(numberconect > 100){
			throw new MyException();
		}
	}
	public void go() throws InterruptedException{
		Thread.sleep(1000);
	}
}