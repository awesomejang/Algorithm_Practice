package backjun.arr;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

//https://www.acmicpc.net/problem/25305
public class 커트라인 {
	
	public static void solution(int n, Integer[] arr) {
		Arrays.sort(arr, Collections.reverseOrder());
		System.out.println(arr[n-1]);
		
	}
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int k = kb.nextInt();
		int n = kb.nextInt();
		Integer[] arr = new Integer[k];
		for (int i = 0; i < k; i++) {
			arr[i] = kb.nextInt();
		}
		solution(n, arr);
	}
}
