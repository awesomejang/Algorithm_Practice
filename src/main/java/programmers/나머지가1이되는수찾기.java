package programmers;

public class 나머지가1이되는수찾기 {
	public static int solution(int n) {
		int answer = 0;
		int tmp = n-1;
		if((tmp%2) == 0) { 
			while((tmp%2) == 0) {                                                                                                                                                                                                                                                                                                                                                                 
				tmp = tmp / 2;
			}
			return tmp;
		}
		else if((tmp%3) == 0) { 
			while((tmp%3) == 0) {
				tmp = tmp /3;
			}
			return tmp;
		}
		else return answer;
	}
	
	
	public static void main(String[] args) {
		int n = 나머지가1이되는수찾기.solution(1000000);
		int tmp2 = 99;
		while((tmp2 % 3) == 0) {
			tmp2 = tmp2 /3;
		}
		System.out.println(나머지가1이되는수찾기.solution(10)); //99
	}
}
