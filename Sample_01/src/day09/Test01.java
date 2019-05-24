package day09;

public class Test01 {
	public static void main(String[] args) {
		Object msg1 = "hello java";
		Object msg2 = "hello java";
		
		System.out.println(msg1.toString());
		System.out.println(msg2);
		System.out.println("msg  와 msg2 비교"+msg1.equals(msg2));
		
		Object emp1 = new Employee("홍길동","기술부");
		Object emp2 = new Employee("홍길동","기술부");
		
		System.out.println(emp1.toString());
		System.out.println(emp2);
		}
}
