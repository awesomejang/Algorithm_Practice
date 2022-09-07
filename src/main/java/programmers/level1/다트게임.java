package programmers.level1;

import java.util.HashMap;
import java.util.Map;


public class 다트게임 {
	public static int solution(String dartResult) {
		int answer = 0;
		int gameCount = 3;
		int cnt = 0;
		int[] result = new int[gameCount+1];
		Map<Character, Integer> bonus = new HashMap<Character, Integer>();
		bonus.put('S', 1);
		bonus.put('D', 2);
		bonus.put('T', 3);
		Map<Character, Integer> options = new HashMap<Character, Integer>();
		options.put('*', 2);
		options.put('#', -1);
		
		for (int i = 0; i < dartResult.length(); i++) {
			if(Character.isDigit(dartResult.charAt(i))) {
				if(dartResult.charAt(i) == '1' && Character.isDigit(dartResult.charAt(i+1))) {
					result[++cnt] = 10;
					i++;
				}else {
					result[++cnt] = (dartResult.charAt(i) - '0');
				}
				continue;
			}
			
			if(Character.isAlphabetic(dartResult.charAt(i))) {
				int bounsPoint = bonus.get(dartResult.charAt(i));
				int pivot = result[cnt];
				for (int j = 1; j < bounsPoint; j++) {
					result[cnt] *= pivot;
				}
				continue;
			}else {
				int option = options.get(dartResult.charAt(i));
				if(dartResult.charAt(i) == '*') {
					int optionCount = 0;
					while(optionCount <= 1) {
						result[cnt - optionCount] *= option;
						optionCount++;
					}
				}else {
					result[cnt] *= option;
				}
			}
		}
		for (int j = 1; j < result.length; j++) {
			answer += result[j];
		}
		return answer;
	}
	public static void main(String[] args) {
		System.out.println(solution("1D2S#10S"));
		char c = '1';
		char c2 = '0';
		//System.out.println(Character);
		
	}
}


