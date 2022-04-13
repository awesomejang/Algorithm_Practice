package inflearn;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class 문자거리_ {
	/**
	 * 왼쪽부터 t일떄 0으로 초기화 하고 t가 나올때 까지 1씩 증가 시키면 왼쪽에있는 t와의 거리가 측정된다. 
	 * 다시 오른쪽 부터 반복해서 이미 있는 값과 비교하여 더 작은값을 입력하면 최소의 거리가 나온다.
	 * @param s
	 * @param t
	 * @return
	 */
	public static int[] solution(String s, char t) {
		int[] answer = new int [s.length()];
		int p = 10000;
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == t) {
				p = 0;
				answer[i] = p;
			}else {
				answer[i] = ++p;
			}
		}
		
		p = 10000;
		for (int i = s.length() -1; i >= 0; i--) {
			if(s.charAt(i) == t) {
				p = 0;
				answer[i] = p;
			}else {
				p++;
				answer[i] = Math.min(answer[i], p);
			}
		}
		return answer;
	}
	
	public static String solution2(String s, char t) {
		String answer = "";
		List<Integer> arr = new ArrayList<Integer>();
		for (int i = 0; i < s.length(); i++) {
			if(t == s.charAt(i)) {
				arr.add(i);
			}
		}
		
		for (int i = 0; i < s.length(); i++) {
			int tmp = 10000;
			if(s.charAt(i) == t) {
				answer += "0";
				continue;
			}
			
			for (int j = 0; j < arr.size(); j++) {
				int z = (arr.get(j) - i);
				if(tmp > Math.abs(z)) tmp = Math.abs(z);
			}
			answer += String.valueOf(tmp);
		}
		return answer;
	}
}
