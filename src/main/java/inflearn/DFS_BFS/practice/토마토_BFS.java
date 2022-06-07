package inflearn.DFS_BFS.practice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 토마토_BFS {
	static int[] dx = {-1, 0, 1, 0};
	static int[] dy = {0, 1, 0, -1};
	static int[][] board, dis;
	static int n, m;
	static Queue<Point> Q = new LinkedList<>();
	// 1 == 익은토마토 , -1 == 토마토X, 0 == 안익은 토마토
	// 모든 토마토의 익튼토마토가 최종목표
	public void BFS() {
		while(!Q.isEmpty()) {
			Point tmp = Q.poll();
			for (int i = 0; i < 4; i++) {
				int nx = tmp.x + dx[i]; //(n, m) == (x,y) 
				int ny = tmp.y + dy[i];
				if(nx >= 0 && nx < n && ny >= 0 && ny < m && board[nx][ny] == 0) {
					board[nx][ny] = 1; // 익은토마토화
					Q.offer(new Point(nx, ny));
					dis[nx][ny] = dis[tmp.x][tmp.y] + 1;
				}
			}
		}
	}

	public static void main(String[] args) {
		토마토_BFS T = new 토마토_BFS();
		Scanner kb = new Scanner(System.in);
		m = kb.nextInt();
		n = kb.nextInt();
		board = new int[n][m];
		dis = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				board[i][j] = kb.nextInt();
				if (board[i][j] == 1)
					Q.offer(new Point(i, j));
			}
		}
		T.BFS();
		
		// 0인경우 1. 모든 토마토가 1일때 2. 모두가 익지 못했다.
		int answer = Integer.MIN_VALUE;
		boolean flag = true;
		/**
		 * 최솟값 구하는 방식
		 */
		/**
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if(answer < dis[i][j]) answer = dis[i][j];
			}
		}
		*/
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if(board[i][j] == 0) flag = false; // 모든 토마토 토마토화 실패
			}
		}
		// 0 있다. -> 안익은 토마토 존재
		if(flag) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					answer = Math.max(answer, dis[i][j]);
				}
			}
			System.out.println(answer);
		}else {
			System.out.println(-1);
		}
	}
}
