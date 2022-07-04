package programmers.level2;

public class 카펫 {
	public static int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int total = brown + yellow;
        for (int i = 2; i < total; i++) {
        	if((total % i) == 0) {
        		for (int j = i; j > 1; j--) {
        			if((i-2)*(j-2) == yellow) {
						answer[0] = i;
						answer[1] = j;
						return answer;
					}
				}
			}
		}
        return answer;
    }
	
	public static void main(String[] args) {
		카펫.solution(18, 6);
	}
}
