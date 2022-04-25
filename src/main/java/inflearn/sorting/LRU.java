package inflearn.sorting;

public class LRU {
	public static int[] solution(int size, int n, int[] arr) {
		int[] cache = new int[size];
		for(int x : arr) {
			int pos = -1;
			for(int i=0; i<size; i++) if(x == cache[i]) pos = i; //캐시에 존재하는지 여부확인 
			if(pos == -1) { // 캐시에 없다면 
				for (int j = size-1; j >= 1; j--) { // 끝에서 한칸씩 옮긴다.
					cache[j] = cache[j-1];
				}
			}else { // 있다면
				for(int j = pos; j >= 1; j--) { 
					cache[j] = cache[j-1]; // 해당 인덱스부터 한칸씩 땡긴다. 
				}
			}
			cache[0] = x; // 0번째 인덱스에는 x값 추가
		}
		return cache;
	}
	
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 2, 6, 2, 3, 5, 7};
		int[] ans =  LRU.solution(5, 9, arr);
		for(int i : ans) {
			System.out.println(i);
		}
	}
}

