package Day5;

public class RemoveJunkORSepcialChar {

	public static void main(String[] args) 
	{
		String str ="S%e&le*^%ni#um";
		
	//	System.out.println(str.replace("%",""));

		str=str.replaceAll("[^a-zA-Z0-9]", "");
		
		//System.out.println(str.replaceAll("[^a-zA-Z0-9]", ""));
		
		System.out.println(str);
		
		
		
		
		
	}

}
