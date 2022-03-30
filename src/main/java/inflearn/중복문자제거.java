package inflearn;

import java.util.*;

public class 중복문자제거 {
	/**
	indexOf() 는 첫번째 위치의 인덱스를리턴한다. 
	중복이 있다면 indexOf와 charAt 결과가 달라진다.
	 */
	
	public String solution(String str){
		String answer="";
		for(int i=0; i<str.length(); i++){
			//System.out.println(str.charAt(i)+" "+i+" "+str.indexOf(str.charAt(i)));
			if(str.indexOf(str.charAt(i))==i) answer+=str.charAt(i);
		}
		return answer;
	}
}
