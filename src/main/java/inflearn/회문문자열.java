package inflearn;

public class 회문문자열 {
	public static String solution(String str) {
		String answer = "YES";
		str = str.toUpperCase();
		for (int i = 0; i < str.length()/2; i++) {
			if(str.charAt(i) != str.charAt(str.length() -i-1)) return "NO";
		}
		return answer;
	}
	
	public static String solution2(String str) {
		String answer = "NO";
		String tmp = new StringBuilder(str).reverse().toString();
		if(str.equalsIgnoreCase(tmp)) return "YES"; //대소문자 구분 X
		return answer;
	}
}
