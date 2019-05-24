package day06;

class ProductTest {
	public static void main(String args[]) {
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		
		System.out.println("p1의 제품번혼(serial no)는 " + p1.SerialNo);
		System.out.println("p2의 제품번혼(serial no)는 " + p2.SerialNo);
		System.out.println("p3의 제품번혼(serial no)는 " + p3.SerialNo);
		System.out.println("생상된 제품의 ㅜ는 모두 "+Product.count+"개 입니다.");
	}
}
class Product {
	static int count = 0;
	int SerialNo;
	{
		++count;
		SerialNo = count;
	}
	public Product() {}
}
