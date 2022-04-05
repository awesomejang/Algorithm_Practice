package inflearn.array;

import java.util.Arrays;

public class 등수구하기 {
	public static int[] solution(int n, int[] arr) {
		int[] answer = new int[n]; 
		// 꼭 끝까지 돌아야하는가를 생각해봐야한다.
		for (int i = 0; i < arr.length; i++) {
			int tmp = 1;
			for (int j = 0; j < arr.length; j++) {
				if(arr[j] > arr[i]) tmp++;
			}
			answer[i] = tmp;
		}
 		return answer;
	}
public static void main(String[] args) {
	int n = 5;
	int[] arr = {87, 89, 92, 100, 76};
	int[] re = 등수구하기.solution(5, arr);
	for(int i : re) {
		System.out.println(i);
	}
}
}
