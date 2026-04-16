package LoopsConcept;

public class PalindromeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=121;
		int rev=0;
		int org_num=num;
		
		while(num!=0) 
		{
			rev=rev*10+num%10; 
			num=num/10; 
			
		}
	//	System.out.println(rev);
		
		if(org_num==rev) 
		{
			System.out.println(org_num+" Palindrome Nu");
		}
		else 
		{
			System.out.println(org_num+" Not a Palindrome Nu");
		}
		
		
	}
}
