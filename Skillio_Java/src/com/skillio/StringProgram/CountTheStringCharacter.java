package com.skillio.StringProgram;

public class CountTheStringCharacter {

	public static void main(String[] args) {
		
		//count character in string
		
		String str = "Rajeramji bagade"; 
		
		char [] str2 =str.toCharArray();
		int count=0;
		
		for(int i=0;i<str2.length-1;i++) 
		{
			if(str2[i]!=' ') //whitespace not count
			{
				
				count++;
			}
		}
		System.out.println(count);
		
	}

}
