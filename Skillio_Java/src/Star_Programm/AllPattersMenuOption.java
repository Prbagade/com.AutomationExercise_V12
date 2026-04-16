package Star_Programm;

import java.util.Scanner;

public class AllPattersMenuOption {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Star Number: ");
		int num=sc.nextInt();
		
		for (int line = 1; line <= num; line++) {
			for (int sp = num; sp >= line; sp--) {
				System.out.print(" ");
			}
			
			for (int ast = 1; ast <= line; ast++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}
}
