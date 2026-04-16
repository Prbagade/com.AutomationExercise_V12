package StringClass;

public class BasicString3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Using new keyword
		// Memory stored in Heap area
		String str1 = new String("I love Pune City");

		// using Literals
		// Memory stored in String constant pool area
		String str2 = " I love Pune City";

		String str3 = " I love Mumbai City";

		String str4 = "   Delhi";

		//Replace();
		System.out.println(str1.replace("e", "x"));
		
		//replce first
		System.out.println(str2.replaceFirst("I", "we"));
		
		//replceAll();
		//case -1
		System.out.println(str1.replaceAll("[^0-9]", "x"));
		//case -2
		System.out.println(str1.replaceAll("[a-zA-Z]", "*"));
		//case -3
		System.out.println(str1.replaceAll("Pune", "####"));

	}

}
