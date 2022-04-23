package inflearn.자료구조;

import java.util.LinkedList;
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
	public static int solution2(int n, int m, int[] arr) {
		int cnt = 0;
		int target = 0;
		Queue<Integer> Q = new LinkedList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			if(i == m) target = arr[i];
			Q.offer(arr[i]); 
		}
		
		while(m >= cnt) {
			int tmp = Q.poll();
			System.out.println(tmp);
			for(int x : Q) {
				if(x > tmp) {
					//System.out.println(tmp);
					Q.offer(tmp);
					tmp = -1;
					break;
				}
			}
			
			if(tmp > 0) {
				//System.out.println("in");
				cnt++;
				Q.poll();
			}
			
		}
		return cnt;
	}
	
	public static void main(String[] args) {
		int[] arr = {70,60,90,60,60,60};
		System.out.println(응급실.solution2(6, 3, arr)); 
	}
}
