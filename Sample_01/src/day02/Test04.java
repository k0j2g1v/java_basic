package day02;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		int num = 15;
		System.out.println(15%3);
		System.out.println(num++);
		System.out.println();
		
		Scanner keyboard = null;
		String msg = "Hello java progaming";
		String msg2 = "Hello java progaming!!!";
		boolean flag = num < 15 && msg.length() > 0 ;
		System.out.println(flag);
		/*
		System.out.println(num == msg.length());
		System.out.println(msg.equals(msg2)); // 주소를 자용할대는 
		System.out.println(msg==msg2));
		*/
		System.out.println("==============================");
		String s1 = new String("hello");
		String s2 = new String("hello");
		System.out.println(s1 == s2);         //false
		System.out.println(s1.equals(s2));    //ture
		
		System.out.println(4 << 2 );
		System.out.println(4 >> 1 );
		System.out.println(4 % 1);
		
		keyboard = new Scanner(System.in);
		System.out.println("저무를 입력하세요...");
		int jumsu = keyboard.nextInt();
		keyboard.nextLine();
		keyboard.close();
		keyboard = null;
		
		System.out.println("유효성 검증");
		if (!(jumsu >= 0 && jumsu <= 100)) {
			return;
		}
		System.out.println(jumsu >= 80 ? "PASS":"NO_PASS");
	
		byte a = 10;
		byte b = 20;
		byte c = (byte)(a + b);
		System.out.println();
		
		System.out.println("END");

	}

}
