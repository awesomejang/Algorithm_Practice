package inflearn.DFS_BFS.practice;

import java.util.Scanner;

public class 수열추측하기 {
	// n개의 숫자와 최종숫자가 있을때 수열 곱하기 해서 구한다. 
	static int[] b, p, ch;
	static int n, f;
	boolean flag=false;
	int[][] dy=new int[35][35];
	public int combi(int n, int r){
		if(dy[n][r]>0) return dy[n][r];
		if(n==r || r==0) return 1;
		else return dy[n][r]=combi(n-1, r-1)+combi(n-1, r);
	}

	public void DFS(int L, int sum){
		if(flag) return;
		if(L==n){
			if(sum==f){
				for(int x : p) System.out.print(x+" ");
				flag=true;
			}
		}
		else{
			for(int i=1; i<=n; i++){
				if(ch[i]==0){
					ch[i]=1;
					p[L]=i;
					DFS(L+1, sum+(p[L]*b[L]));
					ch[i]=0;
				}
			}
		}
	}
	public static void main(String[] args) {
		수열추측하기 T = new 수열추측하기();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		f = kb.nextInt();
		b = new int[n];
		p = new int[n];
		ch = new int[n+1]; // 배열의 i번째 인덱스를 썻는지 가 아닌 i자체를 썻는지 확인하고 또 1부터 시작하기 때문에 n+1;
		for (int i = 0; i < n; i++) {
			b[i] = T.combi(n-1, i);
		}
		T.DFS(0, 0);
	}
}
