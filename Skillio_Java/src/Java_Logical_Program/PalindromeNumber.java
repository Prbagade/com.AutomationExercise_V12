package Java_Logical_Program;

public class PalindromeNumber {

	public static void main(String[] args) {

		//Palindrome : After revese a number should be same as original
		
		int num = 121;
		int org_num = num;
		int rev = 0;

		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}

//		System.out.println(rev);

		if (org_num == rev) {
			System.out.println(org_num + " Palindrome numb");
		} else {
			System.out.println(org_num + " Not a Palindrome numb");
		}
	}

}
