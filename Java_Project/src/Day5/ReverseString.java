package Day5;

public class ReverseString {

	public static void main(String[] args) {
		
		
		String str= "welcome";
		//String rev="";
		
		//Approach 1
		for(int i=str.length()-1;i>=0;i--) 
		{
			//System.out.print (i);
			//System.out.print(str.charAt(i));
		}
		
		//Approach 2 - converting to char array
		
//		String str2="Selenium";
//		String rev="";
//		char a[]=str2.toCharArray();
//		
//		for(int i=a.length-1;i>=0;i--) 
//		{
//			rev=rev+a[i];
//			
//			//System.out.print(a[i]);
//		}
//		System.out.println(rev);
//		
		
		//Aproach 3 - using StringBuffe & StringBuilder
		StringBuffer s = new StringBuffer("Welcome");
		
		System.out.println(s.reverse());
		
		StringBuilder ss = new StringBuilder("Selenium");
		System.out.println(ss.reverse());
		
	}
}
