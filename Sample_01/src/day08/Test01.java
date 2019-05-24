package day08;

import static java.lang.Math.*;
import static java.lang.Math.PI;

public class Test01 {
	public static void main(String[] args) {
		System.out.println(Math.PI);
		System.out.println(PI);
		System.out.println(Math.random());
		System.out.println(random());
		
		Fish f = new Fish("쿠피");
		Dog d = new Dog("시베리안허스키","캐시");
		
		exec(d);
		}

	public static void exec(Animal f) {
		f.breath();
		f.print();
	}

}
