package programmers.level1;

public class 아이디추천 {

	public static String solution(String new_id) {
		//1단계
		String step1 = new_id.toLowerCase();
		//2단계
		StringBuffer sb = new StringBuffer();
		String str = "-_.";
		for (int i = 0; i < step1.length(); i++) {
			char ch = step1.charAt(i);
			if(!Character.isAlphabetic(ch) && !Character.isDigit(ch) && !str.contains(String.valueOf(ch))) continue;
			sb.append(ch);
		}
		
		//3단계
		String step3 = sb.toString();
		while(step3.contains("..")) {
			step3 = step3.replace("..", ".");
		}
		
		//4단계
		String step4 = step3;
		if(step4.charAt(0) == '.') {
			step4 = step4.substring(1);
		}
		
		if(!step4.isEmpty() && step4.charAt(step4.length()-1) == '.') {
			step4 = step4.substring(0, step4.length()-1);
		}
		
	
		// 5단계
		String step5 = step4;
		if(step5.isEmpty()) step5 = "a";
		
		// 6단계
		String step6 = step5;
		if(step6.length() > 15) {
			step6 = step6.substring(0, 15);
			if(step6.lastIndexOf(".") == step6.length()-1) step6 = step6.substring(0, step6.length()-1);
		}
		//7단계
		String step7 = step6;
		while(step7.length() < 3) {
			step7 += step7.charAt(step7.length()-1);
		}
		
		return step7;
	}

	public static void main(String[] args) {
		String s = "=.=";
		System.out.println(아이디추천.solution(s));
	}
}
