package day04;

import java.util.Arrays;

public class Test01 {
	public static void main(String[] args) {
		int count;     //초기화 필수
		//System.out.println(count);
		
		double m = 0.0;
		int[] jumsu; //배열선언
		jumsu = new int[5]; //배열생성 생성디 default 초기화
		
		jumsu[0] = 90;
		jumsu[1] = 99;
		jumsu[2] = 80;
		jumsu[3] = 70;
		jumsu[4] = 98;
		
		
		for(int i = 0 ; i < jumsu.length ; i++ ) {
		System.out.println(jumsu[i]+"");
		}
		
		System.out.println();
		System.out.println(jumsu);
		System.out.println(Arrays.toString(jumsu)); // 배열 출력 API
		
		int[] num = {88,95,84,74,65,45};
		System.out.println(Arrays.toString(num));
		
		String[] names;
		names = new String[5];
		names[0] = "홍길동";
		names[1] = "김길동";
		names[2] = "최길동";
		System.out.println(Arrays.toString(names));
		int sum = 0;
		for(int i = 0 ; i < jumsu.length ; i++) {
			sum += jumsu[i] ;
		}
		m=sum/jumsu.length;
		for(int i = 0; i < jumsu.length; i++) {
			if(names[i] !=null && names[i].length()!=0) 
			System.out.printf("%s ** : %3d %n",names[i].charAt(0),jumsu[i]);
			else 
			System.out.printf("이름없음 : %3d %n",jumsu[i]);
		
		}
		System.out.printf("학생평균%.2 %n",m);
		
	}
}
