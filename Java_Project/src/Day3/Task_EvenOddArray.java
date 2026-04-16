package Day3;

public class Task_EvenOddArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,2,3,4,5,6};
		
		
		/*for(int i=0;i<a.length;i++) 
		{
			if(a[i]%2==0) 
			{
				System.out.println("Even No :"+a[i]);
			}
			else 
			{
				System.out.println("Odd No :"+a[i]);
			}
		}
		*/
		
		System.out.println("Even no");
		for(int x:a) 
		{
			if(x%2==0) {
			System.out.println(x);
			}
		}
		
		System.out.println("Odd no");
		for(int x:a) 
		{
			if(x%2!=0) {
			System.out.println(x);
			}
		}
		
	}

}
