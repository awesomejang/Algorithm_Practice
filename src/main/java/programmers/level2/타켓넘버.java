package programmers.level2;

public class 타켓넘버 {

	static int count = 0;
    public static void DFS(int sum, int index, int[] numbers, int target) {
		if(index == numbers.length) { // 목표지점까지 돌았다면 
			if(sum == target) count++; // 카운트 상승
		}else {
			DFS(sum + numbers[index], index + 1, numbers, target); // +
			DFS(sum - numbers[index], index + 1, numbers, target); // -
		}
	}
    
    public int solution(int[] numbers, int target) {
        DFS(0, 0, numbers, target);
		int answer = count;
		return answer;
    }
}
