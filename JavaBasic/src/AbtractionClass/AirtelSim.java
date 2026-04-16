package AbtractionClass;

public class AirtelSim extends SimCard {


	@Override
	void sms() {
		// TODO Auto-generated method stub
		System.out.println("200 sms per day");
	}

	@Override
	void calls() {
		// TODO Auto-generated method stub
		System.out.println("unlimated night calls and domastic call");
	}

	@Override
	void internet() {
		// TODO Auto-generated method stub
		System.out.println("3GB per day internet use");
	}
	public static void main(String[] args) {

		AirtelSim ar = new AirtelSim();
		ar.sms();
		ar.calls();
		ar.internet();
	}
}
