package inflearn.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

class Lecture {
	public int money;
	public int time;
	
	public Lecture(int money, int time) {
		this.money = money;
		this.time = time;
	}
}
public class 최대수입스케쥴 {
	static int n, max = Integer.MIN_VALUE;
	public int solution(ArrayList<Lecture> arr) {
		int answer = 0;
		PriorityQueue<Integer> pQ = new PriorityQueue<Integer>(Collections.reverseOrder());
		Collections.sort(arr);
		int j = 0;
		for (int i = max; i >= 1; i--) {
			for (; j < n; j++) {
				if()
			}
		}
	}
	public static void main(String[] args) {
		최대수입스케쥴 T = new 최대수입스케쥴();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		List<Lecture> arr = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			int m = kb.nextInt();
			int d = kb.nextInt();
			arr.add(new Lecture(m,d));
			if(d>max) max = d;
		}
		System.out.println(T.solution(arr));
	}
}
