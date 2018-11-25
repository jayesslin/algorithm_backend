package 剑指offer66;

import java.util.ArrayList;

/*
 * 输入一颗二叉树的跟节点和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
 * 路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
 * (注意: 在返回值的list中，数组长度大的数组靠前)
 */

public class 树_二叉树中和为某一值的路径 {
	public class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) {
			this.val=x;
		}}
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		
		public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
			if(root==null) return res;
			list.add(root.val);
			target -=root.val;
			if(target==0&&root.left==null&&root.right==null) res.add(new ArrayList<Integer>(list));
			FindPath(root.left,target);
			FindPath(root.right,target);
			list.remove(list.size()-1);
			return res;
	    }
	//找到所有  DFS  遍历结束后 退回到上一个点  用移除list表 最后一个元素的操作。
		/*
		 * 深度遍历的思想： 走完这个结点 删除当前结点  返回
		 */
	public ArrayList<ArrayList<Integer>> findall(TreeNode root, int p){
		if(root==null) return res;
		list.add(root.val);
		p -=root.val;
		if(p==0&&root.left==null&&root.right==null) res.add(new ArrayList<Integer>(list));
		findall(root.left,p);
		findall(root.right,p);
		list.remove(list.size()-1);
		return res;
	}
	
	//可能找到一条 和为x的数组
		public void cal(TreeNode root,int p, ArrayList<Integer> list ) {

			if(root.val<p) {
				if(root.left!=null) {	
					cal(root.left, p-root.val,list);
					list.add(root.val);
				} 
				if(root.left!=null) {
					cal(root.right, p-root.val,list);
					list.add(root.val);
				}
			}
			if(root.val==p) list.add(root.val);
			
		}
}
