package inflearn.DFS_BFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 그래프최단거리_BFS {
	static int n, m, answer = 0; // n = 노드수 m = 간선수
	static ArrayList<ArrayList<Integer>> graph; // 어떻게 보면 노드가 될수있겠다.
	static int[] ch, dis; // ch = 방문노드 체크 dis = 리턴배열 
	
	public void BFS(int v) {
		Queue<Integer> queue = new LinkedList<Integer>();
		ch[1] = 1; // 1번에서 출발하기에 
		dis[v] = 0; // 1번 0으로 초기화
		queue.offer(v); // Queue에 입력
		while(!queue.isEmpty()) { 
			int cv = queue.poll();
			for(int nv : graph.get(cv)) { // 해당 노드의 간선 꺼내서
				if(ch[nv] ==0) { // 방문한 노드 방문 X
					ch[nv] = 1; // 방문처리 
					queue.offer(nv); // 다음노드 queue에 입력
					dis[nv] = dis[cv] + 1; // 전 노드에서 한칸 더 온거니 +1 
				}
			}
		}
	}
	

	public static void main(String[] args) {
		그래프최단거리_BFS T = new 그래프최단거리_BFS();
		Scanner kb = new Scanner(System.in);
		n=kb.nextInt();
		m=kb.nextInt();
		graph=new ArrayList<ArrayList<Integer>>();
		for(int i=0; i<=n; i++){
			graph.add(new ArrayList<Integer>());
		}
		ch=new int[n+1];
		dis=new int[n+1];
		for(int i=0; i<m; i++){
			int a=kb.nextInt();
			int b=kb.nextInt();
			graph.get(a).add(b);
		}
		T.BFS(1);
		for(int i=2; i<=n; i++){
			System.out.println(i+" : "+dis[i]);
		}
	}
}
