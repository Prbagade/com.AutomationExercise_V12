package Day2;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=1; // for odd i=1
		
//		while(i<=10) 
//		{
//			System.out.println(i+" Even no.");
//			i+=2;
//		}
		
		while(i<=10) 
		{
			if(i%2==0) {
			System.out.println(i+" Even No.");
			}
			else 
			{
				System.out.println(i+" Odd No.");
			}
			i++;
		}
		
		
	}

}
