package Logical_program;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int first =0;
		int second =1;
		int serisesum =10;
		
		for(int i=0;i<=serisesum;i++) 
		{
			System.out.println(first+" ");
			int nxt=first+second; //0 +1 =1  1+1=2 2+2=4
			first=second; 
			second=nxt;
		}
	}
}
