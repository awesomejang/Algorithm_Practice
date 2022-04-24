package inflearn.sorting;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LRU {
	public static List<Integer> arr(int n, int m, int[] arr) {
		List<Integer> answer = new ArrayList<Integer>();
		//int[] answer = new int[n];
		for (int i = 0; i < n; i++) {
			answer.add(arr[i]);
		}
		//answer.indexOf(answer)
		for (int j = n; j < m; j++) {
			if(answer.contains(arr[j])) {
				int index = answer.indexOf(arr[j]); //있던 자리
				int pivot = answer.get(0);
				answer.add(0, arr[j]);
				answer.add(index, pivot);
			}
		}
		return answer;
		
	}
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 2, 6, 2, 3, 5, 7};
		List<Integer> ans =  LRU.arr(5, 9, arr);
		for(int i : ans) {
			System.out.println(i);
		}
	}
}

