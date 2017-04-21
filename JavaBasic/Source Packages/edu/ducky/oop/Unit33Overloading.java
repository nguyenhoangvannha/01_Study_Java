package edu.ducky.oop;

import java.util.Scanner;

public class Unit33Overloading {
	public static void main(String args[]){
		Unit33Overloading u = new Unit33Overloading();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap a: ");
		int a = sc.nextInt();
		System.out.println(a);
	}
	public int add(int a,int b){
		return a + b;
	}
	public float add(float a,float b){
		return a + b;
	}
}
