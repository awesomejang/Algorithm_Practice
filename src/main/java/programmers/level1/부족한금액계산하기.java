package programmers.level1;

public class 부족한금액계산하기 {
	public static long solution(int price, int money, int count) {
        long answer = money;
        for (int i = 1; i <=count; i++) {
        	answer -= i * price;
		}
        if(answer <0) return Math.abs(answer);
        else return 0;
    }
	
	public static void main(String[] args) {
		System.out.println(부족한금액계산하기.solution(3, 20, 4));
	}
}
