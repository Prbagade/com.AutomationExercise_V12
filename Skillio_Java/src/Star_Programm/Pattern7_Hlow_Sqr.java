package Star_Programm;

public class Pattern7_Hlow_Sqr {

	
	public static void main(String[] args) {
//		programm
		//1
		//1 2
		//1 2 3
		//1 2 3 4
		
		for(int i=1; i<=4;i++) 
		{
			for(int j=1;j<=i;j++) 
			{
				System.out.print(" "+j);
			}
			System.out.println();
		}
		System.out.println("==================================");
		
		char ch ='a';
		
		for(int k=1; k<=4;k++) 
		{
			for(int l=1; l<=k;l++) {
				System.out.print((char)('a'+(l-1))+" ");
			}
			System.out.println();
		}
		
		
		System.out.println("==================================");
		//hollow sqaure
		
		for(int line =1;line <=4;line++) 
		{
			for(int ast=1;ast<=4;ast++) 
			{
				if(line >=2 && ast >=2 && line <= 3 && ast <=3 ) 
				{
					System.out.print("  ");
				}
				else 
				{
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
}
