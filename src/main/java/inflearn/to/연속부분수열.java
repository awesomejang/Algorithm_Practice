package inflearn.to;

public class 연속부분수열 {
	/**
	 * N개의 수로 이루어진 수열이 주어집니다. 이 수열에서 연속부분수열의 합이 특정숫자 M이 되는 경우가 몇 번 있는지 구하는 프로그램을
	 * 작성하세요. n = 수열의수, m = 목표 arr = 숫자배열
	 */
	public static int solution(int n, int m, int[] arr) {
		int count = 0;
		int answer = 0;
		int low = 0;
		for (int i = 0; i < n; i++) {
			int sum = 0;
			for (int j = i; j < n; j++) {
				if (sum > m) {
					break;
				} else if (sum == m) {
					count++;
					break;
				}
				sum += arr[j];
			}
		}
		return count;
	}

	public static int solution2(int n, int m, int[] arr) {
		int lt = 0;
		int sum = 0;
		int answer = 0;

		// rt를 기준으로 시작 
		for (int rt = 0; rt < n; rt++) {
			sum += arr[rt]; //rt의 배열을 추가하고
			if (sum == m) // 목표와 같으면
				answer++; // return 값을 증가시킨다.
			while (sum >= m) { // m과 같다고해도 빼줘야하기 때문에
				sum -= arr[lt++]; // 빼면서 lt증가
				if (sum == m) // 뻇는데 목표와 같다면
					answer++; // return 값을 증가 시킨다. 
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		int[] arr = {1,2,1,3,1,1,1,2};
		System.out.println(연속부분수열.solution2(8, 6, arr));
	}
}
