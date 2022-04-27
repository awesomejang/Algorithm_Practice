package inflearn.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class 뮤직비디오 {
	// m의 cd의 넣을수있는 최소합은? 
	// cd에 데이터가 들어가려면 제일 큰 시간이 최소 시간이 되고 모든 수의 합이 최대시간이된다. 
	
	public int count(int[] arr, int capacity) {
		int cnt = 1, sum = 0;
		for(int x : arr) {
			if(sum+x > capacity) {
				cnt++;
				sum = x; // sum갱신 
			}else {
				sum += x;
			}
		}
		return cnt;
	}
	public int solution(int n, int m, int[] arr) {
		int answer = 0;
		int lt = Arrays.stream(arr).max().getAsInt(); // optional 이라 getAsInt();
		int rt = Arrays.stream(arr).sum(); // 배열의 합계
		while(lt<=rt) {
			int mid = (lt + rt) / 2;
			// 일단 부족하든 말아넣는데 성공했다. = 기준점을 더 줄여봐도 된다. 
			if(count(arr, mid) <= m) {  
				answer = mid;
				rt = mid-1;
			}else { // 실패했다 = 수를 크게 잡아봐야한다. 
				lt = mid+1;
			}
		}
		return answer;
	}
	public static void main(String[] args){
		뮤직비디오 T = new 뮤직비디오();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		int m=kb.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++) arr[i]=kb.nextInt();
		System.out.println(T.solution(n, m, arr));
	}
}
