package backjun.arr;

import java.util.Scanner;

public class 최댓값 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int max = Integer.MIN_VALUE;
		int answer = 0;
		for (int i = 1; i <= 9; i++) {
			int n = kb.nextInt();
			if(n > max) {
				answer = i;
				max = Math.max(max, n);
			}
		}
		System.out.println(max);
		System.out.print(answer);
	}
}
