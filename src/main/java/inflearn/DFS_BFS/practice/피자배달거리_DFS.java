package inflearn.DFS_BFS.practice;

import java.util.ArrayList;
import java.util.Scanner;

// 1= 집, 2 = 피자집
// 피자집을 조합하여 돌린다.
// 피자 배달 거리는 (1,2), (2,3) ->  |1-2| + |2-3|
public class 피자배달거리_DFS {
	static int n, m, len, answer = Integer.MAX_VALUE; // n = 격자크기, m = 뽑을 피자가게 개수, len = pz.size()
	static int[] combi;
	static ArrayList<Point> pz, hs;
	
	public void DFS(int L, int s) {
		if(L == m) { // 피자집 조합완성
			int sum = 0;
			for(Point h : hs) { // 최소값을 구해서 
				// for문 돌면서 가장 최소의 값을 찾아야한다. 
				int dis = Integer.MAX_VALUE;
				for(int i : combi) { // 현재의 피자집 조합을 모두 돌려서 최소값을 구한다. 
					dis = Math.min(dis, Math.abs(h.x - pz.get(i).x) + Math.abs(h.y - pz.get(i).y)); // combi의 인덱스가 조합 자체이기 때문에 해당 인덱스로 List에서 꺼내서 사용한다.
				}
				sum += dis;
			}
			answer = Math.min(answer, sum); // 연산이 끝난후 다른 조합의 최소값과 비교한다.
		}else {
			for (int i = s; i < len; i++) {
				combi[L] = i;
				DFS(L+1, i+1);
			}
		}
	}
	public static void main(String[] args) {
		피자배달거리_DFS T = new 피자배달거리_DFS();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		m = kb.nextInt();
		pz = new ArrayList<Point>();
		hs = new ArrayList<Point>();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				int tmp = kb.nextInt();
				if(tmp == 1) hs.add(new Point(i,j)); // 집의 좌표를 가진 Point 배열
				else if(tmp == 2) pz.add(new Point(i,j)); // 피자집의 좌표를 가진 Point 배열
			}
		}
		len = pz.size();
		combi = new int[m];
		T.DFS(0, 0);
		System.out.println(answer);
	}
}
