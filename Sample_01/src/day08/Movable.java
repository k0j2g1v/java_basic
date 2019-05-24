package day08;

public interface Movable {
	public abstract void move();
}

interface Drawable {
	void draw();
}

interface MoveableAndDrawable extends Movable, Drawable{	
	
}

class Circle extends Object implements MoveableAndDrawable {

	@Override
	public void move() {
		System.out.println("Circle Move");

	}

	@Override
	public void draw() {
		System.out.println("Circle Draw");

	}
}

class Rectangle implements MoveableAndDrawable{

	@Override
	public void draw() {
		System.out.println("Rectangle Draw");
		
	}

	@Override
	public void move() {
		System.out.println("Rectangle Move");
		
	}
	
}