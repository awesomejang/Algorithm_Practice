package inflearn.DFS_BFS;

import java.util.LinkedList;
import java.util.Queue;

public class 송아지찾기 {
	public static int BFS(int s, int t) {
		int L = 0;
		int[] arr = new int[10001];
		int[] moves = {-1,1,5};
		Queue<Integer> Q = new LinkedList<Integer>();
		Q.offer(s);
		arr[s] = 1;
		
		while(!Q.isEmpty()) {
			int len = Q.size();
			for (int i = 0; i < len; i++) {
				int x = Q.poll();
				//if(x == t) return L;
				for (int j = 0; j < moves.length; j++) {
					int nx = x + moves[j];
					if(nx == t) {
						return L+1;
					}
					if((nx>0 && nx< 10000) && arr[nx] == 0) {
						arr[nx] = 1;
						Q.offer(nx);
					}
				}
			}
			L++;
		}
		return 0;
	}
	public static void main(String[] args) {
		System.out.println(송아지찾기.BFS(5, 14));
	}
}
