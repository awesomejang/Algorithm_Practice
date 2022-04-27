package inflearn.sorting;

/**
 * i는 순차적으로 증가하고 j는 i-1에서 시작한다. 
 * 배열의 i번째 value를 기준으로 j와 비교하여 j의 값을 밀어준다.
 * 그러다 더이상 작지 않다면 j+1지점에 i의 value를 넣어준다.
 * @author jang
 *
 */
public class 삽입정렬 {
	public static int[] solution(int n, int[] arr) {
		for (int i = 0; i < n; i++) {
			int tmp = arr[i], j;
			for (j = i - 1; j >= 0; j--) {
				// 한칸도 안움직임 = j = i-1
				// 움직였다 = j+1 앞이 i가 들어갈자리
				//System.out.println("j = " + j);
				if (arr[j] > tmp) arr[j + 1] = arr[j]; 
				else break;
			}
			arr[j + 1] = tmp;
			for (int z = 0; z < arr.length; z++) {
				System.out.println(arr[z]);
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		/**
		int[] arr = {11,7,5,6,10,9};
		삽입정렬.solution(6, arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		*/
		int[] arr = {3,2,1};
		삽입정렬.solution(3, arr);
		/**
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		*/
	}
}
