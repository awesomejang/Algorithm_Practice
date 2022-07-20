package inflearn.DP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * DP는 조건에 부합하는 상황에서 최선의 값을 골라서 거기에 나의 값을 더해주는 형식으로 간다. 
 * 어떤게 오는게 중요한게 아니라 나의 상태 이전에 최선의값이 뭔지만 알면된다. 
 * @author jang
 *
 */
class box implements Comparable<box>  { 
	public int width;
	public int height;
	public int weight;
	
	public box(int width, int height, int weight) {
		this.width = width;
		this.height = height;
		this.weight = weight;
	}

	@Override
	public int compareTo(box o) {
		return o.width - this.width;
	}
}
public class 가장높은탑쌓기 {
	static int[] dy;
	public int solution(List<box> boxs) {
		int answer = 0;
		Collections.sort(boxs);
		dy[0] = boxs.get(0).height;
		answer = dy[0];
		for (int i = 1; i < boxs.size(); i++) {
			int max = 0;
			box target = boxs.get(i);
			for (int j = i; j >= 0; j--) {
				box back = boxs.get(j);
				if(target.weight < back.weight && max < dy[j]) max = dy[j];
			}
			dy[i] = max + target.height;
			answer = Math.max(answer, dy[i]);
		}
		return answer;
	}
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		가장높은탑쌓기 T = new 가장높은탑쌓기();
		int n = kb.nextInt();
		dy = new int[n];
		List<box> arr = new ArrayList<box>(); 
		for (int i = 0; i < n; i++) {
			arr.add(new box(kb.nextInt(), kb.nextInt(), kb.nextInt()));
		}
		System.out.println(T.solution(arr));
		//Arrays.sort(boxs, com);
		
	}
}
