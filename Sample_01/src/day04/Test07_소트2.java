package day04;

import java.util.Arrays;

public class Test07_소트2 {
	public static void main(String[] args) {
		int[] num = new int[10000];
		for(int i = 0 ; num.length > i  ;i++) {
			num[i] = (int)(Math.random()*45+1);
		}
		System.out.println(Arrays.toString(num));
		
		for(int i = 0 ; num.length -1 > i ; i++) {
			for(int j = i+1 ; num.length > j ; j++) {
				
				if(num[i] > num[j]) {
					int temp = num[i];
					num[i] = num[j];
					num[j]=temp;
				}
				
			}
		
		}
		System.out.println(Arrays.toString(num));
		
	}

}
