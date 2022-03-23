package programmers;

public class 숫자문자열과영단어 {
	public int solution(String s) {
        String[] str = {"zero","one", "two","three","four","five","six","seven","eight","nine"};
        String[] num = {"0","1","2","3","4","5","6","7","8","9"};
        for(int i=0; i < str.length; i++) {
            s = s.replace(str[i], num[i]);
        }
        int answer = 0;
        return answer = Integer.parseInt(s);
    }
}
