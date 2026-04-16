package Day5;

public class countOccranceOfcharacter {

	public static void main(String[] args)
	{
		String str = "aasssseeddrrggg";
	
		int totalcount=str.length(); // total length of string
		
		int totalcount_char=str.replace("s", "").length(); // total length after removing character
		
		//System.out.println("Total count of char = "+(totalcount-totalcount_char));
		
		int count= totalcount-totalcount_char;
		
		System.out.println("Total count = "+count);
		
		
		
	}
}
