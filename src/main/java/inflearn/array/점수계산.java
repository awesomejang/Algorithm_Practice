package inflearn.array;

import java.util.Iterator;

public class 점수계산 {
	public static int solution(int n, int[] arr) {
		int pivot = 0;
		int sum = 0;
		for (int i = 0; i < n; i++) {
			if(arr[i] == 1) {
				pivot++;
				sum += pivot;
			}else {
				pivot = 0;
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int[] arr = {1, 0, 1, 1, 1,0, 0, 1, 1, 0};
		System.out.println(점수계산.solution(10, arr));
	}
}
