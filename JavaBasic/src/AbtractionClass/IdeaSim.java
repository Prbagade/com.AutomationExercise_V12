package AbtractionClass;

public class IdeaSim extends SimCard{

	@Override
	void sms() {
		// TODO Auto-generated method stub
		System.out.println("100 sms free daily");
		
	}

	@Override
	void calls() {
		System.out.println("Unlimated ISO calls free ");
		
	}

	@Override
	void internet() {
		// TODO Auto-generated method stub
		System.out.println("2GB per day deta free");
	}

	public static void main(String[] args) {
		
		IdeaSim id = new IdeaSim();
		
		id.sms();
		id.calls();
		id.internet();
	}
	
	
	
}
