package inflearn.DFS_BFS;

import java.util.LinkedList;
import java.util.Queue;

public class 말단노드_BFS {
	Node root;
	public int BFS(Node root) {
		Queue<Node> Q = new LinkedList<Node>();
		int L = 0;
		Q.offer(root);
		while(!Q.isEmpty()) {
			int len = Q.size();
			for (int i = 0; i < len; i++) {
				Node tmp = Q.poll();
				if(tmp.lt == null && tmp.rt == null) {
					return L;
				}else {
					if(tmp.lt != null) Q.offer(tmp.lt);
					if(tmp.rt != null) Q.offer(tmp.rt);
				}
			}
			L++;
		}
		return 0;
	}
	
	public static void main(String[] args) {
		말단노드_BFS tree=new 말단노드_BFS();  
        tree.root=new Node(1); 
        tree.root.lt=new Node(2); 
        tree.root.rt=new Node(3); 
        tree.root.lt.lt=new Node(4); 
        tree.root.lt.rt=new Node(5); 
        System.out.println(tree.BFS(tree.root)); 
	}
}
