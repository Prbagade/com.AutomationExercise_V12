package com.skillio.StringProgram;

public class TotalWhiteSpaces {

	public static void main(String[] args) {
		

		//Find the Total whiteSpace in String
		String str = "Welcome to Dream city of Mumbai";
	
		int count=0;
		
		char [] ch=str.toCharArray();
		
		for(int i=0;i<=ch.length-1;i++) 
		{
			if(ch[i]==' ') 
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
