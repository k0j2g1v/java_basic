package day03;

public class Test05 {

	public static void main(String[] args) {
		
		int sum = 0;
		for(int i = 1 ; i<=100 ; i++) {
			if(i%2!=0) {
			sum = sum + i;
			System.out.print(i+ " + ");
			}
		}
		System.out.println();
		System.out.println(sum);
		
		System.out.println("=======================");
		
		for(int i=1;i<10;i++) {				
			for(int j=2;j<10;j++) {
				System.out.printf("%d*%d=%2d|",j,i,i*j);
			}
		System.out.println("");
		}
	}
}
