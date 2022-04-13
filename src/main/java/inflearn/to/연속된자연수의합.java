package inflearn.to;

public class 연속된자연수의합 {
	/**
	 * N입력으로 양의 정수 N이 입력되면 2개 이상의 연속된 자연수의 합으로 정수 N을 표현하는 방법의 가짓수를 출력하는 프로그램을 작성하세요.
	 * n = 목표점수
	 * @return
	 */
	public static int solution(int n) {
		int answer = 0, sum=0, lt = 0;
		//int target = n - (n/2); 아래와 동일
		int target = n/2+1; // 연속된 수의 합이기 떄문에 목표 숫자의 절반에 해당하는 수를 넘어가면 의미가 없어진다.
		int[] arr = new int[target];
		for(int i=0; i<target; i++) arr[i] = i+1;
		
		for (int rt=0; rt < target; rt++) {
			sum += arr[rt];
			if(sum == n) answer++;
			while(sum >= n) {
				sum -= arr[lt++];
				if(sum == n) answer++;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		System.out.println(연속된자연수의합.solution(15));
	}
}
