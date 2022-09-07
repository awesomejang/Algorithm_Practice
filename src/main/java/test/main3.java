package test;

import java.util.Scanner;

public class main3 {
	
	public static String solution(String str) {
		/**
		String answer = "";
		Character pivot = str.charAt(0);
		int cnt = 1;
		for (int i = 1; i < str.length(); i++) {
			if (pivot == str.charAt(i)) {
				cnt++;
				continue;
			}else {
				answer += pivot;
				pivot = str.charAt(i);
			}
			if (cnt > 1) {
				answer += String.valueOf(cnt);
				cnt = 0;
			}
		}
		return answer += str.charAt(str.length() - 1);
		*/
		String answer = "";
		str += " ";
		int cnt = 1;
		for (int i = 0; i < str.length()-1; i++) {
			if(str.charAt(i) == str.charAt(i+1)) { 
				cnt++;
			}else {
				answer += str.charAt(i);
				if(cnt > 0) {
					answer += String.valueOf(cnt);
					cnt = 0;
				}
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		System.out.println("hello");
		System.out.println(main3.solution("KKHSSSSSSSE"));
		Scanner sc = new Scanner(System.in);
	}
}
