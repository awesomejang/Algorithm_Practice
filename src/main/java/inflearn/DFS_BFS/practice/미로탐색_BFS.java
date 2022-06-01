package inflearn.DFS_BFS.practice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


class Point {
	public int x, y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
public class 미로탐색_BFS {
	// 위, 오른쪽, 아래, 왼쪽
	static int[] dx = { -1, 0, 1, 0 }; // x축 X x좌표 (x,y);
	static int[] dy = { 0, 1, 0, -1 }; // y축 X y좌표 (x,y);
	static int[][] board, dis; // 이동기록
	static int answer = Integer.MAX_VALUE;

	// 판은 7X7
	public void BFS(int x, int y) {
		Queue<Point> Q = new LinkedList<Point>();
		Q.offer(new Point(x, y));
		board[1][1] = 1; // 출발
		while(!Q.isEmpty()) {
			Point tmp = Q.poll();
			for (int i = 0; i < dx.length; i++) {
				int nx = tmp.x + dx[i];
				int ny = tmp.y + dy[i];
				if (nx <= 7 && nx >= 1 && ny <= 7 && ny >= 1 && board[nx][ny] == 0) {
					board[nx][ny] = 1;
					Q.offer(new Point(nx, ny));
					dis[nx][ny] = dis[tmp.x][tmp.y] +1;
				}
			}
		}
	}
	public static void main(String[] args) {
		미로탐색_BFS T = new 미로탐색_BFS();
		Scanner kb = new Scanner(System.in);
		board = new int[8][8];
		dis = new int[8][8];
		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= 7; j++) {
				board[i][j] = kb.nextInt();
			}
		}
		T.BFS(1, 1);
		if(dis[7][7] == 0) System.out.println(-1);
		else System.out.println(dis[7][7]);
		
	}
}
