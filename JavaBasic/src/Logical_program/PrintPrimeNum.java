package Logical_program;

public class PrintPrimeNum {

	public static void main(String[] args) {

		//print prime numbers
		int num =50;
		
		for (int i = 1; i <= num; i++) {
			 int count = 0;
			
			for (int j = 1; j <= num; j++) {

				if (i % j == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.println(i);
			}
		}
	}
}
