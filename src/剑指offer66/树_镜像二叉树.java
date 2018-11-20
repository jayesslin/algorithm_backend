package 剑指offer66;

import 剑指offer66.树_前序中序重建二叉树.TreeNode;

/*
 * 题目描述
操作给定的二叉树，将其变换为源二叉树的镜像。
输入描述:
二叉树的镜像定义：源二叉树 
    	    8
    	   /  \
    	  6   10
    	 / \  / \
    	5  7 9 11
    	镜像二叉树
    	    8
    	   /  \
    	  10   6
    	 / \  / \
    	11 9 7  5
 */
public class 树_镜像二叉树 {
	 public void Mirror(TreeNode root) {
	       if (root!=null) { 
	       TreeNode tmp = root.left; 
	       root.left =  root.right;
	       root.right =  tmp;
	       Mirror(root.left);
	       Mirror(root.right);
	       }
	    }
	 
}
