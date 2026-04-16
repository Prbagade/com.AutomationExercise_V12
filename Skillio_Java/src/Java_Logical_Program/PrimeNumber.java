package Java_Logical_Program;

public class PrimeNumber {

	public static void main(String[] args) {

		// Check prime Number
		// Prime number is divisible 1 and itself only

		int num = 11;
		int count = 0;

		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.println("Its a Prime Number");
		} else {
			System.out.println("Not a Prime Number");
		}

	}
}