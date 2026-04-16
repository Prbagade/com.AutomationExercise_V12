package Java_Logical_Program;

public class largestOfThreeNum {

	public static void main(String[] args) {
		// Largest num of three

		int a = 50, b = 70, c = 60;

		if (a > b && a > c) {
			System.out.println("a is Largest number: " + a);
		} else if (b > a && b > c) {
			System.out.println("b is Largest number: " + b);

		} else if (c > a && c > b) {

			System.out.println("c is Largest number: " + c);
		}

		// Find smallest number of three
		/*
		 * int a=5, b=40, c=10;
		 * 
		 * 
		 * if(a<b && a<c) { System.out.println("a is smallest numb: "+a); } else if(b<a
		 * && b<c) {
		 * 
		 * System.out.println("b is smallest numb: "+b); } else if(c<a && c<b) {
		 * 
		 * System.out.println("c is smallest numb: "+c); }
		 */

	}

}
