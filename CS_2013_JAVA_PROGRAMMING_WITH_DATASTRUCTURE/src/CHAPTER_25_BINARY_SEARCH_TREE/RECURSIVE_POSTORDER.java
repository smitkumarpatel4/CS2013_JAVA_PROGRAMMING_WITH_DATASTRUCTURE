package CHAPTER_25_BINARY_SEARCH_TREE;
//1. (2 pts) Implement Recursive Post-Order for the Binary Search Tree

import java.util.Stack;
public class RECURSIVE_POSTORDER {

	public static class TreeNode
	{
		int data;
		TreeNode left;
		TreeNode right;
		TreeNode(int data)
		{
			this.data=data;
		}
	}
 
	// Recursive Solution
	public void postOrder(TreeNode root) {
		if(root !=  null) {
			postOrder(root.left);
			postOrder(root.right);
			//Visit the node by Printing the node data  
			System.out.printf("%d ",root.data);
		}
	}
 
	
	public static void main(String[] args)
	{
		RECURSIVE_POSTORDER bi=new RECURSIVE_POSTORDER();
		// Creating a binary tree
		TreeNode rootNode=createBinaryTree();
		System.out.println("Using Recursive solution:");
 
		bi.postOrder(rootNode);
	}
 
	public static TreeNode createBinaryTree()
	{
 
		TreeNode rootNode =new TreeNode(40);
		TreeNode node20=new TreeNode(20);
		TreeNode node10=new TreeNode(10);
		TreeNode node30=new TreeNode(30);
		TreeNode node60=new TreeNode(60);
		TreeNode node50=new TreeNode(50);
		TreeNode node70=new TreeNode(70);
 
		rootNode.left=node20;
		rootNode.right=node60;
 
		node20.left=node10;
		node20.right=node30;
 
		node60.left=node50;
		node60.right=node70;
 
		return rootNode;
	}	
}