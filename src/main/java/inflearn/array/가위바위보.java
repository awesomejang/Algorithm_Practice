package inflearn.array;

public class 가위바위보 {
	public static String solution(int n, int[] a, int[] b) {
		//n = 게임횟수, a = a가 낸거, b가 낸거
		String answer = "";
		for (int i = 0; i < n; i++) {
			if(a[i] == b[i]) {
				answer += "D";
			}else if(a[i] == 1 && b[i] == 3) {
				answer += "A";
			}else if(a[i] == 2 && b[i] == 1) {
				answer += "A";
			}else if(a[i] == 3 && b[i] == 2) {
				answer += "A";
			}else {
				answer += "B";
			} 
		}
		return answer;
	}
	
	public static void main(String[] args) {
		int n =5;
		int[] a = {2,3,3,1,3};
		int[] b = {1,1,2,2,3};
		System.out.println(가위바위보.solution(n, a, b));
	}
}
