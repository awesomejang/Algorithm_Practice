package programmers.level2;

import java.util.Stack;

public class 올바른괄호 {
	 static boolean solution(String s) {
	        boolean answer = true;
	        Stack<Character> stack = new Stack<Character>();
	        for(char i : s.toCharArray()) {
	        	if(i == ')') {
	        		if(stack.isEmpty()) {
	        			return false;
	        		}else {
	        			stack.pop();
	        		}
	        	}else {
	        		stack.push(i);
	        	}
	        }
	        
	        if(!stack.isEmpty()) answer = false;
	        return answer;
	    }
	 public static void main(String[] args) {
		System.out.println(올바른괄호.solution("(()("));
	}
}
