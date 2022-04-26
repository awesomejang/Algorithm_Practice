package inflearn.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class 장난꾸러기 {
	
	public ArrayList<Integer> solution(int n, int[] arr) {
		ArrayList<Integer> answer = new ArrayList<Integer>();
		int[] tmp = arr.clone(); // 복사 
		Arrays.sort(tmp);
		for (int i = 0; i < n; i++) {
			if(arr[i] != tmp[i]) answer.add(i +1);
		}
		return answer;
	}

	public static int[] solution2(int n, int[] arr) {
		int[] answer = new int[2];
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for (int i = 0; i < arr.length; i++) {
			map.put(i, arr[i]);
		}
		Arrays.sort(arr);
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] != map.get(i)) System.out.println(i +1);
		}		
		return answer;
	}
	
	public static void main(String[] args) {
		int[] arr = {120, 125, 152, 130, 135, 135, 143, 127, 160};
 		장난꾸러기.solution2(9, arr);
	}
}
