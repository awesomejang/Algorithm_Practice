package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 문자열내마음대로정렬하기 {
	
	public static String[] solution2(String[] strings, int n) {
		String[] answer = new String[strings.length];
		List<String> list = new ArrayList<String>();
		
		for (int i = 0; i < strings.length; i++) {
			list.add(strings[i].charAt(n) + strings[i]);
		}
		
		Collections.sort(list);
		
		for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i).substring(1); 
		}
		
		return answer;
	}
	public static String[] solution(String[] strings, int n) {
		// 아씹 
		Arrays.sort(strings); 

		
		String[] answer = new String[strings.length];
		for(int i = 0; i < strings.length; i++) {
			answer[i] = strings[i].substring(n, n+1);  
		}
		
		Arrays.sort(answer);
		List<String> list = new ArrayList<>(Arrays.asList(strings));
		
		for(int i = 0; i < answer.length; i++) {
			for(int j = 0; j < list.size(); j++) {
				if(list.get(j).substring(n, n+1).equals(answer[i])) {
					answer[i] = list.get(j); 
					list.remove(list.get(j)); 
					break; 
				} 
			}
		}
        return answer;
	}
	
	public static void main(String[] args) {
		String[] strings = {"sun", "bed", "car"};
		String[] string = {"abce", "abcd", "cdx"};
		String[] an = 문자열내마음대로정렬하기.solution2(strings, 1);
		for(String i : an) {
			System.out.println(i);
		}
		
	}
}
