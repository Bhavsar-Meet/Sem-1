import java.util.*;

public class Que_4_4
{

	public static boolean checkBalance(BinaryTreeNode head)
	{
		if(head == null)
			return true;
		return recursivecheckBalance(head)!=Integer.MIN_VALUE;
	}

	public static int recursivecheckBalance(BinaryTreeNode node)
	{
		if(node == null)
			return -1;
		int leftheight = recursivecheckBalance(node.left);
		int rightheight = recursivecheckBalance(node.right);
		if(leftheight == Integer.MIN_VALUE || leftheight == Integer.MIN_VALUE || Math.abs(leftheight - rightheight) > 1)
			return Integer.MIN_VALUE;
		return Math.max(leftheight,rightheight) + 1;
	}

	public static void main(String[] args)
	{
		BinaryTreeNode node0 = new BinaryTreeNode(0);
		BinaryTreeNode node1 = new BinaryTreeNode(1);
		BinaryTreeNode node2 = new BinaryTreeNode(2);
		BinaryTreeNode node3 = new BinaryTreeNode(3);
		BinaryTreeNode node4 = new BinaryTreeNode(4);
		BinaryTreeNode node5 = new BinaryTreeNode(5);
		BinaryTreeNode node6 = new BinaryTreeNode(6);
		BinaryTreeNode node7 = new BinaryTreeNode(7);

		node0.left = node1;node0.right=node3;
		node1.right = node2;
		node3.left = node4;node3.right = node7;
		node4.left = node5;node4.right = node6;

		System.out.println(checkBalance(node0));
	}
}