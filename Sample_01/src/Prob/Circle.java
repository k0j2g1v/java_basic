package Prob;

public class Circle extends Prob8 {

	private double radius;
	
	public Circle(){}
	
	public Circle(String name, double radius) {
		super(name);		
		this.radius = radius;
	}

	@Override
	public void calculationArea() {
		super.area = Math.PI*radius*radius;
	}	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	
	
}
