package test;

public class main {
	public static void main(String[] args) {
		String input1 = "Computercooler";
		String input2 = "c";
		int count = 0;
		String[] arr = input1.toLowerCase().split("");
		for(String st : arr) {
			if(st.equals(input2)) count++;
		}
		System.out.println(count);
	}
}
