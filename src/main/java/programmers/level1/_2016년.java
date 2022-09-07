package programmers.level1;

public class _2016년 {
	static String[] days = {"THU", "FRI","SAT", "SUN", "MON", "TUE", "WED"}; // 1.1일이 금요일인데 FRI를 첫번쨰로 하면 days[1] = SAT이기에 인덱스1번으로 미룬다. 
	static int[] months = {31,29,31,30,31,30,31,30,31,30,31,30};
	
	public static String solution(int a, int b) {
        int dates = 0;
        for (int i = 0; i < a-1; i++) { // 해당 월 전주까지 합산
			dates += months[i];
		}
        dates += (b); 
        return days[dates % 7];
    }
	
	public static void main(String[] args) {
		System.out.println(solution(5, 24));
	}
}
