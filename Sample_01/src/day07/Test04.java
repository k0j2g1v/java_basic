package day07;

public class Test04 {
	public static void main(String[] args) {
		Fish f = new Fish("쿠피");
		Dog d = new Dog("시베리안허스키","캐리");
		
		Animal a = d;
		
		a.breath();
		a.print();
	}
}
