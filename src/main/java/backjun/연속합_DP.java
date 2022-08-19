package backjun;

import java.util.Scanner;

public class 연속합_DP {
	static int[] dy;
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		dy = new int[n];
		int answer = 0;
		for (int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}
		
		dy[0] = arr[0]; // 초기화
		answer = dy[0];
		for (int i = 1; i < arr.length; i++) {
			dy[i] = Math.max(arr[i], dy[i-1] + arr[i]);
			answer = Math.max(answer, dy[i]);
		}
		System.out.println(answer);
		
	}
}
