package TV;

public class TVuser {
	public static void main(String[] args) {
		TV user1 = new STV();
		TV user2 = new LTV();
		
		tv(user1);
	}
	
	public static  void tv(TV tv) {
		tv.powerOn();
	}	
}


