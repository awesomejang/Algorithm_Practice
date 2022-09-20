package backjun.arr;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class 좌표압축 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = kb.nextInt();
		}
		int[] arr2 = arr.clone();
 		Arrays.sort(arr2);
		int index = 0;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int target = arr2[0];
		map.put(target, index);
		for (int i = 1; i < arr2.length; i++) {
			//map에있나
			// 값이 바꼇나
			if(arr2[i] != target) {
				index++;
				target = arr2[i];
			}
			map.put(arr2[i], map.getOrDefault(arr2[i], index));
		}
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < arr.length; i++) {
			sb.append(map.get(arr[i])).append(" ");
		}
		System.out.println(sb.toString().trim());
	}
}
