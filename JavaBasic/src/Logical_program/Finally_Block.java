package Logical_program;

public class Finally_Block {

	public static void main(String[] args) {

		int[] a = { 0, 1, 2, 3, 4, 5, 6 };

		try {
			a[7] = 98;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("logout from application");
		}

		for (int s : a) {
			System.out.println(s);
		}

	}
}
