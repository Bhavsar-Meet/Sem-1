import java.util.*;

public class Que_4_2
{
	static BinaryTreeNode buildMinimalTree(int[] array)
	{
		if(array.length == 0){
			return null;}
		return recursivebuildMinimalTree(array,0,array.length-1);
	}

	static BinaryTreeNode recursivebuildMinimalTree(int[] array , int start , int end)
	{
		if(end<start){
			return null;}
		int mid = (end+start)/2;
		BinaryTreeNode node = new BinaryTreeNode(array[mid]);
		node.left = recursivebuildMinimalTree(array,start,mid-1);
		node.right = recursivebuildMinimalTree(array,mid+1,end);
		return node;
	}

	public static void main(String[] args)
	{
		int[] array = {12,34,56,78,223,423,878,2311,6565,32322,45456};
		BinaryTreeNode result = buildMinimalTree(array);
		BinaryTreeNode.inorderTraversal(result);
	}
}
