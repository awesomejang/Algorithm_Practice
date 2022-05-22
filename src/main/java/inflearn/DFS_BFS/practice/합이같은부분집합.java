package inflearn.DFS_BFS.practice;

import java.util.Scanner;

public class 합이같은부분집합 {
	static String answer = "NO";
	static int n, total = 0;; // 총 개수
	boolean flag = false;
	
	public void DFS(int L, int sum, int[] arr) {  //sum을 파라미터로 받도록 하여 누적되지않도록
		if(flag) return;
		if(sum > (total/2)) return; // 반이 넘어가버리면 더이상 의미가 없기때문에 중지
		// 0부터이기때문에 ==n 이면 끝 
		if(L == n) { 
			if((total - sum) == sum) { // 반반 나누어졌다.
				answer = "YES";
				flag = true;
			}
		}
		else {
			DFS(L+1, sum+arr[L], arr); //사용함
			DFS(L+1, sum, arr); // 사용안함
		}
	}
	
	public static void main(String[] args) {
		합이같은부분집합 T = new 합이같은부분집합();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
			total += arr[i];
		}
		T.DFS(0, 0, arr);
		System.out.println(answer);
	}
}
