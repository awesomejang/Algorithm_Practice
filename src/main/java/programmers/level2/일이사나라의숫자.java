package programmers.level2;

public class 일이사나라의숫자 {
	public String solution(int n) {
	      String[] num = {"4","1","2"};
	      String answer = "";

	      while(n > 0){
	          answer = num[n % 3] + answer;
	          n = (n - 1) / 3;
	      }
	      return answer;
	  }
}
