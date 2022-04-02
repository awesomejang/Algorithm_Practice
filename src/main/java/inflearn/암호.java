package inflearn;

public class 암호 {
	
	public static String solution(int n, String s){
		String answer="";
		for(int i=0; i<n; i++){
			String tmp=s.substring(0, 7).replace('#', '1').replace('*', '0');
			int num=Integer.parseInt(tmp, 2); // 두번째 인자로 2진수로 넘어간다고 알린다.
			answer+=(char)num; // 형변환
			s=s.substring(7); // 첫번쨰 요소는 위해서 사용하고 두번째 부터 7부터 짤라서 실행한다.
		}
		return answer;
	}
	
	public static String solution2(int n, String s) {
		int z = 0;
		String two ="";
		String answer ="";
		for (int i = 0; i < n; i++) {
			String temp = s.substring(z, z +7);
			for (int j = 0; j < temp.length(); j++) {
				char temp2 = (temp.charAt(j) == '#') ? '1' : '0';
				two += temp2;
			}
			int test = Integer.valueOf(two, 2);
			answer += (char)test; // 형변환으로 아스키코드에서 문자로전환
			two = "";
			z +=7;
		}
		return answer;
	}
	public static void main(String[] args) {
		System.out.println(암호.solution(4, "#****###**#####**#####**##** "));
	}
}
