package programmers;

public class 키패트누르기 {

	int[][] board = { { 0, 0 }, { 0, 1 }, { 0, 2 }, { 1, 0 }, { 1, 1 }, { 1, 2 }, { 2, 0 }, { 2, 1 }, { 2, 2 },
			{ 3, 0 }, { 3, 1 }, { 3, 2 } };

	public int distance(int numbers, int Pos) {
		int xx = Math.abs((board[Pos - 1][0]) - (board[numbers - 1][0])); // 절대값 -> 입력한 그대로(음수 -> 양수)
		int yy = Math.abs((board[Pos - 1][1]) - (board[numbers - 1][1]));
		return (xx + yy);
	}

	public String solution(int[] numbers, String hand) {

		int left = 10;
		int right = 12;
		String answer = "";
		for (int i = 0; i < numbers.length; i++) {
			int target = numbers[i];
			if (target == 1 || target == 4 || target == 7) {
				answer += "L";
				left = target;
			} else if (target == 3 || target == 6 || target == 9) {
				answer += "R";
				right = target;
			} else {
				if (target == 0)
					target = 11;

				int ll = distance(target, left);
				int rr = distance(target, right);

				if (ll > rr) {
					answer += "R";
					right = target;
				} else if (ll < rr) {
					answer += "L";
					left = target;
				} else {
					if (hand.equals("right")) {
						answer += "R";
						right = target;
					} else {
						answer += "L";
						left = target;
					}
				}
			}
		}

		return answer;

	}

}
