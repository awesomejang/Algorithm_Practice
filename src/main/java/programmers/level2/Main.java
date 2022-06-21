package programmers.level2;

public class Main {
	public static void main(String[] args) {
		String target = "aabbaccc";
		int answer = target.length();
		int len = target.length() / 2;
		for (int i = 1; i <= len; i++) {
			for (int j = i; j < target.length(); j+=i) {
				int endIndex = (target.length() > j+i) ? j+i : target.length();
				String front = target.substring(j, endIndex);
				System.out.println(front);
			}
		}
	}
}
