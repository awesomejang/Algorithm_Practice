package programmers;

public class 약수의개수와덧셈 {
	
	public static boolean check(int n) {
		int count = 0;
		boolean result = false;
		for (int i = 1; i <= n; i++) {
			if((n % i) == 0) count++;
		}
		if((count % 2) == 0) result = true; 
		return result;
	}

	public static int solution(int left, int right) {
		int answer = 0;
		for (int i = left; i <= right; i++) {
			if(check(i)) {
				answer += i;
			}else {
				answer -= i;
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		System.out.println(약수의개수와덧셈.solution(24, 27));
		
	}
}
