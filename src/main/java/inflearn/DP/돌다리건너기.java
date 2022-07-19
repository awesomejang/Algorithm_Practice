package inflearn.DP;

import java.util.Scanner;

public class 돌다리건너기 {
	static int[] dy;
	public int solution(int n) {
		dy[1] = 1;
		dy[2] = 2;
		for (int i = 3; i < dy.length; i++) {
			dy[i] = dy[i-2] + dy[i-1];
		}
		return dy[n];
	}
	
	public static void main(String[] args) {
		돌다리건너기 T = new 돌다리건너기();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt() + 1;
		dy = new int[n+1];
		System.out.println(T.solution(n));
	}
}
