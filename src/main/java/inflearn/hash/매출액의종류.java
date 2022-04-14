package inflearn.hash;

import java.util.HashMap;
import java.util.Map;

public class 매출액의종류 {
	public static void solution(int n, int m, int[] arr) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int lt = 0, rt = 0;
		// 첫 사이클 셋팅
		for (rt = 0; rt < m; rt++) {
			map.put(arr[rt], map.getOrDefault(arr[rt], 0) + 1);
		}
		// rt == m(4)
		System.out.println(map.size()); 

		for (int j = rt; j < n; j++) {
			map.put(arr[j], map.getOrDefault(arr[j], 0) + 1);
			if (map.containsKey(arr[lt])) {
				map.put(arr[lt], map.get(arr[lt]) - 1);
				if (map.get(arr[lt]) == 0) {
					map.remove(arr[lt]);
				}
			} else {
				map.put(arr[lt], map.get(arr[lt]) + 1);
			}
			lt++;
			System.out.println(map.size());
		}
	}

	public static void main(String[] args) {
		int[] arr = { 20, 12, 20, 10, 23, 17, 10 };
		매출액의종류.solution(7, 4, arr);
	}
}
