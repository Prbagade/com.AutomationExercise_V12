package Day3;

public class PrimeNumber {

	public static void main(String[] args) {

		int num=5;
		int count=0;
		
		if(num>1) 
		{
			for(int i=1; i<=10;i++) 
			{
				if(num%i ==0) 
				{
					count++;
				}
			}
			if(count==2) 
			{
				System.out.println("Prime a Number = "+num);
			}
			else 
			{
				System.out.println("Not a Prime Number");
			}
		}
		
		
	}

}
