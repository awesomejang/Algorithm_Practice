package test;

public class main {
	public static void main(String[] args) {
		String answer = "";
		String str = "tEst";
		for(char x : str.toCharArray()) {
			if(Character.isLowerCase(x)) answer += Character.toUpperCase(x);
			else answer += Character.toLowerCase(x);
			
		}
		System.out.println(answer);
	}
}
