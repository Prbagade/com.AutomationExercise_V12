package Global_variable;

public class Global_variable {

	//global Static variable
	static int x=10;
	
	//global Non- static variable
	int z =20;
	
	public static void main(String[] args) {
	
		// obj creation is not req
		System.out.println("Global static variable ="+x);
		
		//obj creation is req
		Global_variable obj = new Global_variable();
		
		
//		int ss = obj.z;
		
		System.out.println("Global Non-static variable ="+obj.z);
		
//		System.out.println("Global variable ="+ss);
		
		
		//local variable 
		int a=10;
		int b=25;
		
		System.out.println("Local variable ="+a);
		
	}
}
