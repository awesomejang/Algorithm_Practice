package programmers.level1;

import java.util.Iterator;

public class 직사각형_별찍기 {
	
	public static void solution(int n, int m) {
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	
	public static void main(String[] args) {
		solution(5, 3);
	}

}
