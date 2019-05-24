package util;

public class Calc {
	// + - * /
	public static double add(double a, double b) {
		return a + b;
	}

	public static int add(int... a) {
		int sum = 0;
		for (int data : a) {
			sum += data;
		}
		return sum;
	}

	// for(int i=0;i<a.length;i++) {
	// sum += a[i];
	// }
	public static int substract(int a, int b) {
		return a - b;
	}

	public static double multiply(double a, double b) {
		return a * b;
	}

	public static double divide(double a, double b) {
		return a / b;
	}
}
