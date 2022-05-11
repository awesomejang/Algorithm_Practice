package inflearn.DFS_BFS;

import java.util.LinkedList;
import java.util.Queue;



public class BFS_main {
	Node root;
	public void BFS(Node root) {
		Queue<Node> Q = new LinkedList<Node>();
		Q.add(root);
		int L = 0; //레벨
		while(!Q.isEmpty()) {
			int len = Q.size();
			System.out.print(L+ ":");
			for (int i = 0; i < len; i++) {
				Node cur = Q.poll();
				System.out.print(cur.data+" ");
				if(cur.lt != null) Q.add(cur.lt);
				if(cur.rt != null) Q.add(cur.rt);
			}
			L++;
			System.out.println();
		}
	}
	
	public static void main(String args[]) { 
		BFS_main tree=new BFS_main(); 
        tree.root=new Node(1); 
        tree.root.lt=new Node(2); 
        tree.root.rt=new Node(3); 
        tree.root.lt.lt=new Node(4); 
        tree.root.lt.rt=new Node(5); 
		tree.root.rt.lt=new Node(6); 
        tree.root.rt.rt=new Node(7);
        tree.BFS(tree.root); 
    } 
}
