package inflearn.자료구조;

import java.util.Stack;

public class 쇠막대기 {
	
	// (()) 
	// ) 일시 앞의 괄호를 확인하고 (라면 레이저 = 레이저 짝꿍 하나빼고 나머지 stack의 사이즈 만큼 추가 한다. 
	// ))의 상황이면 한칸의 끝을 뜻하므로 stack에서 짝꿍 뺴고 자투리 +1 를 한다.
	
	public static int solution(String str) {
		int cnt=0;
		Stack<Character> stack=new Stack<>();
		for(int i=0; i<str.length(); i++){
			if(str.charAt(i)=='(') stack.push('(');
			else{
				stack.pop();
				if(str.charAt(i-1)=='(') cnt+=stack.size();
				else cnt++;
			}
		}
		return cnt;
	}
	

	public static int solution2(String str) {
		int cnt = 0;
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < str.length(); i++) {
			// 1.')'확인 2. )라면 앞에 (인가? 
			if(str.charAt(i) == ')') {
				stack.pop(); //앞의 (뺴고
				if(str.charAt(i-1) == '(') cnt += stack.size(); // 스택의 사이즈 더해준다. 
				else cnt++;// )) 인 상황이면? //짝궁 ( 꺼내고
			}else {
				stack.push(str.charAt(i));
			}
		}
		return cnt;
	}
	
	public static void main(String[] args) {
		String str = "(((()(()()))(())()))(()())";
		System.err.println(쇠막대기.solution(str));
	}
}
