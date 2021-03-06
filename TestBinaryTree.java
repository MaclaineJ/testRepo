
public class TestBinaryTree {

	/**
	 * Populating the tree with a set of nodes in order
	 * @return The root node
	 */
	public static TreeNode populateTree()
	{
		int [] arrayOfNum = {7, 3, 11, 1, 5, 9, 13, 0, 2, 4, 6, 8, 10, 12, 14};

		TreeNode [] arrayOfNodes = new TreeNode[15];
		for (int i = 0; i < 15; i++)
		{
			arrayOfNodes[i] = new TreeNode(arrayOfNum[i]);
		}
		for (int i = 0; i < 7; i++)
		{
			arrayOfNodes[i].setLeftChild(arrayOfNodes[2*i+1]);
			arrayOfNodes[i].setRightChild(arrayOfNodes[2*i+2]);
		}
		return arrayOfNodes[0];
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.setRootNode(populateTree());
		System.out.println("Inorder Traversal: ");
		tree.inorderTraversal(tree.getRootNode());
		System.out.println("\nPredorder Traversal: ");
		tree.preorderTraversal(tree.getRootNode());
		System.out.println("\nPostdorder Traversal: ");
		tree.postorderTraversal(tree.getRootNode());
		System.out.println("The height of the tree is: " + tree.getHeightOfTree(tree.getRootNode()));
		System.out.println("The number of nodes in the tree is: " + tree.countNumberOfNodes(tree.getRootNode()));
		TreeNode test = new TreeNode(tree.iterativeSearch(tree.getRootNode(), 26).getData());
		System.out.println(test.getData());
	}

}
