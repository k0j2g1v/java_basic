package Prob;

public class Rectangle extends Prob8 {
	private double width;
	private double hight;
	
	public Rectangle() {}
	
	public Rectangle(String name, double width, double hight) {
		super(name);
		this.width = width;
		this.hight = hight;
	}

	@Override
	public void calculationArea() {
		super.area = width*hight;
	}
}
