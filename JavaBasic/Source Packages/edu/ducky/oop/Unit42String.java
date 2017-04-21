package edu.ducky.oop;

public class Unit42String {
	public static void main(String args[]){
		String name = "Nguyen Hoang Van Nha";
		System.out.println(name);
		System.out.println(name.charAt(2));
		System.out.println(name.indexOf("Hoang"));
		System.out.println(name.substring(7, name.length()));
		System.out.println(name.substring(4));
		System.out.println(name);
		String task = " Hoc Gi Hom Nay Bay GIo ";
		System.out.println(task);
		System.out.println(task.trim());
		System.out.println(task.toLowerCase());
		System.out.println(task.toUpperCase());
		
		String [] arrS = name.split(" ");
		System.out.println(arrS[0]);
		System.out.println(arrS[1]);
	}
}
