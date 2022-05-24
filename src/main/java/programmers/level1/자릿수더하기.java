package programmers.level1;

public class 자릿수더하기 {
	public static int solution(int n) {
        int answer = 0;
        String str = String.valueOf(n);
        for (int i = 0; i < str.length(); i++) {
			answer += str.charAt(i) - 48;
		}
        return answer;
    }
	
	public static int solution2(int n) {
        int answer = 0;
        while(n > 0) {
        	answer += n%10;
        	n /= 10;
        }
        return answer;
    }
	public static void main(String[] args) {
		int answer = 자릿수더하기.solution2(987);
		System.out.println(answer);
	}
}
