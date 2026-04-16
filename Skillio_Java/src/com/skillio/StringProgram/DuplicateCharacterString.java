package com.skillio.StringProgram;

public class DuplicateCharacterString {

	public static void main(String[] args) {

		String str = "I am Software Tester";
		
		//To replace character
		System.out.println(str.replaceAll("t", "x"));
		
		//count duplicate charater
		
		int count=0;
		
		for(int i=0;i<=str.length()-1;i++) 
		{
			if(str.toLowerCase().charAt(i)=='t') 
			{
				 count++;
			}
		}
		System.out.println("duplicate count: "+count);
		
		
		
	}

}
