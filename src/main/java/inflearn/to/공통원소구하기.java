package inflearn.to;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 공통원소구하기 {
	public static void solution(int n, int[] arr, int m, int[] arr2) {
		List<Integer> list = new ArrayList<Integer>();
		Arrays.sort(arr);
		Arrays.sort(arr2);
		
		int p1 = 0, p2 = 0;
		while(p1 < n && p2 < m) {
			//System.out.println("p1 = " + p1 + " " + "p2 = "+p2);
			if(arr[p1] == arr2[p2]) {
				list.add(arr[p1]);
				p1++;
				p2++;
			}else if(arr[p1] < arr2[p2]) {
				p1++;
			}else p2++;
		}
		for(int i : list) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		int n = 5;
		int m = 5;
		int[] arr = {1,3,9,5,2};
		int[] arr2 = {3,2,5,7,8};
		공통원소구하기.solution(n, arr, m, arr2);
	}
}
