package Star_Programm;

public class ReverseNumber {

	public static void main(String[] args) 
	{
		//Reverse the number 
		
		int num = 45678;
		
		int rev=0; //
		
		while(num!=0) // 
			
		{
			rev=rev*10+num%10; // bodmas 
			num=num/10;
		}
		System.out.println("Revser number: "+rev);
		

	}

}
