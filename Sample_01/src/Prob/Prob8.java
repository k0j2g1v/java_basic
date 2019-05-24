package Prob;

public abstract class Prob8 {
	protected double area;
	private String name;	
	
	public Prob8(){	}
	
	public Prob8(String name) {
		this.name = name;
	}
	
	public void print(){
		System.out.printf("%s의 면적은 %f%n",name,area);
	}
	
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public abstract void calculationArea(); 
	
}
