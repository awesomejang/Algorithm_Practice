package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class 문자열내마음대로정렬하기 {
	public static String[] solution(String[] strings, int n) {
		int cnt = 0;
		String[] answer = new String[strings.length];
		Character[] pivots = new Character[strings.length];
		List<String> list = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();
		//Arrays.sort(strings);
			
		
		for (int i = 0; i < strings.length; i++) {
			 Character tmp = strings[i].charAt(n);
			 pivots[i] = tmp;
		}
		Arrays.sort(pivots);
		
		for (int i = 0; i < pivots.length; i++) {
			char pivot = pivots[i];
			List<String> tmp = new ArrayList<String>();
			for (int j = 0; j < strings.length; j++) {
				if(strings[j].contains(Character.toString(pivot)) && !list2.contains(strings[j])) {
					tmp.add(strings[j]);
				}
			}
			Collections.sort(tmp);
			for (int j = 0; j < tmp.size(); j++) {
				list2.add(tmp.get(j));
			}
		}
		
		for (int z = 0; z < list2.size(); z++) {
			answer[z] = list2.get(z);
		}
		
        return answer;
	}
	
	public static void main(String[] args) {
		String[] strings = {"sun", "bed", "car"};
		String[] string = {"abce", "abcd", "cdx"};
		String[] an = 문자열내마음대로정렬하기.solution(strings, 1);
		for(String i : an) {
			System.out.println(i);
		}
		
	}
}
