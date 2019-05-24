package day05;

public class TV {
	//데이터 + 기능(method)
	
	String color;
	int size;
	boolean power;
	int channel;
	
	public void channelUp() {            //인스턴스 자원 = 오브젝트
 		this.channel++;                  //this = 힙에서만 사용 가능한 자원
	}
	public void channelDown() {
		this.channel--;
	}
	public void power() {
		this.power = !power;
	}
	public void print() {
		System.out.printf("TV[전워낭태 %b , 현제채널:%d ,  %s] %n",
				this.power,this.channel,this.color);
	}
	
	
	
}
