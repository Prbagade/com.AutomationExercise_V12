package com.skillio.constructor;

public class Constructor2 {

	public static void main(String[] args) {
		
//		//default constructor called 
//		Constructor1 cs = new Constructor1(); //this is constructor initilize
//		
//		//default value assigned by constructor
//		System.out.println(cs.rollNo);
//		System.out.println(cs.name);
//		System.out.println(cs.mark);
//		
		//User defined constructor with argument
		Constructor1 cs = new Constructor1(11,"Ganesh",30.5f);
		
		System.out.println(cs.rollNo);
		System.out.println(cs.name);
		System.out.println(cs.mark);
		
	}
	
	
	
	
	
	
	
	
	
	
}
