package inflearn.자료구조;

import java.util.Stack;

public class 크레인뽑기 {
	
	public int solution(int[][] board, int[] moves){
		int answer=0;
		Stack<Integer> stack = new Stack<>();
		for(int pos : moves){
			for(int i=0; i<board.length; i++){
				if(board[i][pos-1]!=0){
					int tmp=board[i][pos-1];
					board[i][pos-1]=0;
					if(!stack.isEmpty() && tmp==stack.peek()){
						answer+=2;
						stack.pop();
					}
					else stack.push(tmp);
					break;
				}
			}
		}
		return answer;
	}

}
