package edu.ducky.basic;

public class ArrayDemo {
	public static void main(String args[]){
		int [] arrInt = new int[100];
		int [] arrInt2 = {0,1,2,3,4,5,6,7,8,9};
		for(int i = 0; i < 100;i++){
			arrInt[i] = i;
		}
		for(int i =0 ; i < arrInt2.length; i++){
			System.out.println(arrInt2[i]);
		}
		
		int [][] arrTwo = new int[3][4];
		ArrayDemo [] arrdm = new ArrayDemo[4];
	}
}
