
package Day4;

import java.util.Arrays;

public class SortingString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	char s[] = { 'B', 'E','A', 'D','C'};
		
		String s[] = {"Pram", "Amar","Dinesh", "Ganesh"};

		System.out.println("Before sorting "+Arrays.toString(s));
		
		Arrays.sort(s);
		
		System.out.println("After sorting "+Arrays.toString(s));
		
		
	}

}
