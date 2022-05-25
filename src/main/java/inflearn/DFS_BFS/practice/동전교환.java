package inflearn.DFS_BFS.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class 동전교환 {
	static int n;
	static int max;
	static Integer[] arr;
	static int answer = Integer.MAX_VALUE;
	public static void DFS(int L, int sum) {
		if(sum > max) return;
		if(L >= answer) return; // 더 이상 진행할 이유X
		if(sum == max) {
			answer = Math.min(answer, L);
		}else {
			for (int i = 0; i < n; i++) {
				DFS(L+1, sum+arr[i]);
			}
		}
	}
	public static void main(String[] args) {
		n = 3;
		arr = new Integer[n];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 5;
		max = 15;
		Arrays.sort(arr, Collections.reverseOrder()); // 큰수부터 하는게 더 빠르게 찾기 가능
		동전교환.DFS(0, 0);
		System.out.println(answer);
	}
}
