package inflearn.자료구조;

import java.util.Stack;

public class 올바른괄호 {

	public String solution(String str) {
		String answer = "YES";
		Stack<Character> stack = new Stack<>();
		for (char x : str.toCharArray()) {
			if (x == '(')
				stack.push(x);
			else {
				if (stack.isEmpty())
					return "NO";
				stack.pop();
			}
		}
		if (!stack.isEmpty())
			return "NO";
		return answer;
	}

}
