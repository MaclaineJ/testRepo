/**
 * Class for the Tree Node object that contains data, as well as the TreeNode's parent and children
 * @author Nick Johnson
 * @version 10/29/18
 *
 */
public class TreeNode {
	//instance variable for the data the tree node contains
	private int data;
	//instance variable for the parent node of the tree node
	private TreeNode parent;
	//instance variable for the left child node of the tree node
	private TreeNode leftChild;
	//instance variable for the right child node of the tree node
	private TreeNode rightChild;

	/**
	 * Constructor for the TreeNode object
	 * @param newData The data the TreeNode object will hold
	 */
	public TreeNode(int newData)
	{
		setData(newData);
		setLeftChild(null);
		setRightChild(null);
	}

	/**
	 * The getter method for the parent of the TreeNode
	 * @return the parent of the TreeNode
	 */
	public TreeNode getParent() {
		return parent;
	}
	
	/**
	 * The setter method for the parent of the TreeNode
	 * @param newParent the parent of the TreeNode
	 */
	public void setParent(TreeNode newParent) {
		parent = newParent;
	}
	
	/**
	 * The getter for the left child node of the TreeNode
	 * @return the left child node of the TreeNode
	 */
	public TreeNode getLeftChild() {
		return leftChild;
	}
	
	/**
	 * The setter for the left child node of the TreeNode
	 * @param newLeftChild the left child node of the TreeNode
	 */
	public void setLeftChild(TreeNode newLeftChild) 
	{
		leftChild = newLeftChild;
		if (newLeftChild != null)
			newLeftChild.setParent(this);
	}
	
	/**
	 * The getter for the right child node of the TreeNode
	 * @return the right child node of the TreeNode
	 */
	public TreeNode getRightChild() {
		return rightChild;
	}
	
	/**
	 * The setter for the right child node of the TreeNode
	 * @param newLeftChild the right child node of the TreeNode
	 */
	public void setRightChild(TreeNode newRightChild) {
		rightChild = newRightChild;
		if (newRightChild != null)
		{
			newRightChild.setParent(this);
		}
	}
	
	/**
	 * The getter for the data of the TreeNode
	 * @return the data of the TreeNode
	 */
	public int getData()
	{
		return data;
	}
	
	/**
	 * The setter for the data of the TreeNode
	 * @param newData the data of the TreeNode
	 */
	public void setData(Integer newData)
	{
		data = newData;
	}




}

