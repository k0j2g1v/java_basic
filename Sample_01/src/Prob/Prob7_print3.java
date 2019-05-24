package Prob;

public class Prob7_print3 extends Prob7_Person{

	public static void main(String[] args) {
		Prob7_Person s1 = new Prob7_Student("홍길동" , 20  , 200201);
		Prob7_Person t1 = new Prob7_Teacher("이순신" , 30  , "JAVA");
		Prob7_Person e1 = new Prob7_Employee("유관순" , 40  , "교무과");
		
		Prob7_print3.personPrint(e1);
		Prob7_print3.personPrint(t1);
		Prob7_print3.personPrint(s1);
	}
	
	
	public static void personPrint(Prob7_Person e) {
		e.print();
	}	
}
