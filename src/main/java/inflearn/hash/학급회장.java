package inflearn.hash;

import java.util.HashMap;
import java.util.Map;

public class 학급회장 {

	public static String solution(int n, String s) {
		//Map<Char, Integer> map = new HashMap<String, Integer>();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		map.put('A', 0);
		map.put('B', 0);
		map.put('C', 0);
		map.put('D', 0);
		map.put('E', 0);
		char[] ch = {'A', 'B', 'C', 'D', 'E'};
		String answer = " ";
		int pivot = -1;
		//s.toCharArray()
		for (int i = 0; i < s.length(); i++) {
			map.put(s.charAt(i), map.get(s.charAt(i)) +1);
		}
		
		// set 리턴인데 이건되네... 
		for(Character x : map.keySet()) {
			
		}
		for (int i = 0; i < map.size(); i++) {
			if(map.get(ch[i]) > pivot) { 
				pivot = map.get(ch[i]);
				answer = String.valueOf(ch[i]);
			}
		}
		return answer;
	}
	
	public static String solution(int n, String s) {
		char answer = ' '; //공백은된다.
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for(char x : s.toCharArray()) {
			map.put(x, map.getOrDefault(map, null));
		}
		return answer;
	}

	public static void main(String[] args) {
		String s = "BACBACCACCBDEDE";
		System.out.println(학급회장.solution(15, s));
	}
}
