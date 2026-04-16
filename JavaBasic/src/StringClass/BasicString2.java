package StringClass;

public class BasicString2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Using new keyword
		// Memory stored in Heap area
		String str1 = new String("I love Pune City");

		// using Literals
		// Memory stored in String constant pool area
		String str2 = " I love Pune City";

		String str3 = " I love Mumbai City";

		String str4 = "   Delhi";

		//conatins --> string contains
		System.out.println(str1.contains("Pune"));

		System.out.println("*********************************");
		
		//Startwith
		System.out.println(str1.startsWith("I"));
		
		System.out.println("*********************************");

		//Endwith
		System.out.println(str1.endsWith("City"));
		
		System.out.println("*********************************");
		
		//isEmpty and icBlank();
		
		String st1 =""; //empty & blank
		String st2 ="   "; //blank
		
		System.out.println(st1.isEmpty()); //true
		System.out.println(st2.isEmpty()); //false
		System.out.println(st1.isBlank()); //true
		System.out.println(st2.isBlank()); //true
		
		
		System.out.println("*********************************");
		
//		indexOf --> position number --> return
		System.out.println(str1.indexOf("P")); // p stand on 7th index 
		
//		lastindexOf --> last position number --> return
		System.out.println(str1.lastIndexOf("City")); // p stand on 7th index 
		
		System.out.println("*********************************");
		
		//tocharArray
		char [] c =str1.toCharArray();
		
		for(char v:c) 
		{
			System.out.print(" "+v);
		}
		
		//		System.out.println(str1.toCharArray());

		System.out.println(str1.charAt(7));//p
				
		System.out.println("*********************************");
		
		//spilt
		String [] s=str1.split("e");
		
		for(String f:s ) 
		{
			System.out.print(" "+f);
		}
		
		System.out.println("*********************************");
		
		//SubString();
		 int i =str1.indexOf("Pune");
		 
		 System.out.println(str1.substring(i));
		
	}

}
