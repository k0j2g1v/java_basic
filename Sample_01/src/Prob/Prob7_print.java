package Prob;

public class Prob7_print extends Prob7_Person{

	public static void main(String[] args) {
		Prob7_Student s = new Prob7_Student("홍길동" , 20  , 200201);
		Prob7_Teacher t = new Prob7_Teacher("이순신" , 30  , "JAVA");
		Prob7_Employee e = new Prob7_Employee("유관순" , 40  , "교무과");
		
		s.print();
		t.print();
		e.print();
	}

}
