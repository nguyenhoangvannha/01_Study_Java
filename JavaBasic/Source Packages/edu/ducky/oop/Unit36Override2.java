package edu.ducky.oop;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Unit36Override2 extends Tutorial36 {
	public int increase(int a){
		return a + 4;
	}
	public Unit35Override create() throws FileNotFoundException{
		return new Unit35Override();
	}
	
	public static void main(String args[]){
		
	}
}
class Tutorial36{
	public int increase(int a){
		return ++a;
	}
	public Turorial35 create() throws IOException{
		return new Turorial35();
	} 
}
