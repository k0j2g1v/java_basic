package day04;

import java.util.Arrays;

public class Test07_소트 {
	public static void main(String[] args) {
		int[] num = new int[100];
		for (int i = 0; num.length > i; i++) {
			num[i] = (int) (Math.random() * 100 + 1);
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
		}

		System.out.println(Arrays.toString(num));

		for (int i = 0; num.length - 1 > i; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] > num[j]) {
					int temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}

		}

		System.out.println(Arrays.toString(num));
	}
}
