package com.skillio.StringProgram;

public class RemoveTheWhiteSpaces {

	public static void main(String[] args) {

		//Remove the WhiteSpaces in String
		
		String str = "  Hi   am  prafull   ";
		
//		System.out.println(str.trim());
		
		System.out.println( str.replaceAll("\\s", ""));
//		System.out.println( str.replaceAll(" ", ""));
	
	}

}
