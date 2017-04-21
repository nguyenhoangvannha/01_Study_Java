package edu.ducky.oop;

public class Unit43String2 {
	public static void main(String args[]){
		String myname = "Nguyen Hoang Van Nha";
		System.out.println(myname);
		System.out.println(myname.length());
		System.out.println(myname.replace("Van", "Super"));
		System.out.println(myname.replaceFirst("Van", "Super man"));
		System.out.println(myname.replaceAll("Van", "Super"));
		
		String yourname = "What the ffff";
		if(yourname.equals("Whatffff")){
			System.out.println("Giong nhau");
		}
	}
}
