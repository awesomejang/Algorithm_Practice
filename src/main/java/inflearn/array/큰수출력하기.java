package inflearn.array;

public class 큰수출력하기 {
	public static int[] solution(int n, int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] >= n) System.out.print(arr[i] + " ");
		}
		return arr;
	}
	public static void main(String[] args) {
		int n = 6;
		int[] arr = {7, 3, 9, 5, 6, 12};
		큰수출력하기.solution(6, arr);
	}
}
