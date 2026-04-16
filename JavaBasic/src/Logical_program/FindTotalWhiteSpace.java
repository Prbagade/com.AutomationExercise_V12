package Logical_program;

public class FindTotalWhiteSpace {

	public static void main(String[] args) {

		// findout the total numb of whitespace in string

		String str = "I am Software Test Engineer";

		// method 1
		String ss = str.replaceAll("[a-zA-Z0-9$%]", "");
		System.out.println("Total Num of WhiteSpace = " + ss.length());

		
		// method 2
		int count = 0;
		char [] ch =str.toCharArray();
		
		//foreach
		for(char  s1:ch) 
		{
			if(s1==' ') //true
			{
				count++; //add whitespace
			}
		}
		
		System.out.println("Total num of whiteSpace = "+count);
	}
}
