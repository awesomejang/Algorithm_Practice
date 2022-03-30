package inflearn;

public class 팰린드롬_replaceAll {
	public static String solution(String s) {
		String answer = "NO";
		s = s.toUpperCase().replaceAll("[^A-Z]", ""); //^(부정) -> 알파벳이 아닌 것들을 제거
		String temp = new StringBuilder(s).reverse().toString();
		if(s.equals(temp)) return "YES";
		return answer;
	}
}
