package inflearn.DFS_BFS;

public class 재귀함수 {
	public static void solution(int n) {
		if(n == 0) return; //void 일때 종료 
		else {
			solution(n-1);
			System.out.print(n + " ");
		}
		
		/**
		System.out.println(n);
		if(n != 1) solution(n-1);
		*/
	}
	public static void main(String[] args) {
		재귀함수.solution(3);
	}
}
