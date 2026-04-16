package com.skillio.StringProgram;

public class ReverseTheString {

	public static void main(String[] args) {

		// Print reverse String

		String str = "Ganesh";

		String rev = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		
		System.out.println("Reverse String: " + rev);
		

	}

}
