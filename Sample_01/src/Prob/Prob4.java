package Prob;

import java.util.Arrays;

public class Prob4 {
	public static void main(String[] args) {
		int[] num = new int[6];
		for (int i = 0; num.length > i; i++) {
			num[i] = (int) (Math.random() * 45 + 1);
			/*
			 * for (int j = i; j >= 0; j--) { if (num[j] == num[i]) { while (num[j] !=
			 * num[i]) { num[j] = (int) (Math.random() * 45 + 1); } } }
			 */
			for (int j = 0; j < i; j++) {
				if (num[i] == num[j]) {
					i--;
					break;
				}
			}
			System.out.println(Arrays.toString(num));
		}

		System.out.println(Arrays.toString(num));
		int count = 0;
		for (int i = 0; num.length - 1 > i; i++) {
			int min = i;
			for (int j = i + 1; j < num.length; j++) {
				if (num[min] > num[j]) {
					min = j;
				}
			}
			if (i != min) {
				int temp = num[i];
				num[i] = num[min];
				num[min] = temp;
				count++;
			}
		}
		System.out.printf("swap 횟수 :%d%n", count);
		System.out.println(Arrays.toString(num));
	}
}
