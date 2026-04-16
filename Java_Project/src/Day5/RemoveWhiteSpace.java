package Day5;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
	
		String str = "    P r a     f u l    ";
		
		System.out.println(str.replace(" ", ""));
		
		//System.out.println(str.trim());
	
		System.out.println(str.replaceAll("\\s", ""));
	}

}
