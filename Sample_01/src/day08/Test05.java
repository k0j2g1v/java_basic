package day08;

public class Test05 {
	public static void main(String[] args) {
		Circle c = new Circle();
		Rectangle r = new Rectangle();
		
		Drawable d = c;
		c.draw();
		
		Movable m = c;
		m.move();
		
		MoveableAndDrawable[] md = {c,r};
		md[0].draw();
		md[0].move();
	}
}
