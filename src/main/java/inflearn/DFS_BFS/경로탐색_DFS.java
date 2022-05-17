package inflearn.DFS_BFS;

import java.util.Scanner;

public class 경로탐색_DFS {
	static int n, m, answer=0;
	static int[][] graph;
	static int[] ch;
	
	public static void print(int[] arr) {
		for(int i : arr) {
			System.out.print(i);
		}
		System.out.println();
	}
	
	public void DFS(int v){
		if(v == n) {
			answer++;
			print(ch);
		}
		else {
			for (int i = 1; i <= n; i++) {
				if(graph[v][i] == 1 && ch[i] == 0) { // 길찾기
					ch[i] = 1; // 방문상태로 변경(경로노드가 많기 때문 1->2->3 인데 3->2 방지
					DFS(i);
					ch[i] = 0;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		경로탐색_DFS T = new 경로탐색_DFS();
		Scanner kb = new Scanner(System.in);
		n=kb.nextInt();
		m=kb.nextInt();
		graph=new int[n+1][n+1];
		ch=new int[n+1];
		for(int i=0; i<m; i++){
			int a=kb.nextInt();
			int b=kb.nextInt();
			graph[a][b]=1;
		}
		ch[1]=1;
		T.DFS(1);
		System.out.println(answer);
	}
}
