package programmers.level1;

class CreateNewId {
	private String new_id;
	
	public CreateNewId(String new_id) {
		this.new_id = new_id;
	}
	
	public String getResult() {
		return this.new_id;
	}
	
	//1
	public CreateNewId lowerCase() {
		new_id = new_id.toLowerCase();
		return this;
	}
	//2 
	public CreateNewId filter() {
		String str = "-_.";
		StringBuffer sb = new StringBuffer();
		
		for (int i = 0; i < new_id.length(); i++) {
   			char ch = new_id.charAt(i);
   			if(!Character.isAlphabetic(ch) && !Character.isDigit(ch) && !str.contains(String.valueOf(ch))) {
   				continue;
   			}
   			sb.append(ch);
   		}
		new_id = sb.toString();
		return this;
	}

	//3
	public CreateNewId removeDots() {
   		while(new_id.contains("..")) {
   			new_id = new_id.replace("..", ".");
   		}
   		return this;
	}
	
	//4
	public CreateNewId subDot() {
		if(new_id.charAt(0) == '.') {
			new_id = new_id.substring(1);
   		}
   		
   		if(!new_id.isEmpty() && new_id.charAt(new_id.length()-1) == '.') {
   			new_id = new_id.substring(0, new_id.length()-1);
   		}
   		return this;
	}
	//5
	public CreateNewId plusStr() {
   		if(new_id.isEmpty()) new_id = "a";
   		return this;
	}
	
	//6
	public CreateNewId subStr() {
   		if(new_id.length() > 15) {
   			new_id = new_id.substring(0, 15);
   			if(new_id.lastIndexOf(".") == new_id.length()-1) {
   				new_id = new_id.substring(0, new_id.length()-1);
   			}
   		}
   		return this;
	}
	
	public CreateNewId fillStr() {
		while(new_id.length() < 3) {
			new_id += new_id.charAt(new_id.length()-1);
   		}
		return this;
	}
	
}
public class 아이디추천 {
	public static String solution(String new_id) {
		String answer = new CreateNewId(new_id)
				           .lowerCase()
				           .filter()
				           .removeDots()
				           .subDot()
				           .plusStr()
				           .subStr()
				           .fillStr()
				           .getResult();
		return answer;
				
		
	}

	public static void main(String[] args) {
		String s = "=.=";
		System.out.println(아이디추천.solution(s));
	}
}
