package day10_collection;

public class EmployeeTest {
	public static void main(String[] args) {
		
		/*
		 * Employee<String> emp = new Employee<String>("홍길동", "2019001");
		 * System.out.println(emp.number.substring(0,4));
		 * 
		 * Employee<Integer> emp1 = new Employee<Integer>("김길동", 1);
		 * System.out.println(emp1);
		 * 
		 * Employee emp2 = new Employee("고길동", 2019002); //타입 선언을 안할경우 오브젝트 타입이됨 Sy
		 *stem.out.println(emp2.number);	
		 */
		
		Employee<String, String> emp1 = 
				new Employee<String, String>("홍길동","2019-001");
		System.out.println(emp1);
		Employee emp2 = new Employee("김길동",9);
		System.out.println(emp2);
		}
}
