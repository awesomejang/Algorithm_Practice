package programmers.level1;

import java.util.Arrays;
import java.util.Collections;

public class 정수내림차순으로배치하기 {
	public long solution(long n) {
        long answer = 0;
        String str = String.valueOf(n);
        Character[] arr = new Character[str.length()];
		for (int i = 0; i < str.length(); i++) {
			arr[i] = str.charAt(i);
		}
		Arrays.sort(arr, Collections.reverseOrder());
		String tmp ="";
		for (int i = 0; i < arr.length; i++) {
			tmp += arr[i];
		}
		answer = Long.parseLong(tmp);
		
        return answer;
    }
	
	public long solution2(long n) {
        long answer = 0;
        String[] str = String.valueOf(n).split("");
        Arrays.sort(str);
        StringBuffer sb = new StringBuffer();
        for(String a : str) sb.append(str);
        return Long.parseLong(sb.reverse().toString());
		
    }
	
	public static void main(String[] args) {
		int num = 12345;
		String str = String.valueOf(num);
		Character[] arr = new Character[str.length()];
		for (int i = 0; i < str.length(); i++) {
			arr[i] = str.charAt(i);
		}
 	
		Arrays.sort(arr, Collections.reverseOrder());
		for(char i : arr) {
			System.out.print(i);
		}
		
	}
}
