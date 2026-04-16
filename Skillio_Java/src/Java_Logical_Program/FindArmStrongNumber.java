package Java_Logical_Program;

public class FindArmStrongNumber {

	// Find ArmStrong number 1 to 1000;

	public static void main(String[] args) {

		int temp;
		int rem;
		int num = 500;
		int sum = 0;

		System.out.print("Armstrong numbers from 1 to N: ");
		for (int i = 1; i <= num; i++) {
			temp = i;
			while (temp > 0) {
				rem = temp % 10;
				sum = sum + (rem * rem * rem);
				temp = temp / 10;
			}

			if (sum == i) {
				System.out.print(i + " ");
			}
			sum = 0;
		}
	}
}
