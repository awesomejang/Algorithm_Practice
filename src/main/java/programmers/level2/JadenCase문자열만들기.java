package programmers.level2;

public class JadenCase문자열만들기 {
	public static String solution(String s) {
		String answer = "";
		boolean token = true;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (!Character.isAlphabetic(ch)) {
				token = (ch == ' ') ? true :false;
				answer += ch;
				continue;
			}
			if (token) {
				answer += Character.toUpperCase(ch);
				token = false;
			} else {
				answer += Character.toLowerCase(ch);
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		String answer = solution("3people  unFollowed me");
		System.out.println(answer);
	}
}
