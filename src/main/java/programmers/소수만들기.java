package programmers;

public class 소수만들기 {
	public static boolean as(int target) {
        if(target < 2) {
            return false;
        }
        if(target == 2) {
            return true;
        }
        for(int i=2; i < target; i++) {
            if((target % i) == 0) return false;
        }
        return true;
    }
    public int solution(int[] nums) {
        int answer = 0;
        for(int i=0; i < nums.length; i++) {
            for(int j= i+1; j < nums.length; j++) {
               for(int k= j+1; k < nums.length; k++) {
                  int result = nums[i] + nums[j] + nums[k];
                   if(소수만들기.as(result)) answer++;
               }
            }
        }

        return answer;
    }
}
