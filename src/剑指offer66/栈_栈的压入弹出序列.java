package 剑指offer66;

import java.util.Stack;
/*
 * 输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否可能为该栈的弹出顺序。
 * 假设压入栈的所有数字均不相等。例如序列1,2,3,4,5是某栈的压入顺序，序列4,5,3,2,1是该压栈
 * 序列对应的一个弹出序列，但4,3,5,1,2就不可能是该压栈序列的弹出序列。（注意：这两个序列的长度是相等的）
 */
public class 栈_栈的压入弹出序列 {
	public static boolean IsPopOrder(int [] pushA,int [] popA) {
	    if(pushA.length==0||popA.length==0) {return false;}
	    if(pushA.length!=popA.length) {return false;}
		int i =0 ;
	    int j =popA.length-1;
	    boolean res = true;
		while (i<pushA.length-1) {
	    	  if(pushA[i++]!=popA[j--]) { res= false;} 
	      }
	     return res;
    }
	public static void main(String args[]) {
		int[] a= {};
		int[] b= {1,2};
		System.out.println(IsPopOrder(a,b));
	}
}
