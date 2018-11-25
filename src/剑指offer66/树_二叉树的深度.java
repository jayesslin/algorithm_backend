package 剑指offer66;


/*
 * 输入一棵二叉树，求该树的深度。从根结点到叶结点依次经过的结点（含根、叶结点）形成树的一条路径，最长路径的长度为树的深度。
 */
public class 树_二叉树的深度 {
	public class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) {
			this.val=x;
		}
	}
	 public int TreeDepth(TreeNode root) {
	        if(root==null) return 0;
	        return Math.max(1+TreeDepth(root.left),1+TreeDepth(root.right));
	    }
}
