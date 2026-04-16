package StringClass;

public class BasicString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Using new keyword
		// Memory stored in Heap area
		String str = new String("Praful bagade");

		// using Literals
		// Memory stored in String constant pool area
		String str2 = " Praful rajeram bagade";

		String str3 = " Praful rajeram bagade";

		String str4 = "   Prafull";

//		str.length();

		// equals check the content of string
		System.out.println(str.equals(str2)); // false

		System.out.println(str3.equals(str2)); // true

		System.out.println("*********************************");
		// equal Is ignor Case

		System.out.println(str.equalsIgnoreCase(str2));// false

		System.out.println(str3.equalsIgnoreCase(str2)); // true

		System.out.println("*********************************");

		// charAt(index)
		System.out.println(str.charAt(5)); // false

		System.out.println("*********************************");

		// lower & upper case
		System.out.println(str3.toLowerCase()); // true
		System.out.println(str3.toUpperCase()); // true

		System.out.println("*********************************");

		// concate --> join two string
		System.out.println(str3.concat(" " + str)); // true

		System.out.println("*********************************");

		// trim() --> remove whitespaces into string
		System.out.println(str4.trim());

	}

}
