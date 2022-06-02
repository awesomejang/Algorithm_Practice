package inflearn.to;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 두 배열의 공통원소를 구하라
public class 공통원소구하기 {
	public static void solution(int n, int[] arr, int m, int[] arr2) {
		// n = arr 배열의 길이
		// arr = 대상배열
		// m = arr2 배열의 길이
		// arr2 = 대상배열
		List<Integer> list = new ArrayList<Integer>();
		Arrays.sort(arr);
		Arrays.sort(arr2);
		
		int p1 = 0, p2 = 0; // 두개의 포인터 생성
		while(p1 < n && p2 < m) { // 두 배열의 끝까지 수행
			if(arr[p1] == arr2[p2]) { // 공통원소가 발견되면
				list.add(arr[p1]); // list에 추가하고
				p1++; // 두 포인터 상승
				p2++;
			}else if(arr[p1] < arr2[p2]) { // 두 데이터가 맞지 않을 경우 배열을 정렬했기때문에 비교하여 작은쪽의 포인터를 상승시킨다. 
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
