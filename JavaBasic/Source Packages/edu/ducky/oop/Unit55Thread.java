package edu.ducky.oop;

public class Unit55Thread {
	public static void main(String args[]){
		Thread55 thread55 = new Thread55();
		Thread thread1 = new Thread(thread55);
		Thread thread2 = new Thread(thread55);
		thread1.setName("VAN NHA" );
		thread2.setName("Nguyen hoang");
		thread1.start();
		thread2.start();
	}
}
class Thread55 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			for(int i = 0;i < 10; i++){
				Thread.sleep(500);
				System.out.println(Thread.currentThread().getName()+ " " + i);
			}
		} catch(Exception e){
			
		}
	}
	
}