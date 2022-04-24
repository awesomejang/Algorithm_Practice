package inflearn.sorting;

import java.util.Arrays;

public class 선택정렬 {
	/**
	 * 2중 반복문으로 탐색하면서 제일작은 인덱스를 탐색, 변경해준다.
	 * 마지막 인덱스는 어차피 정렬이 되어있는 상태이니 무관하다.
	 * @param n
	 * @param arr
	 * @return
	 */
	public static int[] solution(int n, int[] arr) {
		for (int i = 0; i < n - 1; i++) {
			int idx = i;
			for (int j = i; j < n; j++) {
				if (arr[idx] > arr[j]) {
					idx = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[idx];
			arr[idx] = temp;
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] arr = { 13, 5, 11, 7, 23, 15 };
		int[] answer = 선택정렬.solution(6, arr);
		for (int i : answer) {
			System.out.println(i);
		}
	}
}
