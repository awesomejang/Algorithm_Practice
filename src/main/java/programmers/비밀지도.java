package programmers;


public class 비밀지도 {
	//String.format으로 자리수의 부족한 부분을 공백으로 채울수있다. 
	public static String[] solution(int n, int[] arr1, int[] arr2) {
		String[] arr = new String[n];
		for (int i = 0; i < n; i++) {
			String str = "";
			String tmp1 = Integer.toBinaryString(arr1[i]);
			String tmp2 = Integer.toBinaryString(arr2[i]);
			
			tmp1 = String.format("%" + n + "s", tmp1).replaceAll("1", "#");
			tmp2 = String.format("%" + n + "s", tmp2).replaceAll("1", "#");
			
			for (int j = 0; j < n; j++) {
				if(tmp1.charAt(j) == '#' || tmp2.charAt(j) == '#') {
					str += "#";
				}else {
					str += " ";
				}
			}
			arr[i] = str;
		}
		return arr;
	}
	public static void main(String[] args) {
		int[] arr1 = {9, 20, 28, 18, 11};
		int[] arr2 = {30, 1, 21, 17, 28};
		비밀지도.solution(5, arr1, arr2);
		
	}
}
