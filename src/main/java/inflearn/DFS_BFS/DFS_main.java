package inflearn.DFS_BFS;


class Node{ 
    int data; 
    Node lt, rt; 
    public Node(int val) { 
        data=val; 
        lt=rt=null; 
    } 
} 

public class DFS_main {
	 Node root;
	 public void DFS(Node root) {
		 if(root == null) return;
		 else {
			 // 전위 순회 1.2.4.5.3.6.7
			 // 중위 순회 4.2.5.1.6.3.7
			 // 후위 순회 4.5.2.6.7.3.1
			 System.out.println(root.data);
			 DFS(root.lt);
			 DFS(root.rt);
		 }
	 }
	 
	 
	 public static void main(String args[]) { 
		 	DFS_main tree=new DFS_main(); 
	        tree.root=new Node(1); 
	        tree.root.lt=new Node(2); 
	        tree.root.rt=new Node(3); 
	        tree.root.lt.lt=new Node(4); 
	        tree.root.lt.rt=new Node(5); 
			tree.root.rt.lt=new Node(6); 
	        tree.root.rt.rt=new Node(7);
	        tree.DFS(tree.root); 
	    } 

}
