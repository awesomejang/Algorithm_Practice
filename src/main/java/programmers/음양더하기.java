package programmers;

public class 음양더하기 {
	public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for(int i=0; i < absolutes.length; i++) {
            if(!signs[i]) absolutes[i] = -(absolutes[i]);
            answer += absolutes[i];
        }
        return answer;
    }
}
