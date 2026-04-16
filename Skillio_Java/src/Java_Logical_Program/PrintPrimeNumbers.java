package Java_Logical_Program;

public class PrintPrimeNumbers {

	public static void main(String[] args) {
		
		
		// Print prime number 1 to 100 	
		int num =30;
		
		for(int i=1;i<=num;i++) 
		{
			int count=0;
			for(int j=1;j<=i;j++) 
			{
				if(i%j==0) 
				{
					count++;
				}
			}
			if(count==2) 
			{
				System.out.println(i);
			}
		}
	}
}
