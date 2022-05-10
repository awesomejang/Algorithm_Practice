package programmers.level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 나누어떨어지는숫자배열 {
	public static int[] solution(int[] arr, int divisor) {
		List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
        	if((arr[i] % divisor) == 0) {
        		list.add(arr[i]); 
        	}
		}        
        if(list.size() == 0) list.add(-1);
        Collections.sort(list);
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
        	answer[i] = list.get(i);
		}
		return answer;
    }
	
	public static void main(String[] args) {
		int[] arr = {5,9,7,10};
		for(int i : 나누어떨어지는숫자배열.solution(arr, 5)) {
			System.out.println(i);
		}
	}
}
