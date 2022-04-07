package inflearn.to;

import java.util.ArrayList;
import java.util.List;

public class 두배열합치기 {
	public static void solution(int n, int[] arr, int m, int[] arr2) {
		// index를 각 배열마다 지정하여
		// 두 배열의 수를 비교하여 작은쪽을 출력하고 피벗을 증가시킨다. 
		// 하나라도 배열의 연산이 끝날때 까지 수행하고 
		List<Integer> list = new ArrayList<Integer>();
		int p1 = 0, p2 = 0;
		while(p1 < n && p2 < m) {
			if(arr[p1] < arr2[p2]) list.add(arr[p1++]);
			else list.add(arr2[p2++]);
		}
		// 남아있는 배열의 값을 처리하기 위해 각각 반복문을 한 번더 실행한다.
		while(p1 < n) list.add(arr[p1++]);
		while(p2 < m) list.add(arr2[p2++]);
		
	}

}
