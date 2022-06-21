package programmers.level2;

public class 문자열압축 {
	public static void main(String[] args) {
		//https://yline.tistory.com/166?category=511149
		String target = "aabbaccc";
		int answer = target.length();
		
		int len = target.length() / 2;
		for (int i = 1; i <= len; i++) {
			int count = 1;
			String temp = target.substring(0, i);
			String answer2 = "";
			for (int j = i; j <= target.length(); j+=i) {
				int endIndex = (target.length() > j+i) ? j+i : target.length();
				String front = target.substring(j, endIndex);
				
				if(temp.equals(front)) {
					count++;
				}else {
					if(count >=2) {
						answer2 += (count + temp);
					}
					else {
						answer2 += temp;
					}
					count = 1;
					temp = front;
				}
				System.out.println(answer2);
			}
			/////////////
			answer2 += temp;
			answer = Math.min(answer, answer2.length());
		}
		System.out.println(answer);
	}
}
