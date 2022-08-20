package backjun;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class gut implements Comparable<gut>{
	public int x;
	public int y;
	public gut(int x, int y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public int compareTo(gut o) {
		if(this.x == o.x) {
			return this.y - o.y;
		}
		return this.x - o.x;
	}
}

public class 좌표정리하기 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		List<gut> guts = new ArrayList<gut>();
		
		for(int i=0; i<n; i++) {
			int x = kb.nextInt();
			int y = kb.nextInt();
			guts.add(new gut(x, y));
		}
		Collections.sort(guts);
		
		for(gut g : guts) {
			System.out.println(g.x + " " + g.y);
		}
	}
}
