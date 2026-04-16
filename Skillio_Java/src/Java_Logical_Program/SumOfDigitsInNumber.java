package Java_Logical_Program;

public class SumOfDigitsInNumber {

	
	
	
	public static void main(String[] args) {
		
//		Sum of Digits in numbers
		
		int num =12345;
		int count=0;
		
		while(num>0) //0 loop break
		{
			count=count+num%10; //0+5 =5, 5+4=9.....14+1=15 
			num=num/10; //12345 1234......0 
		}
		System.out.println(count); 
		
		
		
	}
}
