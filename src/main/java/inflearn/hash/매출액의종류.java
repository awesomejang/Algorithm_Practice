package inflearn.hash;

import java.util.ArrayList;
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

	public ArrayList<Integer> solution2(int n, int k, int[] arr) {
		ArrayList<Integer> answer = new ArrayList<>();
		HashMap<Integer, Integer> HM = new HashMap<>();
		for (int i = 0; i < k - 1; i++) {
			HM.put(arr[i], HM.getOrDefault(arr[i], 0) + 1);
		}
		int lt = 0;
		for (int rt = k - 1; rt < n; rt++) {
			HM.put(arr[rt], HM.getOrDefault(arr[rt], 0) + 1);
			answer.add(HM.size());
			HM.put(arr[lt], HM.get(arr[lt]) - 1);
			if (HM.get(arr[lt]) == 0)
				HM.remove(arr[lt]);
			lt++;
		}
		return answer;
	}

	public static void main(String[] args) {
		int[] arr = { 20, 12, 20, 10, 23, 17, 10 };
		매출액의종류.solution(7, 4, arr);
	}
}
