package inflearn.sorting;

import java.util.Arrays;

public class 이분검색 {
	
	public int solution(int n, int m, int[] arr){
		int answer = 0;
		Arrays.sort(arr); // 이분검색은 정렬이 필수요건
		int lt = 0, rt = n-1; // 끝과끝을 기준으로 
		while(lt<=rt) { // 이분검색은 결국엔 lt, rt의 위치가 역전된다.
			int mid = (lt + rt) / 2; // 중간값을 기준으로 
			if(arr[mid] == m) {
				answer = arr[mid];
				break;
			}
			if(arr[mid] > m) rt = mid -1; // 중간값보다 찾는값이 더 작다면 rt의 위치를 변경 
			else lt = mid + 1; // 찾는값이 더 크다면 lt의 위치를 변경 
		}
		return answer;
	}

}
