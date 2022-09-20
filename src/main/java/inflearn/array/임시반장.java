package inflearn.array;

import java.util.Scanner;

public class 임시반장 {
	public static int solution(int n, int[][] arr) {
		int answer = 0, max = Integer.MIN_VALUE;
		for (int i = 1; i <= n; i++) { // 비교대상
			int cnt = 0; // 개수 초기화
			for (int j = 1; j <=n; j++) { // 반복비교대상
				for (int k = 1; k <= 5; k++) {
					if(arr[i][k] == arr[j][k]) {
						cnt++;
						break; // 한번이라도 같은반이면 더이상 비교필요없다.
					}
				}
			}
			if(cnt > max) { 
				max = cnt;
				answer = i;
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[][] arr = new int[n+1][6]; // 사람만 변경되고 학년은 고정 
		for (int i = 1; i <=n; i++) {
			for (int j = 1; j <=5; j++) {
				arr[i][j] = kb.nextInt();
			}
		}
		System.out.println(임시반장.solution(n, arr)); 
	}
}
