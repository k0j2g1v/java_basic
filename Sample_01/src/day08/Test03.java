package day08;

import Prob.Prob7_Person;
import Prob.Prob7_Student;
public class Test03 {

	public static void main(String[] args) {
		Object[] obj = {
				new Fish("쿠피"),				
				new Dog("시베리아허스키","캐리"),
				"hello java",
				new Prob7_Student("000",22,1),
				new Prob7_Student("000",22,2)
		};
		((Animal)obj[0]).breath();
		for(Object data:obj) {
		exec(data);
		}
	}
	public static void exec(Object obj) {
		if(obj instanceof Prob7_Person)
		((Prob7_Person)obj).print();
		if(obj instanceof Animal)
		((Animal)obj).print();
	}
}
