package programmers;

public class 시저암호 {
	
	public static String solution2(String s, int n) {
		String answer = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if(ch == ' ') {
				answer += ch;
				continue;
			}
			if(ch>='a' && ch<='z') {
				if(ch + n > 'z') {
					answer += (char)(ch-26+n);
				}else {
					answer += (char)(ch+n);
				}
			}else if(ch >= 'A' && ch <= 'Z') {
				if(ch + n > 'Z') answer += (char)(ch-26+n);
				else answer += (char)(ch+n);
			}
		}
		return answer;
	}
	public static String solution1(String s, int n) {
		 String answer = "";
		 for (int i = 0; i < s.length(); i++) {
			int cnt = 1;
			char target = s.charAt(i);
			
			if(!Character.isAlphabetic(target)) { // 공백일때
				answer += target; 
				continue;
			}
			while(n >= cnt) {
				if(target >= 97 && target <= 122) {
					if(target + 1 > 122) target = (char)(target -26 + 1);
					else target = (char)(target + 1);
				}
				
				if(target >= 65 && target <= 90) {
					if(target + 1 > 90) target = (char)(target -26 + 1);
					else target = (char)(target + 1);
				}
				cnt++;
			}
			answer += target;
		}
		 return answer;
	}
	public static void main(String[] args) {
		String answer =시저암호.solution2("AB", 1);
		System.out.println(answer);
		//char a = 'a';
		//int ann = a + 1;
		//a = 'z' -26 + 1;
		System.out.println('b' > 'c');
	}
}
