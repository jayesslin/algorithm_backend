package 剑指offer66;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;



public class 树_按层打印 {
	public class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;

	    public TreeNode(int val) {
	        this.val = val;
	    }
	public  ArrayList<ArrayList<Integer>> bianli(TreeNode root) {
		ArrayList<ArrayList<Integer>>  res = new ArrayList<ArrayList<Integer>> ();
        if(root==null) return res;
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		ArrayList<Integer> layer = new ArrayList<Integer>();
		queue.add(root);
		//计数器
		int start = 0 ,end =1;
		while (!queue.isEmpty()) {
			TreeNode r= queue.remove();
			layer .add(r.val);
			start++;
			if(r.left!=null) {
			queue.add(r.left);
			}
			if(r.right!=null) {
			queue.add(r.right);
			}
			//遍历一层结束后 ， 加入res 数列。 重置计数器
			if(start==end) {
				end= res.size();
				start= 0;
				res.add(layer);
				layer = new ArrayList<Integer>();
			}
		}
		return res;
  }
	  
	}
}