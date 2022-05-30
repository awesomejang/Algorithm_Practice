package inflearn.DFS_BFS.practice;

import java.util.Scanner;

public class 조합수_메모이제이션 {
	// ex 5개에서 3개를 뽑는 경우의 수는 5C3 -> 5-1C3-1 + 5-1C3;
	// 만약 5번째 수를 포함한다면 그 수를 뺀 4에서 나머지 2를 고르는 경우와 
	// 포함하지 않는다면 나머지 4개에서 3개를 뽑는 경우를 더하면 구할 수 있다. 
	
	// 메모이제이션을 위한 배열 33까지 입력값을 받기 때문에 넉넉하게 35 
	int[][] dy = new int[35][35];
	public int DFS(int n, int r) {
		if(dy[n][r] > 0) return dy[n][r];
		if(n == r || r == 0) {
			return 1;
		}else {
			return dy[n][r] = DFS(n-1, r-1) + DFS(n-1, r);
		}
	}

	public static void main(String[] args) {
		조합수_메모이제이션 T = new 조합수_메모이제이션();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int r = kb.nextInt();
		System.out.println(T.DFS(n, r));
	}
}
