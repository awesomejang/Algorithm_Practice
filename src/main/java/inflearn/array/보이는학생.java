package inflearn.array;

public class 보이는학생 {
	public static int solution(int n, int[] arr) {
		// 내앞보다 커야 보인다. 
		int answer = 1;
		int max = arr[0]; //0번째로 초기화
		for (int i = 1; i < arr.length; i++) {
			if(arr[i] > max) {
				answer++;
				max = arr[i];
			} 
		}
		return answer;
	}
	public static void main(String[] args) {
		int[] arr = {130, 135, 148, 145, 150, 150, 153};
		int result = 보이는학생.solution(8, arr);
		System.out.println(result);
	}
}
