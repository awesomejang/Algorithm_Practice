package test;

import java.util.HashMap;
import java.util.Map;

public class Solution {

	public String solution(String S, String C) {
		Map<String, Integer> emailList = new HashMap<String, Integer>();
		String answer = "";

		String[] sList = S.split(",");
		String[] tmpResult = new String[sList.length];
		String domain = C.toLowerCase();
		
		for (int i = 0; i < sList.length; i++) {
			String list = sList[i];
			String[] names = list.trim().toLowerCase().split(" ");
			String tmpName = "";
			for (int j = 0; j < names.length; j++) {
				String name = names[j];
				if (j == names.length - 1)
					tmpName += name.replace("-", "").substring(0, Math.min(name.length(), 8));
				else
					tmpName += name.charAt(0);
			}
			emailList.put(tmpName, emailList.getOrDefault(tmpName, 0) + 1);

			if (emailList.get(tmpName) != 1) {
				tmpName += emailList.get(tmpName);
			}
			tmpResult[i] = list + " " + "<" + tmpName + "@" + domain + ".com" + ">".trim();
		}
		answer = String.join(",", tmpResult);
		return answer;
		
	}

	public static void main(String[] args) {
		String S = "John Doe, Peter Parker, Mary Jane Watson-Parker, James Doe, John Elvis Doe, Jane Doe, Penny Parker";
		String C = "company";

		Map<String, Integer> emailList = new HashMap<String, Integer>();


	}
}
