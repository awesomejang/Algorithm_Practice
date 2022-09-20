package programmers.level1;

//https://school.programmers.co.kr/learn/courses/30/lessons/12947
public class 하샤드수 {
	public static boolean solution(int x) {
		boolean answer = true;
		int sum = 0;
		int tmp = x;
		while(tmp > 0) {
			sum += tmp % 10;
			tmp = tmp / 10;
		}
		if(x % sum != 0) return false;
		return answer;
	}
	
	public static void main(String[] args) {
		System.out.println(solution(11));
	}
}
