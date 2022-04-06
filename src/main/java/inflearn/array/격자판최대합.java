package inflearn.array;

public class 격자판최대합 {
	public static int solution(int n, int[][] arr) {
		int answer = -1;
		int sum;
		int sum2;
		for (int i = 0; i < n; i++) {
			sum = 0;
			sum2 = 0;
			for (int j = 0; j < n; j++) {
				sum += arr[i][j];
				sum2 += arr[j][i];
			}
			answer = Math.max(answer, sum);
			answer = Math.max(answer, sum2);
		}
		
		sum = 0;
		sum2 = 0;
		for (int i = 0; i < n; i++) {
			sum += arr[i][i];
			sum2 += arr[i][n-i-1];
		}
		
		answer = Math.max(answer, sum);
		answer = Math.max(answer, sum2);
		return answer;
	}
	
	public static void main(String[] args) {
		int[][] arr = {{10,13,10,12,15}, {12,39,30,23,11}, {11,25,50,53,15}, {19,27,29,37,27},{19,13,30,13,19}};
		System.out.println(격자판최대합.solution(5, arr));
	}
}
