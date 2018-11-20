package 剑指offer66;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
/*
 * 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 * 
 */
public class 树_按层打印二叉树 {
	public class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;

	    public TreeNode(int val) {
	        this.val = val;

	    }

	}
	public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
		//申请一个队列 先进后出
		Queue<TreeNode> tmp = (Queue<TreeNode>) new LinkedList<TreeNode>();
		ArrayList<Integer> res= new ArrayList<Integer>();
		//第一个出口条件
		if (root==null) return res;
		//把root加入队列 
		tmp.add(root);
		//如果队列不空， 把 队列内的值取出来 ，加入结果res ，并且把该结点的子节点放入队列
		while(!tmp.isEmpty()) {
			TreeNode root1 = tmp.poll();
			res.add(root1.val);
			if(root1.left!=null) tmp.add(root1.left);
			if(root1.right!=null)tmp.add(root1.right);
		}
		return res;
	        
	    }
	
		
	}

