package Prob;

public class Prob7_Teacher extends Prob7_Person {
	String student;
	public Prob7_Teacher() {
}
	public Prob7_Teacher(String name, int age, String student) {
		super(name,age);
		this.student = student;
	}
	public void print() {
		super.print();
		System.out.printf("[Teacher ] 학 번:%s  %n",student);
	}	
	public String getStudent() {
		return student;
	}
	public void setStudent(String student) {
		if(student != null && student.length() > 0)
		this.student = student;
	}
}
