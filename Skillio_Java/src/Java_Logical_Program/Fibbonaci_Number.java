package Java_Logical_Program;

public class Fibbonaci_Number {

	// The Fibonacci series is a series of elements where the previous two elements
	// are added to generate the next element.
	// Fibonacci series 0 1 1 2 3 5 8

	public static void main(String[] args) {

		int a = 0, b = 1;
		int temp;

		for (int i = 0; i <= 10; i++) {
			temp = a + b;
			System.out.print(temp + ",");
			a = b;
			b = temp;
		}

	}

}
