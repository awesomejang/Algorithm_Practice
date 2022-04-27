package inflearn.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class Point implements Comparable<Point> {
	public int x, y;
	Point (int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public int compareTo(Point o) {
		if(this.x==o.x) return this.y-o.y;  // 무조건 음수가 되도록 설정한다.     
		else return this.x-o.x;            // 오름차순 = 10,20,30 ... this.y - o.y(10-20)
										  // 내림차순 = 30,20,10 ... O.y - this.y(this = 20, o = 10) = 10 - 20 
	} 
}
public class 좌표정렬 {
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		ArrayList<Point> arr=new ArrayList<>();
		Point[] arr2 = new Point[n];
		for(int i=0; i<n; i++){
			int x=kb.nextInt();
			int y=kb.nextInt();
			arr.add(new Point(x, y));
			arr2[i] = new Point(x, y);
		}
		Collections.sort(arr); // 이때 compareTo 사용됨
		Arrays.sort(arr2);
		for(Point o : arr2) System.out.println(o.x+" "+o.y);
	}
}
