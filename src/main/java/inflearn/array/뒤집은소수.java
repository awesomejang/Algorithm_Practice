package inflearn.array;

import java.util.ArrayList;
import java.util.List;

public class 뒤집은소수 {
	
	private static boolean isPrime(int num) {
		if(num == 1) return false; //소수아님
		for (int i = 2; i < num; i++) {
			if(num % 2 == 0) return false;
		}
		return true;
	}
	private static ArrayList<Integer> solution(int n, int[] arr) {
		ArrayList<Integer> answer = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			int tmp = arr[i];
			int res = 0;
			while(tmp > 0) {
				int t = tmp % 10; // 무조건 1의자리 
				res = res * 10 + t;
				tmp = tmp / 10;
			}
			if(isPrime(res)) answer.add(res);
		}
		return answer;
	}
}
