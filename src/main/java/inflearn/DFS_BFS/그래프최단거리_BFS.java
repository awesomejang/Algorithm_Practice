package inflearn.DFS_BFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 그래프최단거리_BFS {
	static int n, m, answer = 0; // n = 노드수 m = 간선수
	static ArrayList<ArrayList<Integer>> graph; // 어떻게 보면 노드가 될수있겠다.
	static int[] ch, dis; // ch = 방문노드 체크 dis = 리턴배열? 
	
	public void BFS(int v) {
		Queue<Integer> queue = new LinkedList<Integer>();
		ch[1] = 1;
		dis[v] = 0;
		queue.offer(v);
		while(!queue.isEmpty()) {
			int cv = queue.poll();
			for(int nv : graph.get(cv)) {
				if(ch[nv] ==0) {
					ch[nv] = 1;
					queue.offer(nv);
					dis[nv] = dis[cv] + 1;
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
