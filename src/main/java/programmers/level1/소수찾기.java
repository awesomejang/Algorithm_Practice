package programmers.level1;

public class 소수찾기 {
	public static int solution(int n) {
		int[] arr = new int[n+1];
		int answer = 0;
		for (int i = 2; i <= n; i++) {
			if(arr[i] == 0) {
				answer++;
				for (int j = i; j <=n; j =j +i) {
					arr[j] = 1; // j=j+i(j의 배수) 
				}
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		int n = 5; // ex) 자연수 N을 5로 설정
		int[] arr = new int[n+1];
		int answer = 0;
		for (int i = 2; i <= n; i++) {
			if(arr[i] == 0) {
				answer++;
				for (int j = i; j <=n; j =j +i) {
					arr[j] = 1; // j=j+i(j의 배수) 
				}
			}
		}
		System.out.println(answer);
	}
}
