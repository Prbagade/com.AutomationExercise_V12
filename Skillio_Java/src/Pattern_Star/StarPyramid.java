package Pattern_Star;

public class StarPyramid {

	public static void main(String[] args) {

		// Star pyramid
		for(int line=1;line<=5;line++) 
		{
			for(int sp=5;sp>=line;sp--) // for space 
			{
				System.out.print("-"); 
			}
			for(int str=1;str<=line;str++) // for star 
			{
				System.out.print("* ");
			}
			System.out.println(); // for line 
		}
		System.out.println("\n \t\t Thank you...");

		System.out.println("=========================================");

		// Invert Star Pyramid
		for (int line2 = 1; line2 <= 5; line2++) {
			for (int sp2 = 1; sp2 <= line2; sp2++) {
				System.out.print(" ");
			}
			for (int str2 = 5; str2 >= line2; str2--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("\n \t\t Thank you...");
	}
}
