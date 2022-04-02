package inflearn;

public class 문자열압축 {
	public static String solution(String s) {
		String answer ="";
		// 마지막 요소를 위해 공백을 하나 추가한다. 
		s += " "; //""은 인식안된다. 
		int tmp = 1;
		// 마지막 전 까지 돌리게 위해 -1
		for (int i = 0; i < s.length()-1;  i++) {
			if(s.charAt(i) == s.charAt(i +1)) {
				tmp++;
			}else {
				answer += s.charAt(i);
				if(tmp>1) answer += String.valueOf(tmp);
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		System.out.println(문자열압축.solution("KKHSSSSSSSE"));
	}
}
