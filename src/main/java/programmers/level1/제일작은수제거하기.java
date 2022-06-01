package programmers.level1;

import java.util.Arrays;

public class 제일작은수제거하기 {
	
	public static int[] solution(int[] arr) {
		
		int[] answer;
		if(arr.length == 1) {
			answer = new int[1];
			answer[0] = -1;
			return answer;
		}else {
			int tmp = Integer.MAX_VALUE;
			for (int i = 0; i < arr.length; i++) {
				if(tmp > arr[i])  {
					tmp = arr[i];
				}
			}
			answer = new int[arr.length-1];
			int len = 0;
			for (int i = 0; i < arr.length; i++) {
				if(arr[i] == tmp) { 
					continue;
				}else {
					answer[len++] = arr[i];
				}
			}
			return answer;
		}
		
    }
	public static void main(String[] args) {
		int[] arr = {4,1,2,3};
		int[] answer = 제일작은수제거하기.solution(arr);
		for(int i : answer) {
			System.out.print(i);
		}
	}
}
