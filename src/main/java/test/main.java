package test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class main {
	
	public static void solution(String str){
		String answer = "";
		for (int i = 0; i < str.length(); i++) {
			//System.out.println(str.charAt(i) + " "+i + " " + str.indexOf(str.charAt(i)));
			if(str.indexOf(str.charAt(i)) == i) answer += str.charAt(i);
		}
		
		System.out.println(answer); 
		
	}
	char a;
	public static void main(String[] args) {
		main.solution("kiakzxcvbzxcbvsw");
	}
}
