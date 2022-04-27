package inflearn.sorting;


/**
 * 뒤에있는 인덱스와 비교하여 오름차순이라면 제일큰 숫자를 계속해서 뒤로 민다. 
 * 그렇다면 반복문이 시작할때 마다 끝의 인덱스는 정렬이 됐으므로 제외시켜준다.
 * @author jang
 *
 */
public class 버블정렬 {
	public static int[] solution(int n, int[] arr) {
		for (int i = 0; i < n-1; i++) { // 마지막 꺼는 제외 가능 
			for (int j = 0; j < n-i-1 ; j++) { // +1해야하니까 -1 i가 늘어나는 만큼 줄어준다.
				if(arr[j] > arr[j+1]) {
					int tmp = arr[j];
					arr[j+1] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
		return arr;
	}
	public static int[] solution2(int n, int[] arr) {
		for (int i = n-2; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.println(i);
				if(arr[j] > arr[j+1]) {
					int tmp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		int[] arr = {13,5,11,7,23,15};
		int[] answer = 버블정렬.solution(6, arr);
		for(int i : answer) {
			//System.out.println(i);
		}
	}
}
