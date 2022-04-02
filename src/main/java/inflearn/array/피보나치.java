package inflearn.array;

public class 피보나치 {
	public static void solution(int n) {
		int[] answer = new int[n];
		answer[0] =1;
		answer[1] =1;
		for (int i = 2; i < n; i++) {
			answer[i] = answer[i-2] + answer[i-1];
		}
		
		int a = 1, b = 1, c;
		System.out.print(a + " " + b + " ");
		for (int i = 2; i < n; i++) {
			c = a+b;
			System.out.print(c + " ");
			//한칸씩 땡기기
			a = b;
			b = c;
		}
		
		for (int i = 0; i < answer.length; i++) {
			System.out.println(answer[i]);
		}
	}
	public static void main(String[] args) {
		피보나치.solution(5);
	}
}
