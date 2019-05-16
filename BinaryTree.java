/**
 * Class for a Binary Tree object that has different methods for traversing the tree 
 * @author Nick Johnson
 * @version 10/29/18
 *
 */
public class BinaryTree {
	//instance variable for the top Node of the Binary Tree
	private TreeNode rootNode;
	
	/**
	 * The default constructor for the Binary Tree object that sets the root node to null
	 */
	public BinaryTree()
	{
		setRootNode(null);
	}
	
	/**
	 * constructor for the Binary Tree 
	 * @param newRootNode the top node of the Binary Tree
	 */
	public BinaryTree(TreeNode newRootNode)
	{
		setRootNode(newRootNode);
	}
	
	/**
	 * The setter for the root node of the binary tree
	 * @param newRootNode the node that should be set as the new root node of the binary tree
	 */
	public void setRootNode(TreeNode newRootNode)
	{
		rootNode = newRootNode;
	}
	
	/**
	 * The getter for the root node of the binary tree
	 * @return the root node of the binary tree
	 */
	public TreeNode getRootNode()
	{
		return rootNode;
	}
	
	/**
	 * Method that traverses the binary tree inorder, and prints out the data of each Node that is visited
	 * @param currentNode The root node of the binary tree that the traverse should start from
	 */
	public void inorderTraversal(TreeNode currentNode)
	{
		if (currentNode == null)
			return;
		inorderTraversal(currentNode.getLeftChild());
		System.out.println(currentNode.getData() + " ");
		inorderTraversal(currentNode.getRightChild());
	}
	
	/**
	 * Method that traverses the binary tree preorder, and prints out the data of each Node that is visited
	 * @param currentNode The root node of the binary tree that the traverse should start from
	 */
	public void preorderTraversal(TreeNode currentNode)
	{
		if (currentNode == null)
			return;
		System.out.println(currentNode.getData() + " ");
		preorderTraversal(currentNode.getLeftChild());
		preorderTraversal(currentNode.getRightChild());
	}
	
	/**
	 * Method that traverses the binary tree postorder, and prints out the data of each Node that is visited
	 * @param currentNode The root node of the binary tree that the traverse should start from
	 */
	public void postorderTraversal(TreeNode currentNode)
	{
		if (currentNode == null)
			return;
		postorderTraversal(currentNode.getLeftChild());
		postorderTraversal(currentNode.getRightChild());
		System.out.println(currentNode.getData() + " ");
	}
	
	/**
	 * A method that calculates the height of the binary tree recursively
	 * @param currentNode The root node of the binary tree that we should calculate the height from
	 * @return The height of the binary tree
	 */
	public int getHeightOfTree(TreeNode currentNode)
	{
		if (currentNode == null)
			return -1;
		else if (getHeightOfTree(currentNode.getLeftChild()) > getHeightOfTree(currentNode.getRightChild()))
			return 1 + getHeightOfTree(currentNode.getLeftChild());
		else 
			return 1 + getHeightOfTree(currentNode.getRightChild());
	}
	
	/**
	 * A method that calculates how many nodes are in the tree recursively
	 * @param currentNode the root node of the binary tree that we should calculate the number of nodes from
	 * @return the number of nodes in the binary tree
	 */
	public int countNumberOfNodes(TreeNode currentNode)
	{
		if (currentNode == null)
			return 0;
		else 
			return 1 + countNumberOfNodes(currentNode.getLeftChild()) + countNumberOfNodes(currentNode.getRightChild());
	}
	
	public int searchRecursive(TreeNode currentNode, int item)
	{
		if (currentNode == null)
			return -1;
		if (currentNode.getData() == item)
			return currentNode.getData();
		if (item > currentNode.getData())
			return searchRecursive(currentNode.getRightChild(), item);
		else
			return searchRecursive(currentNode.getLeftChild(), item);
	}
	
	public TreeNode iterativeSearch(TreeNode currentNode, int dataToFind)
	{
		TreeNode iterator = currentNode;
		while (iterator != null)
		{
			if (iterator.getData() == dataToFind)
				return iterator;
			if (dataToFind > iterator.getData())
				iterator = iterator.getRightChild();
			else
				iterator = iterator.getLeftChild();
		}
		return null;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
