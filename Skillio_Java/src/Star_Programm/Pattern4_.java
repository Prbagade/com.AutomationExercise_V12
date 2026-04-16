package Star_Programm;

public class Pattern4_ {

	public static void main(String[] args) {
		
		for(int line=1; line<=5;line++) 
		{
			for(int sp=1; sp<=line;sp++) 
			{
				System.out.print(" ");
			}
			for(int star=5;star>=line;star--) 
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
