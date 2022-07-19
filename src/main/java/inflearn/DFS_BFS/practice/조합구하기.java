package inflearn.DFS_BFS.practice;

import java.util.Scanner;

public class 조합구하기 {
	// 1 + 2,3,4,5
	// 2 + 3,4,5
	// 3 + 4,5
	// 4 + 5
	// 5 
	static int[] combi;
	static int n, m;
	public void DFS(int L, int s) {
		if(L == m) { // 뽑을수가 찼다.
			for(int x : combi) System.out.print(x + " ");
			System.out.println();
		}
		else {
			for (int i = s; i <=n; i++) {
				combi[L] = i;
				DFS(L+1, i+1); // s=2 i =2,3,4 i로 해보자
			}
		}
	}
	public static void main(String[] args){
		조합구하기 T = new 조합구하기();
		Scanner kb = new Scanner(System.in);
		n=kb.nextInt();
		m=kb.nextInt();
		combi=new int[m];
		T.DFS(0, 1);
	}
}
