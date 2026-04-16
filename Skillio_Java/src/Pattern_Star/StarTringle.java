package Pattern_Star;

public class StarTringle {

	public static void main(String[] args) {

		// Right Star Tringle patter

		for (int line = 0; line <= 5; line++) {
			for (int str = 0; str <= line; str++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("++++++++++++++++++++++++++++++++++++++");
		
		//Invert Right star tringle
		System.out.println("Invert Right star tringle");
		
		for(int line1=0;line1<=5;line1++)
		{
			for(int str2=5;str2>=line1;str2--) 
			{
				System.out.print("* ");
			}
			System.out.println();
		}

		System.out.println("++++++++++++++++++++++++++++++++++++++");
		
		//Reverse/left Star pattern
		
		for(int line3=0;line3<=5;line3++) 
		{
			for(int sp=1;sp<=line3;sp++) 
			{
				System.out.print("  ");
			}
			for(int str3=5;str3>=line3;str3--) 
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
