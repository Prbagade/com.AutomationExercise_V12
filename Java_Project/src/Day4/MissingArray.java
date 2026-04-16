package Day4;

public class MissingArray {

	//Array should not have duplicatesi
	//Array no need to be sorted order 
	//Value should be in range
	
	public static void main(String[] args) 
	{
		//1+2+4+5=12 sum1
		//1+2+3+4+5=15 sum2
		//sum2-sum1 = 3 is missing number
		
		int a[]= {1,2,3,5};
		
		int sum1=0;
		
		for(int i=0;i<a.length;i++) 
		{
			sum1=sum1+a[i];
		}
		
		System.out.println("sum1 of ele in array = "+sum1);
		
		int sum2=0;
		
		for(int i=0;i<=5;i++) 
		{
			sum2=sum2+i;
		}
		
		System.out.println("sum2 of ele in array = "+sum2);
		
		System.out.println(sum2-sum1);
		
	}

}
