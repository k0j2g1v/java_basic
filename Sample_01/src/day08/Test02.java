package day08;

public class Test02 {
	public static void main(String[] args) {
		//Animal a = new Animal(); X
		//Animal[] animals= new Animal[3];  //타입선언은 문제 없다
		Animal[] animals = {
				new Fish("쿠피"),
				new Dog("시베리아허스키","캐리")
		};
		
		for(Animal a:animals) {
			exec(a);
		}
		}

	public static void exec(Animal f) {
		f.breath();
		f.print();
	}	

}
