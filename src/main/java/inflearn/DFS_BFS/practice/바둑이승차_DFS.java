package inflearn.DFS_BFS.practice;

public class 바둑이승차_DFS {
	static int answer = Integer.MIN_VALUE;
	static int max = 259;
	static int n; 
	static int tmp = 0;
	public static void DFS(int L, int sum, int[] arr) {
		if(sum > max) return; // 최대값보다 커지면 return 떄려버림
		if(L == n) { // 끝단에 도착
			answer = Math.max(answer, sum);
		}else {
			// sum을 파라미터로 받기 때문에 빼주는 작업이 필요없다. 
			DFS(L+1, sum+arr[L], arr); 
			DFS(L+1, sum, arr);
		}
	}
	public static void main(String[] args) {
		n = 5; 
		int[] arr = new int[n]; // 배열
		arr[0] = 81;
		arr[1] = 58;
		arr[2] = 42;
		arr[3] = 33;
		arr[4] = 61;
		바둑이승차_DFS.DFS(0, 0, arr);
		System.out.println(answer);
	}
}
