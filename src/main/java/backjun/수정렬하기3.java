package backjun;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 수정렬하기3 {
	public static void main(String[] args) throws Exception{
		BufferedReader kb =new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		int n = Integer.parseInt(kb.readLine());
		int[] list = new int[n];
		for (int i = 0; i < list.length; i++) {
			list[i] = Integer.parseInt(kb.readLine());
		}
		
		Arrays.sort(list);
		
		for(int i : list) {
			sb.append(i).append('\n');
		}
		System.out.println(sb);
	}
}
