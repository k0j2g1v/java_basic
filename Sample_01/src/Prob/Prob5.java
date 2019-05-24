package Prob;

import java.util.Scanner;

public class Prob5 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Book1 b1 = new Book1();
		b1.setTitle("홍길동");
		b1.setPrice(3000);
		b1.println();
	}

}

class Book1 {
	private String Title;
	private int Price;

	public String getTitle() {
		
		return Title;

	}

	public void setTitle(String title) {
		
		Title = title;
	}

	public int getPrice() {
		return Price;
	}

	public void setPrice(int price) {
		Price = price;
	}
	public void println() {
		System.out.printf("[제목:  %s    가격:   %d]",Title,Price);
	}
}
