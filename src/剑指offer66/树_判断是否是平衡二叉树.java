package ½£Ö¸offer66;

import model.TreeNode;

public class Ê÷_ÅÐ¶ÏÊÇ·ñÊÇÆ½ºâ¶þ²æÊ÷ {
	public class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;

	    public TreeNode(int val) {
	        this.val = val;
	    }
	public boolean IsBalanced_Solution(TreeNode root) {
		if(root==null) return true;
		return max(root)-min(root)>1 ? false: true;
    }
	public int max(TreeNode root) {
		if(root==null) return 0;
		return Math.max(1+max(root.left), 1+max(root.right));
	}
	public int min(TreeNode root) {
		if(root==null) return 0;
		return Math.min(1+max(root.left), 1+max(root.right));
	}
}
}
