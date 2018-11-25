package 剑指offer66;
/*
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
 * 
 */
import model.TreeNode;
public class 树_判定是否是后序遍历 {
	public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence.length==0) return false;
        if(sequence.length==1) return true;
        return judge(sequence,0,sequence.length-1);
    }
	public boolean judge(int[] x, int s,int e) {
		if(s>=e) return true;
		int i =s;
		while(x[i]<x[e]) {
			++i;
		}
		for(int j = i ; j<e;j++) {
			if(x[j]<x[e]) {
				return false;
			}
		}
		return judge(x,s,i-1)&&judge(x,i,e-1);
	}
}
	/* 失败方法
	 * 思路
	 * 1. 找到root 后序是最后一个
	 * 2. 遍历左子树区， 找到第一个大于root的数
	 * 3. 遍历大于数右边的树 当遇到比root小的 返回false 
	 * 4.  递归左右子树 用1 ，2，3，
	 */
	/*public boolean VerifySquenceOfBST(int [] sequence ) {
		if(sequence==null) return true;
		int[] a = null,b=null;
		boolean res= true;
        int i = sequence[0];
        //左子树遍历初始点
        int x = sequence[0];
        int temp=0; 
        int pivot = sequence[sequence.length-1];
        for(;i<sequence.length-2;i++) {
        	if(sequence[i]>pivot) {
        		temp=i;
        		for (int j = temp;j<sequence.length-2;j++) {
                	if(sequence[j]<pivot) {
                		res = false;
                		break;
                	}
                }
        		break;
        	}
        }
        if(x!=0){
        //左子树
	        for(;x<temp;x++  ) {
	        	a[x]=sequence[x];
	        }
        }
        if(temp!=0) {
        //右子树
	        for(;temp<sequence.length-2;temp++) {
	        	b[temp]=sequence[temp];
	        }
        }
        res= VerifySquenceOfBST(a)&&VerifySquenceOfBST(b);
        
		return res;
    }*/

