package inflearn.DFS_BFS.practice;

public class 중복순열 {
	static int[] pm; // 최대값의 크기만큼 초기화 하여 각 레벨의 데이터를 입력한다.
	static int n;
	static int m;
	public static void DFS(int L) {
		if(L == m) { // 뽑을수있는 최대레벨까지 왔을때 배열의 데이터를 출력한다.
			for(int x : pm) System.out.print(x +" ");
			System.out.println();
		}else {
			for (int i = 1; i <= n; i++) { // 뻗어야하는 갈래만큼 반복
				pm[L] = i; // 레벨의 데이터를 입력한다.
				DFS(L+1);
			}
		}
	}
	public static void main(String[] args) {
		n = 3;
		m = 2;
		pm = new int[m];
		중복순열.DFS(0);
	}
}
