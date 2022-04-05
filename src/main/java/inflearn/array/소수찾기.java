package inflearn.array;

public class 소수찾기 {
	private static int solution(int n) {
		int answer = 0;
		int[] arr = new int[n+1];
		for (int i = 2; i <= n; i++) {
			if(arr[i] == 0) { //소수
				answer++;
				for (int j = i; j < arr.length; j += i) { // i의 배수들을 변경(소수가 아닌)
					arr[j] = 1;
				}
			}
		}
		return answer;
	}
}
