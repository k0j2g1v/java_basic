package day03;

import java.util.Scanner;

public class Test07 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (true) {
			System.out.println("성적처리 Application 시작혀려면 yes를 입력하세요.");
			System.out.println("q를 누르면 종료됩니다.");
			String msg = input.nextLine();

			if (msg.equalsIgnoreCase("q")) {
				if (input != null) {
					input.close();
					input = null;
					System.out.println("성적처리 Application stop");
					return;
				}
			}
			if (msg.equalsIgnoreCase("yes")&& msg != null) {
			System.out.println("성적처리 Application start");
			System.out.println("이름 입력");
			System.out.println("성적처리 입력하세요..");
			System.out.println("국어 영어 수학 \n 예) 90 90 90 엔터");

			int k1 = input.nextInt();
			int k2 = input.nextInt();
			int k3 = input.nextInt();
			input.nextLine();

			double m = 0.0;
			System.out.printf("국어 = %d 영어 = %d 수학 = %d", k1, k2, k3);
			System.out.printf("\t평균 = %.2f%n", m = (k1 + k2 + k3) / 3.);
			
			// 등급처리
			char grade = 'F';

			if (m >= 90 && m <= 100)
				grade = 'A';
			else if (m >= 80 && m < 90)
				grade = 'B';
			else if (m >= 70 && m < 80)
				grade = 'C';
			else if (m >= 60 && m < 70)
				grade = 'D';
			else
				grade = 'F';
			System.out.printf("성적처리결과 [%c]", grade);
			}
		}		
	}
}
