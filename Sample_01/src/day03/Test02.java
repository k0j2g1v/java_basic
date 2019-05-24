package day03;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("성적처리 Application 시작혀려면 yes를 입력하세요.");
		
		String msg = input.nextLine();
		
		if(!(msg != null && msg.equalsIgnoreCase("yes"))) {
			System.out.println("성적처리 Application stop");
			if(input != null) { 
				input.close();
				input = null;
			}
			return;
		}
		System.out.println("성적처리 Application start");
		System.out.println("성적처리 입력하세요..");
		System.out.println("국어 영어 수학 \n 예) 90 90 90 엔터");
		
		int k1 = input.nextInt();
		int k2 = input.nextInt();
		int k3 = input.nextInt();
		input.nextLine();
		
		double m=0.0;
		System.out.printf("국어 = %d 영어 = %d 수학 = %d",k1,k2,k3);
		System.out.printf("\t평균 = %.2f%n",m=(k1+k2+k3)/3.);
		
		//등급처리
		char grade = 'F';
		
		
		 if(m>= 90 && m <= 100) grade = 'A'; else if(m>=80 && m <90) grade = 'B'; else
		 if(m>=70 && m <80) grade = 'C'; else if(m>=60 && m <70) grade = 'D'; else
		 grade = 'F';
		
		switch ((int)m/10) {
		case 10:
			grade='A';
			break;
		case 9:
			grade='A';
			break;
		case 8:
			grade='B';
			break;
		case 7:
			grade='C';
			break;
		case 6:
			grade='D';
			break;
		default:
			grade='F';
			break;
		}
		System.out.printf("성적처리겨과 [%c]",grade);
		
		
		//Scanner 자원반납 코드를 완성하세요
		
		 if(input != null) { input.close(); input = null; }
		
		System.out.println("성적처리 Application stop");
	}
}
