package Returntype;

public class ReturnTypeDemo {

	// returntype example

	// sagar addition code
	int addition(int a, int b) {
		int c = a + b;
		System.out.println("Addition = " + c);
		return c;
	}

	// ram average code
	int average(int a, int b) {
//		int sum = a + b;
		ReturnTypeDemo e = new ReturnTypeDemo();
		int sum =e.addition(a, b);
		int avg = sum / 2;
		System.out.println("Average = " + avg);
		return avg;
	}
	
	// rahul gst addition code
	void GST() 
	{
		ReturnTypeDemo e = new ReturnTypeDemo();
		int avg =e.average(20, 20);
		int total= avg+10;
		System.out.println("With gst total = "+total);
	}

	public static void main(String[] args) {

		ReturnTypeDemo obj = new ReturnTypeDemo();
//		obj.addition(10, 30);
//		obj.average(20,40);
		obj.GST();
		
	}
}
