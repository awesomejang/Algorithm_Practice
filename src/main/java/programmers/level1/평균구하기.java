package programmers.level1;

public class 평균구하기 {
	public static double solution(int[] arr) {
        double answer = 0;
        int count = arr.length;
        for(int i : arr) {
        	answer += i;
        }
        return answer / count;
    }
	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		System.out.println(평균구하기.solution(arr));
	}
}
