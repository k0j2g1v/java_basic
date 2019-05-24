package Prob;

public class Prob7_Person extends Object {
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public Prob7_Person() {
	}

	public Prob7_Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void print() {
		System.out.printf("이름: %s 나이: %d ",name,age);
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
