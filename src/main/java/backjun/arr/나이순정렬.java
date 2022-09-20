package backjun.arr;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//https://www.acmicpc.net/problem/10814
class Member implements Comparable<Member>{
	int age;
	String name;
	
	public Member(int age, String name) {
		this.age = age;
		this.name = name;
	}

	@Override
	public int compareTo(Member o) {
		if(this.age == o.age) return 1; 
		return this.age - o.age;
	}
}
public class 나이순정렬 {
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		List<Member> members = new ArrayList<Member>();
		for (int i = 0; i < n; i++) {
			members.add(new Member(kb.nextInt(), kb.next()));
		}
		Collections.sort(members);
		
		for(Member member : members) {
			System.out.println(member.age + " " + member.name);
		}
	}
}
