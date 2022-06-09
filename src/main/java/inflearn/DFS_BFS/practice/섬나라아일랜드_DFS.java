package inflearn.DFS_BFS.practice;

import java.util.Scanner;

public class 섬나라아일랜드_DFS {
	static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1}; // 8개 방향 
	static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1}; // 8개 방향
	static int[][] board;
	static int n; // N*N의 배열
	static int count = 0; // 섬의 개수 
	// 0 == 바다, 1 == 섬
	public void DFS(int x, int y) { 
		for (int i = 0; i < dx.length; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			if(nx >= 0 && nx < n && ny >= 0 && ny < n && board[nx][ny] == 1) {
				board[nx][ny] = 0; // 방문으로 처리 
				DFS(nx, ny);
			}
		}
	}
	
	public static void main(String[] args) {
		섬나라아일랜드_DFS T = new 섬나라아일랜드_DFS();
		Scanner kb = new Scanner(System.in);
		
		n = kb.nextInt();
		board = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				board[i][j] = kb.nextInt();
			}
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(board[i][j] == 1) {
					count++; // 1 발견
					T.DFS(i, j);
				}
			}
		}
		System.out.println(count);
	}
}
