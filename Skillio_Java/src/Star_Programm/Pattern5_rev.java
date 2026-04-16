package Star_Programm;

public class Pattern5_rev {

	public static void main(String[] args) {

		for (int line1 = 1; line1 <= 5; line1++) {
			for (int sp1 = 5; sp1 >= line1; sp1--) {
				System.out.print(" ");
			}
			for (int star1 = 1; star1 <= line1; star1++) {
				System.out.print(" *");
			}
			System.out.println();
		}

		for (int line = 1; line <= 6; line++) {
			for (int sp = 1; sp <= line; sp++) {
				System.out.print(" ");
			}
			for (int star = 6; star >= line; star--) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
