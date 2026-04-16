package Star_Programm;

import java.util.Scanner;

public class Pattern2_Pyramid {

	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter Star count: ");
//		int star =sc.nextInt();
		int star = 5;

		for (int line = 1; line <= star; line++) {
			for (int sp = 5; sp >= line; sp--) {
				System.out.print(" ");
			}
			for (int ast = 1; ast <= line; ast++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
