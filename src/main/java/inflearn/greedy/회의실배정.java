package inflearn.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Time implements Comparable<Time>{
	int s;
	int e;
	
	public Time(int s, int e) {
		this.s = s;
		this.e = e;
	}

	@Override
	public int compareTo(Time o) {
		// 끝나는 시간이 같으면 x로 오름차순 
		if(this.e == o.e) return this.s - o.s;
		else return this.e - o.e;
	}
}
public class 회의실배정 {
	// 끝나는 시간이 같으면 시작시간 기준으로 아니면 끝나는 시간 기준으로 정렬하고
	// 끝시간이 전타임 끝시간에 비교하여 시작시간이 같거나 크면 count 증가
	public int Solution(List<Time> arr, int n) {
		int cnt = 0;
		Collections.sort(arr);
		int et = 0;
		for(Time ob : arr) {
			if(ob.s>= et) { 
				cnt++;
				et = ob.e;
			}
		}
		return cnt;
	}
	public static void main(String[] args) {
		회의실배정 T = new 회의실배정();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		List<Time> arr = new ArrayList<Time>();
		for (int i = 0; i < n; i++) {
			int x = kb.nextInt();
			int y = kb.nextInt();
			arr.add(new Time(x,y));
		}
		int cnt = T.Solution(arr, n);
		System.out.println(cnt);
	}
}
