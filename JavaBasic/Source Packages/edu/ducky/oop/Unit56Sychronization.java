package edu.ducky.oop;

public class Unit56Sychronization {
	public static void main(String args[]){
		Thread56 thread56 = new Thread56();
		Thread thread1 = new Thread(thread56);
		Thread thread2 = new Thread(thread56);
		thread1.setName("VAN NHA" );
		thread2.setName("Nguyen hoang");
		thread1.start();
		thread2.start();
	}
}
class Thread56 implements Runnable{

	int money = 10000;
	@Override
	public synchronized void run() {
		// TODO Auto-generated method stub
		try {
			for(int i = 0;i < 10; i++){
				Thread.sleep(500);
				System.out.println(Thread.currentThread().getName()+ " " + i + " " + money--);
			}
		} catch(Exception e){
			
		}
	}
	
}