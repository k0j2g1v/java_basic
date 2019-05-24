package Prob;

public class Prob7_print4 extends Prob7_Person {

	public static void main(String[] args) {
		Prob7_Person[] p = { 
				new Prob7_Employee("유관순", 40, "교무과"),
				new Prob7_Student("홍길동", 20, 1),
				new Prob7_Student("최길동", 20, 1),
				new Prob7_Student("이길동", 20, 1),
				new Prob7_Student("박길동", 20, 1),
				new Prob7_Teacher("이순신", 30, "JAVA"),
				new Prob7_Teacher("길순신", 30, "SQL")
				};
		
		for(Prob7_Person data:p) {
			personPrint(data);
		}
		for(int i = 0 ; i<p.length ;i++) {
			if(p[i] instanceof Prob7_Student) {
				System.out.println(((Prob7_Student)p[i]).getId());
				System.out.println(p[i].getName().charAt(0)+"**");
				Prob7_Student s = (Prob7_Student) p[i];
			}
		}
		
	}

	public static void personPrint(Prob7_Person e) {
		e.print();
	}
}
