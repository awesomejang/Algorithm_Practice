package programmers;

public class 없는숫자더하기 {
	public int solution(int[] numbers) {
        int number = 45;
        for(int i : numbers) {
            number -= i;
        }
        int answer = number;
        return answer;
    }
}
