package inflearn;

public class 숫자만추출 {
	public static int solution(String s) {
		int answer = 0;
		for(char x : s.toCharArray()) {
			if(x >= '0' && x <= '9') answer = answer * 10 + (x-48); // 그냥 x로 연산하면 48로 연산되기떄문에 48을 뺴줘야한다.
		}
		return answer;
	}
	
	public static int solution2(String s) {
		String answer = "";
		
		for(char x : s.toCharArray()) {
			if(Character.isDigit(x)) answer += x; 
		}
		return Integer.parseInt(answer); // 맨앞0은 parseInt시점에서 제거된다.
	}

}
