package Prob;

public class TestShape {
	public static void main(String[] args) {
		Prob8 [] Prob8 = new Prob8[2];
		
		Prob8[ 0 ]  = new Circle("원",10);
		Prob8[ 1 ] = new Rectangle("직사각형",10,20);
		
		for (int i = 0; i < Prob8.length; i++) {
			Prob8[ i ].calculationArea();
			Prob8[ i ].print();
		}
	}
}
