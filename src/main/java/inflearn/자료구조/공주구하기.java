package inflearn.자료구조;

import java.util.LinkedList;
import java.util.Queue;

public class 공주구하기 {

	public static int solution(int n, int k) {
		int answer = 0;
		Queue<Integer> Q = new LinkedList<>();
		for (int i = 1; i <= n; i++) Q.offer(i); //초기화
		
		while (!Q.isEmpty()) {
			for (int i = 1; i < k; i++)
				Q.offer(Q.poll());
			Q.poll();
			if (Q.size() == 1)
				answer = Q.poll();
		}
		return answer;
	}

	public static int solution2(int n, int m) {
		int answer = 0;
		int count = 0;
		Queue<Integer> queue = new LinkedList<Integer>();
		// 초기화
		for (int i = 1; i <= n; i++) {
			queue.add(i);
		}

		while (queue.size() != 1) {
			count++;
			int tmp = queue.poll();
			if (count == m)
				count = 0;
			else
				queue.add(tmp);
		}
		return answer = queue.peek();
	}

	public static void main(String[] args) {
		System.out.println(공주구하기.solution(8, 3));
	}
}
