package 剑指offer66;

public class 树_前序中序重建二叉树 {
	public class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) {
			this.val=x;
		}
	}
	public class solution{
		public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
	        TreeNode node = reConstructBinaryTree(pre,0, pre.length-1,in,0,in.length-1);
	        return node;
	    }
		private TreeNode reConstructBinaryTree(int[] pre, int prestart, int preend,int[] in, int instart, int inend) {
			//递归退出条件如果开始大于结束的位置 直接退出 子叶结点为NULL
			if(prestart>preend||instart>inend) {
			return null;
			}
			//根节点 为先序遍历第一个结点
			TreeNode root = new TreeNode(pre[prestart]);
			//遍历中序遍历， 
			for(int i = instart; i<=inend; i++) 
				if (in[i]==pre[prestart]) {
					//结合前序遍历  中序遍历的根节点左边 为 该子树的左子树 ， 右边 为 子树的右子树
					//根据 i的值 和 前中序位置 确定 左子树 在 前序的范围，   和在中序的范围
					root.left=reConstructBinaryTree(pre,prestart+1,i-instart+prestart,in,instart,i-1);
					//根据 i的值 和 前中序位置 确定 右子树 在 前序的范围，   和在中序的范围
					root.right =reConstructBinaryTree(pre,i-instart+prestart+1,preend,in,i+1,inend);
				}	
			//匹配结束 跳出循环 范围该子树 根节点
			return root;
			
		
		}
	}
}
