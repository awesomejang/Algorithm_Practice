package programmers.level1;

public class 짝수와홀수 {
	public static String solution(int num) {
		int number = Math.abs(num);
		if(number < 1 || number % 2 ==0) {
			return "Even";
		}else {
			return "Odd";
		}
    }
	public static void main(String[] args) {
		System.out.println(짝수와홀수.solution(0));
	}
}
