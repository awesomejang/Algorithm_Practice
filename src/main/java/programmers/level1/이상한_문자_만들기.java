package programmers.level1;

import java.util.Iterator;

public class 이상한_문자_만들기 {
	public static String solution(String s) {
		String answer = "";
		char[] chars = s.toCharArray();
		int idx = 0;
		for (int i = 0; i < chars.length; i++) {
			idx = chars[i] == ' ' ? 0 : idx + 1;
			answer += (idx % 2) != 0 ? Character.toUpperCase(chars[i]) : Character.toLowerCase(chars[i]);
		}
		/**
        String[] strings = s.split(" ");
        for (int i = 0; i < strings.length; i++) {
        	String str = "";
        	int idx = 0;
        	System.out.println(strings[i]);
			for (int j = 0; j < strings[i].length(); j++) {
				char c = strings[i].charAt(j);
				if(c == ' ') {
					idx = 0;
					continue;
				}
				if((idx % 2) == 0) {
					str += Character.toUpperCase(c);
				}else {
					str +=  Character.toLowerCase(c);
				}
				idx++;
			}
			answer += " " + str;
		}
		*/
        return answer;
    }
	
	public static void main(String[] args) {
		String s = "try hello world";
		/*
		 * while(s.indexOf(" ") != -1) { System.out.println(s.indexOf(" "));
		 * System.out.println(s.subs); }
		 */
		System.out.println(solution(s));
	}
}
