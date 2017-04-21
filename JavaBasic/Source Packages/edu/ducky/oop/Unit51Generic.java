package edu.ducky.oop;

import java.util.Vector;

public class Unit51Generic {
	public static void main(String args[]){
		Vector<Cs> vector = new Vector<Cs>();
		vector.add(new Cs());
		vector.add(new D());
		
		Vector<D> vecter1 = new Vector<D>();
		vecter1.add(new D());
		//vecter1.add(new C()); //C--> error
		
	}
}
class Cs{
	
}
class D extends Cs{
	
}