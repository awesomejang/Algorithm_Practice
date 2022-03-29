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
		System.out.println(2/2);
	}
}
