package inflearn.자료구조;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;


class Person{
	int id;
	int priority;
	public Person(int id, int priority){
		this.id=id;
		this.priority=priority;
	}
}

public class 응급실 {
	public static int solution1(int n, int m, int[] arr) {
		int answer=0;
		Queue<Person> Q=new LinkedList<>();
		for(int i=0; i<n; i++){
			Q.offer(new Person(i, arr[i]));
		}
		while(!Q.isEmpty()){
			Person tmp=Q.poll();
			for(Person x : Q){
				if(x.priority>tmp.priority){
					Q.offer(tmp);
					tmp=null;
					break;
				}
			}
			if(tmp!=null){
				answer++;
				if(tmp.id==m) return answer;
			}
		}
		return answer;
		
	}
	
	public static void main(String[] args) {
		int[] arr = {70,60,90,60,60,60};
		System.out.println(응급실.solution1(6, 3, arr)); 
	}
}
