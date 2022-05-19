package inflearn.DFS_BFS;

import java.util.ArrayList;
import java.util.Scanner;

public class 경로탐색_DFS_Array {
	static int n, m, answer = 0; // n = 노드수 m = 간선수
	static ArrayList<ArrayList<Integer>> graph;
	static int[] ch;
	
	public void DFS(int v) {
		if(v == n) answer++; // 노드의 끝에 도달했다. 
		else {
			for(int nv : graph.get(v)) { // v노드의 간선노드 반복
				if(ch[nv] == 0) { // 들른적 없는 노드만 가도록, 원래 그냥 배열로 할때는 전쩨 배열로 for문 돌려서 붙어있는 간선인지 까지 비교했지만 유효한 간선만 ArrayList에 입력했기에 제외
					ch[nv] = 1;
					DFS(nv);
					ch[nv] = 0;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		경로탐색_DFS_Array T = new 경로탐색_DFS_Array();
		Scanner kb = new Scanner(System.in);
		n=kb.nextInt();
		m=kb.nextInt();
		graph = new ArrayList<ArrayList<Integer>>();
		for(int i=0; i<=n; i++){
			graph.add(new ArrayList<Integer>());
		}
		ch=new int[n+1];
		for(int i=0; i<m; i++){
			int a=kb.nextInt();
			int b=kb.nextInt();
			graph.get(a).add(b);
		}
		ch[1]=1; // 1에서 시작하니까 1은 방문상태로 
		T.DFS(1);
		System.out.println(answer);
	}
}
