package inflearn.array;

import java.util.Iterator;

public class 멘토링 {
	public static int solution(int n, int m, int[][] arr) {
		int answer = 0;
		// 학생 번호를 그대로 사용하기 위해서 1부터 
		for (int i = 1; i <= n; i++) { // 멘토 
			for (int j = 1; j <= n; j++) { // 멘티
				int cnt = 0;
				for(int k = 0; k < m; k++) {
					int p1 = 0; int p2 = 0;
					for(int s = 0; s < n; s++) {
						if(arr[k][s] == i) p1 = s;
						if(arr[k][s] == j) p2 = s;
					}
					// 멘토가 멘티보다 앞에있다. 
					if(p1 > p2) cnt++;
				}
				// 시험횟수 전부 다 앞에있었다. 
				if(cnt == m) {
					answer++;
				}
			}
		}
		return answer;
	}
}
