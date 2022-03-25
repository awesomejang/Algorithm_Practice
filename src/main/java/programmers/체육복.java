package programmers;

import java.util.Arrays;

public class 체육복 {
	
	
	//두 값의 마이너스 계산식의 절대값을 리턴
	public static boolean check(int lost, int reserve) {
		int check = lost - reserve;
		if(Math.abs(check) > 1) return false;
		return true;
	}
	
	 
	public static int solution(int n, int[] lost, int[] reserve) {
		int answer = n - lost.length;
		
		// 분실자이면서 여분자인 사람들을 구분하기 위하여 미리 처리한다.
		Arrays.sort(lost);
		Arrays.sort(reserve);
		for (int i = 0; i < lost.length; i++) {
			for (int j = 0; j < reserve.length; j++) {
				if(lost[i] == reserve[j]) {
					answer++;
					lost[i] = -1;
					reserve[j] = -1;
				}
			}
		}
		// -1를 계산식에서 필요가 없기 떄문에 제외한다.
		for (int i = 0; i < lost.length; i++) {
			for (int j = 0; j < reserve.length; j++) {
				if(check(lost[i], reserve[j]) && reserve[j] != -1 && lost[i] != -1) {
					System.out.println(lost[i] + " " + reserve[j]);
					answer++;
					reserve[j] = -1;
					break;
				}
				
			}
		}
		
		//return answer + count;
		return answer;
	}
	
	/**	다른사람의 코드
		public int solution(int n, int[] lost, int[] reserve) {
        int[] people = new int[n];
        int answer = n;

        for (int l : lost) 
            people[l-1]--;
        for (int r : reserve) 
            people[r-1]++;

        for (int i = 0; i < people.length; i++) {
            if(people[i] == -1) {
                if(i-1>=0 && people[i-1] == 1) {
                    people[i]++;
                    people[i-1]--;
                }else if(i+1< people.length && people[i+1] == 1) {
                    people[i]++;
                    people[i+1]--;
                }else 
                    answer--;
            }
        }
        return answer;
    }
	 */
	
	
	public static void main(String[] args) {
		int n = 3;
		int[] lost = {3};
		int[] reserve = {1};
		System.out.println(체육복.solution(n, lost, reserve));;
	}
}
