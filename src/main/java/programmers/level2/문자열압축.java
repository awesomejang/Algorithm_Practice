package programmers.level2;

public class 문자열압축 {
	public int solution(String s) {
		int answer = s.length();
        for (int i = 1; i <= s.length()/2; i++) {
			int count = 1;
			String temp = s.substring(0, i); // 초기화
			String answer2 = "";
			for (int j = i; j <= s.length(); j+=i) {
				String next = s.substring(j, (s.length() > j+i) ? j+i : s.length()); // 길이 넘어가면 마지막까지
				if(temp.equals(next)) count++;
				else { // 같지 않으면 현재 텍스트 입력하고 temp 변경
					answer2 += (count >= 2) ? (count + temp) : temp;
					count = 1;
					temp = next; // 마지막껀 안들어간다.
				}
			}
			answer2 += temp;// 마지막 요소는 입력이안되기때문에 여기서 입력처리
			answer = Math.min(answer, answer2.length());
		}
        return answer;
	}
	public static void main(String[] args) {
		
	}
}
