package inflearn.to;

public class 최대매출 {
	// n일간 매출기록, k = k일간의 연속매출, arr = 매출 array
	// k일간의 최대매출기록은? 
	public static int solution(int n, int k, int[] arr) {
		int answer = 0;
		int tmp = -1;
		for (int i = 0; i < n; i++) {
			if((n-1) < k) break;
			int pivot = 0;
			for(int j=i; j <=i+2; j++) {
				pivot += arr[j];
			}
			if(pivot > tmp) tmp = pivot;
		}
		return tmp;
	}
	
	public static int solution2(int n, int k, int[] arr) {
		int answer = 0;
		int sum = 0;
		//초기화
		for(int i=0; i<k; i++) {
			sum += arr[i];
		}
		answer = sum;
		for(int j=k; j<n; j++) {
			// 맨앞에서 하나씩 빼면서[j-k] 제일 큰 합을 구한다.
			sum += (arr[j] - arr[j-k]);
			answer = Math.max(answer, sum);
		}
		return answer;
	}
}
