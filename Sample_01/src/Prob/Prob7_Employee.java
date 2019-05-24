package Prob;

public class Prob7_Employee extends Prob7_Person {
	private String dept;
	
	public Prob7_Employee(){super();}
	
	public Prob7_Employee(String name,int age, String dept){
		super(name,age);
		this.dept = dept;
	}

	public void print() {
		super.print();
		System.out.printf("[Employee] 부 서: %s  %n",dept);
	}
	
	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		if(dept != null && dept.length() > 0)
		this.dept = dept;
	}
}
