public class BinaryTreeNode
{
	Object data;
	BinaryTreeNode left;
	BinaryTreeNode right;

	public BinaryTreeNode(Object o)
	{
		data = o;
		left = null;
		right = null;
	}

	static void inorderTraversal(BinaryTreeNode node)
	{
		if(node == null){
			return;}
		inorderTraversal(node.left);
		System.out.println(node.data);
		inorderTraversal(node.right);
	}
}
