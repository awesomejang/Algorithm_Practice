package inflearn.DFS_BFS.practice;

import java.util.Scanner;

public class 미로탐색_DFS {
	// 위, 오른쪽, 아래, 왼쪽
	static int[] dx = {-1, 0, 1, 0}; // x축 X x좌표 (x,y);
	static int[] dy = {0, 1, 0, -1}; // y축 X y좌표 (x,y);
	static int[][] board; // 이동기록
	static int answer = 0;
	
	//판은 7X7
	public void DFS(int x, int y) {
		if(x== 7 && y == 7) {
			answer++;
		}
		else {
			// 안쪽인가, 1=벽,0=통로 // 갔던데가 아닌가?
			for (int i = 0; i < dx.length; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
				//== 1보다 크며 7보다 작다(안쪽이다.) ==// // board[dx][dy] == 0 -> 아직 안갔다.
				if(nx <= 7 && nx >= 1 && ny <= 7 && ny >= 1 && board[nx][ny] == 0) {
					board[nx][ny] = 1; // 들린걸로 표기(못가게)
					DFS(nx, ny);
					board[nx][ny] = 0; // 다시 풀고
				}
			}
		}
	}
	
	public static void main(String[] args){
		미로탐색_DFS T = new 미로탐색_DFS();
		Scanner kb = new Scanner(System.in);
		board=new int[8][8];
		for(int i=1; i<=7; i++){
			for(int j=1; j<=7; j++){
				board[i][j]=kb.nextInt();
			}
		}
		board[1][1]=1;
		T.DFS(1, 1);
		System.out.print(answer);
	}
}
