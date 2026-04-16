package LoopsConcept;

public class loop4 {

	public static void main(String[] args) 
	{
		int num= 4567382;
		int count=0;
		int y=0;
		int sum=0;
		
		while(num!=0) 
		{
			y=num%10;
			num=num/10;
			sum=sum+y;
			count++;
		}
		System.out.println("no. of count= "+count+" Total ="+sum);
		
	}
}
