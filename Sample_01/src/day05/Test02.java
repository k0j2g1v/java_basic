package day05;

public class Test02 {

	public static void main(String[] args) {
		TV tv1 = new TV();
		tv1.color="black";
		tv1.power();
		tv1.channelUp();
		//tv1.print();
		
		TV tv2 = new TV();
		tv2.color="whiteblack";
		//tv2.print();
	
		System.out.println("---------------------------------------");
		//TV[]  tvs = new TV {tv1,tv2};
		//tvs[0] = tv1;
		//tvs[1] = tv2;
		
		//TV[] tvs = {tv1,tv2,null,null,null};
		TV[] tvs = null;
		tvs = new TV[] {tv1,tv2,null,null,null};
		for(int i = 0 ; i < tvs.length; i++) {
			if(tvs[i] != null)
				{tvs[i].print();
				
				}
		}
	}
}
