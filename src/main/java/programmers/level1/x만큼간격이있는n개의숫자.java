package programmers.level1;

public class x만큼간격이있는n개의숫자 {
	public static long[] solution(int x, int n) {
        long[] answer = new long[n];
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
			answer[cnt++] = (long)x * i; 
		}
        return answer;
    }
	public static void main(String[] args) {
		long[] ar = x만큼간격이있는n개의숫자.solution(-4, 2);
		for(Long i : ar) {
			System.out.println(i);
		}
	}
}
