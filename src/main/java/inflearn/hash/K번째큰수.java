package inflearn.hash;

import java.util.Collections;
import java.util.TreeSet;

public class K번째큰수 {
	public int solution(int[] arr, int n, int k) {
		int answer = -1;
		TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder()); //내림차순
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				for (int l = j + 1; l < n; l++) {
					Tset.add(arr[i] + arr[j] + arr[l]);
				}
			}
		}
		int cnt = 0;
		// Tset.remove(143);
		// System.out.println(Tset.size());
		// System.out.println("first : "+ Tset.first());
		// System.out.println("last : "+ Tset.last());

		for (int x : Tset) {
			// System.out.println(x);
			cnt++;
			if (cnt == k)
				return x;
		}
		return answer;
	}
}
