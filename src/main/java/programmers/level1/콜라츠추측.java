package programmers.level1;

public class 콜라츠추측 {

	public static int solution(long num) {
        int answer = 0;
        int count = 0;
        boolean flag = false;
        while(num != 1 && count < 500) {
        	if(num % 2 == 0) {
        		num /= 2;
        	}else {
        		num *= 3;
        		num++;
        	}
        	System.out.println("num = " + num);
        	count++;
        	if(count >= 500) flag = true;
        }
        
        if(flag) answer = -1;
        else answer = count;
        return answer;
    }
	public static void main(String[] args) {
		System.out.println(콜라츠추측.solution(626331));
	}
}
