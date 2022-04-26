package inflearn.sorting;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class 중복확인 {
	// 정렬사용
	public static String solution1(int n, int[] arr) {
		Arrays.sort(arr);
		String answer = "U";
		for (int i = 0; i < n-1; i++) {
			if(arr[i] == arr[i+1]) return "D";
		}
		return answer;
	}
	
	//Map 사용
	public static String solution2(int n, int[] arr) {
		String answer = "U";
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
			if(map.get(arr[i]) > 1) return "D";
		}
		return answer;
	}
	
	public static void main(String[] args) {
		int[] arr = {20,25,52,30,39,33,43,33};
		System.out.println(중복확인.solution1(8, arr));
	}
}
