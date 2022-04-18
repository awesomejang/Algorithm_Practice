package inflearn.hash;

import java.util.HashMap;
import java.util.Map;

public class 모든아나그램찾기 {
	public static int solution(String n, String m) {
		int answer = 0, lt = 0, i = 0;
		Map<Character, Integer> map = new HashMap<>();
		for (i = 0; i < m.length() - 1; i++) { // 3
			map.put(n.charAt(i), map.getOrDefault(n.charAt(i), 0) + 1);
		}

		for (int rt = m.length() - 1; rt < n.length(); rt++) {
			map.put(n.charAt(rt), map.getOrDefault(n.charAt(rt), 0) + 1);
			boolean check = true;
			for (int j = 0; j < m.length(); j++) {
				if (!map.containsKey(m.charAt(j))) {// m이 map에 없으면
					check = false;
					break;
				}
			}
			if (check)
				answer++;
			map.put(n.charAt(lt), map.getOrDefault(n.charAt(lt), 0) - 1);
			if (map.get(n.charAt(lt)) == 0)
				map.remove(n.charAt(lt));
			lt++;
		}
		return answer;
	}

	public int solution2(String a, String b) {
		int answer = 0;
		HashMap<Character, Integer> am = new HashMap<>();
		HashMap<Character, Integer> bm = new HashMap<>();
		for (char x : b.toCharArray())
			bm.put(x, bm.getOrDefault(x, 0) + 1);
		int L = b.length() - 1;
		for (int i = 0; i < L; i++)
			am.put(a.charAt(i), am.getOrDefault(a.charAt(i), 0) + 1);
		int lt = 0;
		for (int rt = L; rt < a.length(); rt++) {
			am.put(a.charAt(rt), am.getOrDefault(a.charAt(rt), 0) + 1);
			if (am.equals(bm)) // key랑 value까지 비교
				answer++;
			am.put(a.charAt(lt), am.get(a.charAt(lt)) - 1);
			if (am.get(a.charAt(lt)) == 0)
				am.remove(a.charAt(lt));
			lt++;
		}
		return answer;
	}

	public static void main(String[] args) {
		System.out.println(모든아나그램찾기.solution("bacaAacba", "abc"));
	}
}
