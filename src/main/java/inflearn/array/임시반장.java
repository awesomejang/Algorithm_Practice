package inflearn.array;

public class 임시반장 {
	public static int solution(int n, int[][] arr) {
		// 5학년 고정
		int target = -1;
		int answer = -1;
		for (int i = 0; i < n; i++) {
			int count=0;
			for (int j = 0; j < n; j++) {
				for (int k = 0; k < 5; k++) {
					if(arr[i][k] == arr[j][k]) {
						count++;
						break;
						//한번이라도 라서 같으면 
					}
				}
			}
			if(count > target) { 
				target = count;
				answer = i;
			}
		}
		System.out.println(answer);
		return answer +1;
	}
	public static void main(String[] args) {
		int[][] arr = {{2, 3,1, 7, 3}, {4, 1, 9, 6, 8}, {5, 5, 2, 4, 4}, {6, 5, 2, 6, 7}, {8, 4, 2, 2, 2}};
		임시반장.solution(5, arr);
	}
}
