package programmers.level2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 오픈채팅방 {
	public static String[] solution(String[] record) {
        Map<String, String> nickMap = new HashMap<String, String>();
        List<String> list = new ArrayList<String>();  
        for (int i = 0; i < record.length; i++) {
        	String[] tmp = record[i].split(" ");
        	String action = tmp[0];
        	String id = tmp[1];
        	
        	if(action.equals("Enter")) {
        		String nickName = tmp[2];
        		list.add(id + " " + action);
        		nickMap.put(id, nickName);
        	}else if(action.equals("Leave")) {
        		list.add(id + " " + action);
        	}else {
    			nickMap.replace(id, tmp[2]);
        	}
		}
        
        String[] answer = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
			String[] temp = list.get(i).split(" ");
			String action = (temp[1].equals("Enter")) ? "들어왔습니다.": "나갔습니다.";
			answer[i] = nickMap.get(temp[0]) + "님이" + " " + action;
		}
        
        return answer;
    }
	
	public static void main(String[] args) {
		String[] answer = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
		for(String i : 오픈채팅방.solution(answer)) {
			System.out.println(i);
		}
	}
}
