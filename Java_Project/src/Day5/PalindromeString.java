package Day5;

public class PalindromeString {

	public static void main(String[] args) {
		
		
		//String str ="madam";
		String str ="Radar";
		String rev ="";
		
		for(int i=str.length()-1;i>=0;i--) 
		{
			rev=rev+str.charAt(i);

		}
		System.out.println(rev);
		
		//comparing String with orginal name
		if(str.equalsIgnoreCase(rev)) 
		{
			System.out.println("Palindrome String = "+rev);
		}
		else 
		{
			System.out.println("Not a Palindrome String = "+rev);
		}
		
	}

}
