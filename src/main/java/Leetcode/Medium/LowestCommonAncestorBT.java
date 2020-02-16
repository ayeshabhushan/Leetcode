package Leetcode.Medium;


public class LowestCommonAncestorBT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) 
	{
		// If leaf node is reached, return null.
		// If either of p or q is a root, this is a LCA, return it 
		if (root == null || root == p || root == q) 
			return root;

		// Find out LCA in LST
		TreeNode lcaInLeftSubTree = lowestCommonAncestor(root.left, p, q);

		// Find out LCA in RST
		TreeNode lcaInRightSubTree = lowestCommonAncestor(root.right, p, q);

		//result
		if(lcaInLeftSubTree == null) {
			return lcaInRightSubTree;
		}
		else if(lcaInRightSubTree == null) {
			return lcaInLeftSubTree;
		}
		else { //both left and right are not null, we found our result
			return root;
		}
			
	}

}
