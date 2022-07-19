package backjun;

import java.util.Scanner;

class item {
	int weight;
	int value;
	public item(int weight, int value) {
		this.weight = weight;
		this.value = value;
	}
}
public class 평범한배낭 {
	static int totcalCount;
	static int totalWeight;
	static int result = Integer.MIN_VALUE;
	public void DFS(int weight, int value) {
		//종료조건
		if(weight > totalWeight) {
			return;
		}else {
			
		}
	}
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		totcalCount = kb.nextInt();
		totalWeight = kb.nextInt();
		
		
	}
}
