import java.util.*;

public class Que_4_3
{
	public static ArrayList<LinkedList<BinaryTreeNode>> listOfDepths(BinaryTreeNode head)
	{
		ArrayList<LinkedList<BinaryTreeNode>> resultList = new ArrayList<LinkedList<BinaryTreeNode>>();
		if(head == null)
			return resultList;

		LinkedList<BinaryTreeNode> current = new LinkedList<BinaryTreeNode>();

		Queue<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();

		queue.add(head);
		queue.add(null);

		while(!queue.isEmpty())
		{
			BinaryTreeNode node = queue.remove();
			if(node == null){
				resultList.add(current);
				current = new LinkedList<BinaryTreeNode>();
				if(!queue.isEmpty())
					queue.add(null);
			}
			else{
				current.add(node);
				if(node.left != null) queue.add(node.left);
				if(node.right != null) queue.add(node.right);
			}
		}
		return resultList;
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

		ArrayList<LinkedList<BinaryTreeNode>> mylist = listOfDepths(node0);
		System.out.println(mylist.get(2).size());
	}
}