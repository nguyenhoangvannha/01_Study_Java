package edu.ducky.oop;

public class Unit54Thread {
	public static void main(String args[]){
		Thread thread = new Thread(){
			public void run(){
				try {
					System.out.println("pause");
					Thread.sleep(3000);
					System.out.println("Run");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		thread.start();// chi mot lan goi start
		thread.run();
		thread.run();
		MyThread mythread = new MyThread();
		mythread.run();
	}
}
class MyThread extends Thread{
	public void run(){
		try {
			System.out.println("my thread pause");
			Thread.sleep(3000);
			System.out.println("Run");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
class YourThread implements Runnable{
	public void run(){
		try {
			System.out.println("my thread pause");
			Thread.sleep(3000);
			System.out.println("Run");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}