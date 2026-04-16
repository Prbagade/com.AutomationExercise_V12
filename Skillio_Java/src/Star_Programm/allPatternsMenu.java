package Star_Programm;

import java.util.Scanner;

public class allPatternsMenu {

	public void drawPyramidPattern(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = i; j < n; j++)
				System.out.print(" ");
			for (int j = 1; j <= (2 * i - 1); j++)
				System.out.print("*");
			System.out.println();
		}
	}

	public void drawReversePyramid(int n) {
		for (int i = n; i >= 1; i--) {
			for (int j = n; j > i; j--)
				System.out.print(" ");
			for (int j = 1; j <= (2 * i - 1); j++)
				System.out.print("*");
			System.out.println();
		}
	}

	public void drawDiamond(int n) {
		drawPyramidPattern(n);
		for (int i = n - 1; i >= 1; i--) {
			for (int j = n; j > i; j--)
				System.out.print(" ");
			for (int j = 1; j <= (2 * i - 1); j++)
				System.out.print("*");
			System.out.println();
		}
	}

	public void drawNumbersPyramid(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = i; j < n; j++)
				System.out.print(" ");
			for (int j = 1; j <= i; j++)
				System.out.print(j);
			for (int j = i - 1; j >= 1; j--)
				System.out.print(j);
			System.out.println();
		}
	}

	public void drawCharacterPyramid(int n) {
		for (int i = 1; i <= n; i++) {
			char ch = 'A';
			for (int j = i; j < n; j++)
				System.out.print(" ");
			for (int j = 1; j <= i; j++)
				System.out.print(ch++);
			ch -= 2;
			for (int j = i - 1; j >= 1; j--)
				System.out.print(ch--);
			System.out.println();
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		allPatternsMenu t = new allPatternsMenu();

		while (true) {
			System.out.println("========= MENU =========");
			System.out.println("Select the pattern to draw");
			System.out.println("1. Pyramid");
			System.out.println("2. Reverse Pyramid");
			System.out.println("3. Diamond");
			System.out.println("4. Numbers Pyramid");
			System.out.println("5. Character Pyramid");
			System.out.println("6. Exit");
			System.out.println("========================");
			System.out.print("Enter your choice: ");

			int choice = sc.nextInt();

			if (choice == 6) {
				System.out.println("Exiting...");
				break;
			}

			System.out.print("Enter size: ");
			int n = sc.nextInt();

			switch (choice) {
			case 1:
				t.drawPyramidPattern(n);
				break;
			case 2:
				t.drawReversePyramid(n);
				break;
			case 3:
				t.drawDiamond(n);
				break;
			case 4:
				t.drawNumbersPyramid(n);
				break;
			case 5:
				t.drawCharacterPyramid(n);
				break;
			default:
				System.out.println("Invalid choice!");
			}
		}

		sc.close();
	}
}
