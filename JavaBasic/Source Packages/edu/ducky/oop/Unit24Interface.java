package edu.ducky.oop;

public class Unit24Interface {
	public static void main(String args[]){
		Manager man = new Manager();
		man.show();
	}
}
interface Human{
	public final static int AVR_AGE = 100;
	int AVR_WRIGHT = 60 ;//Mac dinh luon luon la public static final
	public abstract void show();//Phuong thuc khong co than ham
	void study();//Luon luon public abstract 
}
class Manager implements Human{//thua ke Human

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("AVR AGE =" + AVR_AGE);
	}

	@Override
	public void study() {
		// TODO Auto-generated method stub
		
	}
	
}