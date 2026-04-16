package Day5;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ChartAt() --> returns a character from a string based on index 
		//index start from 0
		
		String str1="welcome";
		String str2="welcome";
		
		
		/*System.out.println(" char at index = "+str.charAt(3));
		System.out.println(" char at index = "+str.charAt(5));		
		
		//conatins() - returns true/false (case sensetive)
		System.out.println(str.contains("wel"));//true
		System.out.println(str.contains("come"));//true
		System.out.println(str.contains("amar"));//true
		*/
		
		//equals() , eqaulsIgnoreCase() -- comapring strings
		
		System.out.println(str1.equals(str2)); // true
		System.out.println(str1.equals(str2)); // false
		System.out.println(str1.equalsIgnoreCase(str2)); //true
		System.out.println(str1.equalsIgnoreCase("WELcome")); //
		
		//replace() -- replace single/multiple(sequence) of character in a string
		String str="welcome to selenium java automation"; 
		System.out.println(str.replace('e', 'x')); // replace e with x
	
		System.out.println(str.replace("selenium", "Github"));
		str1="Selenium"; 
		
		System.out.println(str1.substring(0,5)); //Selen
		System.out.println(str1.substring(2,8)); //lenium
		
		String str3="praful@gmail.in";
		
		String a[]=str3.split("@");
	
		System.out.println(a[0]); //praful
	System.out.println(a[1]); //gmail.in
	
	System.out.println(Arrays.toString(a)); //[praful, gmail.in]
		
	
	String str4 ="$15,25,30";
	System.out.println(str4.replace("$", ""));   //[praful, gmail.in]
	
	System.out.println(str4.replace("$", "").replace(",",""));  //152530
	
	String str5="abc,123@xyz";
	
	String ar1[] =str5.split(",");

	System.out.println(Arrays.toString(ar1));
	
	String ar2[]=ar1[1].split("@");
	
	System.out.println(Arrays.toString(ar2));
	
	System.out.println(ar1[0]);
	System.out.println(ar2[0]);
	System.out.println(ar2[1]);
	
	//* & % ^ ( ) - we cant use as delimeters
	
	
	String str6="John Rock";
	
	System.out.println(str6.contains("john")); //false (check sring part or not)
	
	System.out.println(str6.replace("J", "j").contains("john")); //true
	
	System.out.println(str6.toLowerCase().contains("john")); //true
	
	}
}
