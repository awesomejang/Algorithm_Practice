package programmers.level1;

public class 자연수뒤집어배열로만들기 {
	public static int[] solution(long n) {
		String str = String.valueOf(n);
        int[] answer = new int[str.length()];
        int i = 0;
        while(n > 0) {
        	answer[i] = (int)(n%10);
        	n /= 10;
        	i++;
        }
        return answer;
    }
	
	public static void main(String[] args) {
		int[] answer = 자연수뒤집어배열로만들기.solution(12345);
		for(int i : answer) {
			System.out.println(i);
		}
	}
}
