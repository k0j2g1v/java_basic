package Prob;

import java.util.Date;
import java.util.Scanner;

public class Prob2_최재범 {
	public static void main(String[] args) {
		int num = 90;
		System.out.printf("%d  => ", num);
		System.out.println(num < 0 ? "음수": num == 0 ? "0":"양수");
		
		/*
	        다음은 대문자를 소문자로 변경하는 코드입니다.
	        변수 ch에 저장된 문자가 대문자 인 경우에만 
		소문자로 변경하는 코드를 완성 합니다.
	  	*/
		char ch = 'T';
		char lowerCase = (ch >= 'A' && ch <= 'Z' )? (char)(ch +32):ch;
		System.out.print("ch:"+ch);
		System.out.println(" to lowerCase :"+lowerCase);
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("년도를 입력하세요: ");
		int k1 = keyboard.nextInt();
		keyboard.nextLine();
		
					
		//System.out.println(k1<=0 ? "제대로 입력해주십시오.": k1%4!=0 ? "윤년이 아닙니다" : k1%100!=0 ? "윤년입니다.":k1%400==0 ? "윤년입니다":"윤년이 아닙니다");
		System.out.println((k1%400 == 0 || (k1 % 4 == 0 && k1 % 100 != 0))? "윤년" : "평년");
		
		
	}

}
