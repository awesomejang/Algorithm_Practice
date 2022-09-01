package programmers.level1;

import java.util.Stack;

public class 크레인인형뽑기 {
	public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<Integer>();
        for (int i = 0; i < moves.length; i++) {
			for (int j = 0; j < board.length; j++) {
				if(board[j][moves[i]-1] != 0) {
					
					int doll = board[j][moves[i]-1];
					board[j][moves[i]-1] = 0;
					
					if(!stack.isEmpty() && stack.peek() == doll) {
						answer +=2;
						stack.pop();
					}else {
						stack.push(doll);
					}
					break;
				}
			}
		}
        return answer;
    }
	
	public static void main(String[] args) {
		
	}
}
