package inflearn.DFS_BFS.practice;

public class 중복X순열 {
	static int n; // 총개수
	static int m; // 뽑을개수
	static int[] pm, ch, arr; //pm = 리턴, ch = 기록, arr = 포맷
	public void DFS(int L) {
		if(L == n) {
			for (int i = 0; i < n; i++) {
				System.out.print(pm[i] + " ");
			}
			System.out.println();
		}else {
			for(int i = 0; i <n; i++) {
				if(ch[i] == 0) { //해당하는 수가 없다.
					ch[i] = 1; // 현재 값 사용으로 상태 변경
					pm[L] = arr[i]; // 현재 값 기록에 넣어준다
					DFS(L+1); // 다음레벨로 던지고
					ch[i] = 0; // 초기화
				}
			}
		}
	}

}
