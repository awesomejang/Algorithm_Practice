package inflearn.DFS_BFS.practice;

public class 최대점수구하기_DFS {
	static int max;
	static int n;
	static int answer = Integer.MIN_VALUE;
	public static void DFS(int L, int pointSum, int timeSum, int[] pointArr, int[] timeArr) {
		if(timeSum > max) return;
		if(L == n) {
			answer = Math.max(pointSum, answer);
		}else {
			DFS(L+1, pointSum+pointArr[L], timeSum+timeArr[L], pointArr, timeArr);
			DFS(L+1, pointSum, timeSum, pointArr, timeArr);
		}
	}
}
