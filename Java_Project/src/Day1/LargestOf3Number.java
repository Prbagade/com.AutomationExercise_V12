package Day1;

public class LargestOf3Number {

	//a>b && a>c
	//b>a && b>c
	//c>a && c>b
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10, b=50, c=30;
		
		if(a>b && a>c) 
		{
			System.out.println("a is largest number..."+a);
		}
		else if(b>a && b>c) 
		{
			System.out.println("b is largest number..."+b);
		}
		else 
		{
			System.out.println("c is largest number..."+c);
		}
	}
}
