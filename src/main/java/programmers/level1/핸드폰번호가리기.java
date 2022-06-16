package programmers.level1;

public class 핸드폰번호가리기 {
	public static String solution2(String phone_number) {
		char[] arr = phone_number.toCharArray();
		for (int i = 0; i < arr.length-4; i++) {
			arr[i] = '*';
		}
		return String.valueOf(arr);
	}
	public static String solution(String phone_number) {
		
        String answer = "";
        int len = phone_number.length();
        if(len - 4 == 0) answer = phone_number;
        else {
        	for (int i = 0; i < len-4; i++) {
				answer += "*";
			}
        	answer += phone_number.substring(len-4);
        }
        return answer;
    }
	
	public static void main(String[] args) {
		System.out.println(핸드폰번호가리기.solution("12345"));
	}
}
