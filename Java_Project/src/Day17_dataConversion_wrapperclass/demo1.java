package Day17_dataConversion_wrapperclass;

public class demo1 {

	public static void main(String[] args) {

		//wrapper class --> 
		
		//String to int
		String str1 ="20";
		String str2 ="30";
		
		//conversion
		System.out.println(Integer.parseInt(str2)+Integer.parseInt(str2));

		//String to double
		String s1="20.5";
		String s2="30.0";
		
		System.out.println(Double.parseDouble(s1)+Double.parseDouble(s2));
		
		//String to boolean 
		String s3="Welcome";  // other than true it write false
		System.out.println(Boolean.parseBoolean(s3));
		
		
		//int,double,boolean,char to String
		
		int a=12,b=15;
		double d=15.25;
		boolean bool=true;
		char c='A';
		
		System.out.println(String.valueOf(a)+String.valueOf(b));
		
		String ss=String.valueOf(d);
		System.out.println(ss);

		 ss=String.valueOf(bool);
		System.out.println(ss);
		
		 ss=String.valueOf(c);
		System.out.println(ss);
	
		
	}

}