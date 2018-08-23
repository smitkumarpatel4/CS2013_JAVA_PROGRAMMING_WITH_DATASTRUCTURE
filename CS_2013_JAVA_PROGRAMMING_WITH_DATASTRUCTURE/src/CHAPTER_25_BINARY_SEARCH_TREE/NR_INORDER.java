package CHAPTER_25_BINARY_SEARCH_TREE;
// 6. (4 pts) Implement Non-Recursive IN Order for the Binary Search Tree.
import java.util.Stack;

	class Node {
		 
	    int element;
	    Node left, right;
	 
	    public Node(int item) {
	        element = item;
	        left = right = null;
	    }
	}

	public class NR_INORDER {
	Node root;
	 
     void inorder() {
        if (root == null) {
            return;
        }
        Stack<Node> s = new Stack<Node>();
        Node n = root;
        
        while (n != null) {
            s.push(n);
            n = n.left;
        } 
        while (s.size() > 0) {
        	 n = s.pop();
             System.out.print(n.element + " ");
             if (n.right != null) {
                 n = n.right;
                 while (n != null) {
                     s.push(n);
                     n = n.left;
                 }
        
        }
}
 }
     public static void main(String args[]) {
         
         
         NR_INORDER i = new NR_INORDER();
         i.root = new Node(11);
         i.root.left = new Node(5);
         i.root.right = new Node(1);
         i.root.left.left = new Node(9);
         i.root.left.right = new Node(16);
         System.out.println("After Inorder Traversal");
         i.inorder();
     }
}
		