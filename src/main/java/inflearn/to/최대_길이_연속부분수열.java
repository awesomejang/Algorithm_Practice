package inflearn.to;

public class 최대_길이_연속부분수열 {
	public static int solution(int n, int m, int[] arr) {
		// n = 길이, m = 목표
		int answer = 0, lt = 0, count = 0; 
		int sum = 0; //cnt 
		//rt-lt+1(원소개수)
		for (int rt = 0; rt < n; rt++) {
			if(arr[rt] == 0) {
				sum++;
			}
			while(sum > m) {
				if(arr[lt] == 0) {
					sum--;
				}
				lt++; // arr[lt]가 0인것과 무관하게 lt는 0일때 까지 계속 진행되야하기에 이 위치가 맞다. 
				/**
				 if(arr[lt++] == 0) {
					 sum--;
				 }
				 */
			}
			answer = Math.max(answer, rt-lt+1);
			//if((rt-lt+1) >answer) answer = rt-lt+1; 
		}
		return answer;
	}
	
	public static void main(String[] args) {
		int[] arr = {1, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1};
		System.out.println(최대_길이_연속부분수열.solution(14, 2, arr));
	}
}
