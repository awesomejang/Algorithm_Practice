package programmers.level2;

import java.util.Stack;

public class 짝지어제거하기 {

	public int solution(String s) {
		int answer = 1;
		Stack<Character> stack2 = new Stack<>();

		for (int i = 0; i < s.length(); i++) {
			Character ch = s.charAt(i);
			if (stack2.isEmpty())
				stack2.push(ch);
			else {
				if (stack2.peek().equals(ch))
					stack2.pop();
				else
					stack2.push(ch);
			}
		}

		if (stack2.size() > 0)
			answer = 0;
		return answer;
	}
}
