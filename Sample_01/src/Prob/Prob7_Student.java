package Prob;

public class Prob7_Student extends Prob7_Person {
	private int id;
	
	public Prob7_Student(String name, int age, int id) {
		super(name,age);		
		this.id = id;		
	}
	
	public void print() {
		super.print();
		System.out.printf("[Student ] 학 번:%d  %n",id);
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		if(id > 0)
		this.id = id;
	}
}
