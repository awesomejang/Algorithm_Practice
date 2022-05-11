package inflearn.DFS_BFS;

public class 부분집합구하기_DFS {
	static int n;
	static int[] ch;
	public void DFS(int L) {
		//끝에 도달 
		if(L==n+1) {
			String tmp = "";
			for (int i = 1; i <= n; i++) { //0번 index 제외 
				if(ch[i] == 1) tmp += (i+" "); // 1 = 사용
			}
			if(tmp.length()>0) System.out.println(tmp);
		}else {
			ch[L] = 1; // 이진트리의 왼/오 를 사용/비사용으로 
			DFS(L+1);
			ch[L] = 0;
			DFS(L+1);
		}
	}
	public static void main(String[] args){
		부분집합구하기_DFS T = new 부분집합구하기_DFS();
		n=3;
		ch=new int[n+1];
		T.DFS(1);
	}
}
