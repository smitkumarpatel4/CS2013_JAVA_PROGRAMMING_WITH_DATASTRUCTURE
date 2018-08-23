package CHAPTER_25_BINARY_SEARCH_TREE;
// (4 pts) Implement Non-Recursive Pre Order for the Binary Search Tree. 
import java.util.Stack;

class Nodes {
		 
	    int element;
	    Nodes left, right;
	 
	    public Nodes(int item) {
	        element = item;
	        left = right = null;
	    }
		
	}

public class NR_PREORDER {
	 
    Nodes root;
     
    void iterativePreorder()
    {
        iterativePreorder(root);
    }
    void iterativePreorder(Nodes n) {
         
        if (n == null) {
            return;
        }
   
    Stack<Nodes> s = new Stack<Nodes>();
    s.push(root);

    while (s.empty() == false) {
         
        Nodes m = s.peek();
        System.out.print(m.element + " ");
        s.pop();

        if (m.right != null) {
            s.push(m.right);
        }
        if (m.left != null) {
            s.push(m.left);
        }
    }
    }

	public static void main(String args[]) {
	    NR_PREORDER pre = new NR_PREORDER();
	    pre.root = new Nodes(16);
	    pre.root.left = new Nodes(2);
	    pre.root.right = new Nodes(12);
	    pre.root.left.left = new Nodes(1);
	    pre.root.left.right = new Nodes(4);
	    pre.root.right.left = new Nodes(1);
	    System.out.println("After Preorder Traversal");
	    pre.iterativePreorder();
	
	}
}