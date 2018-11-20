package 剑指offer66;

import 剑指offer66.树_前序中序重建二叉树.TreeNode;

/*
 * 输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
 */
public class 树_树的子结构 {
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
    	//设置标识符 因为一旦匹配成功result就设为true，
    	//剩下的代码不会执行，如果匹配不成功，默认返回false
    	boolean res = false;
    	
    	if (root1 != null && root2!=null) {
			if (root1.val==root2.val) {
		    	res =  HasSameNode(root1, root2);
		    }
			if(!res) {
				//递归此方法 把子树移到主树左侧
				res = HasSubtree(root1.left, root2);
			}
			if(!res) {
				//递归此方法 把子树移到主树右侧
				res= HasSubtree(root1.right, root2);
			}
    	}   
		return res;
    }
    public boolean HasSameNode(TreeNode root1,TreeNode root2) {
    	if (root1 ==null && root2 !=null) return false;
    	if (root2==null) return true;
    	//错误  ， 如果2树 为空 说明 2树遍历结束 。
    	//else if (root1 !=null && root2 ==null) return false;
    	//千万注意 这里是比较值！！！！！
    	if (root1.val!=root2.val) return false ;
    	return HasSameNode(root1.left,root2.left) && HasSameNode(root1.right,root2.right);
    }
}
