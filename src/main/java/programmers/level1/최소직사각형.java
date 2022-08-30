package programmers.level1;

import java.util.Arrays;

// 항상 변경이 불가능 한 요소들 위주로 생각하자
// 이거 같은 경우 가로 세로 돌려서 길이를 비교해서 뭐 이런거 보다도
// 최대의 길이보다 작게 값을 설정해야하기에 제일 큰수랑 그 다음 큰수를 구하면 된다.
public class 최소직사각형 {

	public static int solution(int[][] sizes) {
        int max = 0, min = 0;
        for (int i = 0; i < sizes.length; i++) {
        	Arrays.sort(sizes[i]);
        	min = Math.max(min, sizes[i][0]);
        	max = Math.max(max, sizes[i][1]);
		}
        return min * max;
    }
	
	public static void main(String[] args) {
		int[][] sizes = {{10,7}, {12,3}, {8,15}, {14,7}, {5,15}};
		System.out.println(최소직사각형.solution(sizes));
	}
}
