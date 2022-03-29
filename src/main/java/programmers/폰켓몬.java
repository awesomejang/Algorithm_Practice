package programmers;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class 폰켓몬 {
	//N/2의 개수에서 최대한 다양한 개수를 가져야된다는 조건에서 개수를 리턴
	public static int solution(int[] nums) {
		Arrays.sort(nums);
		int maxCount = (nums.length) / 2;
		int count = 0;
		int point = 0;
		for (int i = 0; i < nums.length; i++) {
			if(count >= maxCount) {
				break;
			}
			if(point != nums[i]) {
				point = nums[i];
				count++;
				continue;
			}
		}
        int answer = count;
        return answer;
    }
	/**
	 * 중복을 제거하는게 이 문제의 핵심이였다. 중복을 제거하는 여러가지 방법중 ArrayList, set자료구조를 사용한 
	 * 방법을 사욯하는게 간단해 보인다 위처럼 하려면 정렬이 들어가야하기 떄문에 비효율적이다.
	 * ArrayList : .contains() 메소드 활용
	 */	 
	public static int solution2(int[] nums) {
		Set<Integer> set = new HashSet<Integer>();
		int len = nums.length;
		for (int i = 0; i < nums.length; i++) {
			set.add(nums[i]);
		}
		return Math.min(len/2, set.size());
	}
	
	
	public static void main(String[] args) {
		int[] arr = {3,3,3,2,2,2};
		int result = 폰켓몬.solution2(arr);
		System.out.println(result);
	}
}
