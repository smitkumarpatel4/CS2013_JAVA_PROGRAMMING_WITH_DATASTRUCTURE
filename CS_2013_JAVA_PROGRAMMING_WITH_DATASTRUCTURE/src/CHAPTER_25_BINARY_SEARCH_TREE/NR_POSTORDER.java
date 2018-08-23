package CHAPTER_25_BINARY_SEARCH_TREE;
//2. (4 pts) Implement Non-Recursive Post Order for the Binary Search Tree.
import java.util.ArrayList;
import java.util.Stack;

class PtNode
{
	int d;
	PtNode left, right;
	
	PtNode(int item)
	{
		d = item;
		left = right;
	}
}

public class NR_POSTORDER {

	PtNode root;
	ArrayList<Integer> list = new ArrayList<Integer>();
	ArrayList<Integer> postOrder(PtNode node)
	{
		Stack<PtNode> stack = new Stack<PtNode>();
			if(node == null)
			return list;
		stack.push(node);
		PtNode prev = null;
		while(!stack.isEmpty())
		{
			PtNode current = stack.peek();
			if(prev == null || prev.left == current || prev.right == current)
			{
				if(current.left != null)
					stack.push(current.left);
				else if(current.right != null)
					stack.push(current.right);
				else
				{
					stack.pop();
					list.add(current.d);
				}
			}
			
				else if(current.left == prev)
				{
					if(current.right != null)
						stack.push(current.right);
				else
				{ 
					stack.pop();
					list.add(current.d);
				}
			}
			
				else if(current.right ==  prev)
				{
					stack.pop();
					list.add(current.d);
				}
				prev = current;
			}
		return list;
		}
	
	public static void main(String  args[])
	{
		NR_POSTORDER tree = new NR_POSTORDER();
		tree.root = new PtNode(2);
		tree.root.left = new PtNode(4);
		tree.root.right = new PtNode(6);
		tree.root.left.left = new PtNode(8);
		tree.root.left.right = new PtNode(9);
		tree.root.right.left = new PtNode(10);
		tree.root.right.right = new PtNode(15);
		
		ArrayList<Integer> mylist = tree.postOrder(tree.root);
		System.out.println("After Postorder Traversal");
		System.out.println(mylist);
	}
}
