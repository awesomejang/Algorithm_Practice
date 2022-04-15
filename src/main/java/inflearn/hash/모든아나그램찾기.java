package inflearn.hash;

import java.util.HashMap;
import java.util.Map;

public class 모든아나그램찾기 {
	public static int solution(String n, String m) {
		int answer = 0, lt = 0, i = 0;
		Map<Character, Integer> map = new HashMap<>();
		for (i = 0; i < m.length() -1; i++) { //3
			map.put(n.charAt(i), map.getOrDefault(n.charAt(i), 0) +1);
		}
		
		//4
		for (int rt = m.length() -1; rt < n.length(); rt++) {
			map.put(n.charAt(rt), map.getOrDefault(n.charAt(rt), 0) + 1);
			boolean check = true;
			for(int j = 0; j < m.length(); j++) {
				if(!map.containsKey(m.charAt(j))) {// m이 map에 없으면
					check = false;
					break;
				}
				
			}
			if(check) answer++;
			map.put(n.charAt(lt), map.getOrDefault(n.charAt(lt), 0) - 1);
			if(map.get(n.charAt(lt)) == 0) map.remove(n.charAt(lt));
			lt++;
		}
		
		
		return answer;
	}
	
	public static void main(String[] args) {
		System.out.println(모든아나그램찾기.solution("bacaAacba", "abc"));
	}
}
