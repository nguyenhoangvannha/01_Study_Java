package edu.ducky.oop;

public class Unit30TryCatch {
	public static void main(String args[]){
		String test = "Nguyen hoang van Nha";
		try {
		System.out.println("Before");
		//System.out.println(test.substring(50)); 50 --> error
		System.out.println(test.substring(6));
		int a = 5;
		int b = 0; // 0 --> error
		System.out.println(a/b);
		System.out.println("After");
		} catch(StringIndexOutOfBoundsException error){
			System.out.println("Error " + error.toString());
		} catch(ArithmeticException error){
			System.out.println("Error " + error.toString()); 
		} catch (Exception error){
			System.out.println(error.toString());
		} finally {
			System.out.println("I always run"); 
		}
	}
}
