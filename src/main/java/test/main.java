package test;

import java.util.Iterator;

public class main {
	
	public static String solution(String str){
		String answer="";
		int m=Integer.MIN_VALUE, pos;
		while((pos=str.indexOf(' '))!=-1){
			String tmp=str.substring(0, pos);
			System.out.println(tmp);
			int len=tmp.length();
			if(len>m){
				m=len;
				answer=tmp;
			}
			str=str.substring(pos+1);
		}
		if(str.length()>m) answer=str;
		return answer;
	}
	
	public static void main(String[] args) {
		String test = "it is time to study";
		String g ="good";
		
		String[] arr2 = new String[g.length()];
		for (int i = g.length() -1; i >= 0; i--) {
			System.out.println(g.charAt(i));
		}
		
		String[] arr = test.split(" ");
		String result="";
		for (int i = 0; i < arr.length; i++) {
			if(arr[i].length() > result.length()) result = arr[i];
		}
		//System.out.println(result);
		main.solution(test);
	}
}
