package 剑指offer66;

import java.util.Stack;

/*
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数（时间复杂度应为O（1））。
 * 
 */
public class 栈_包含min函数的栈 {
	public class Solution {
		Stack<Integer> re = new Stack<Integer>();
		Stack<Integer> min = new Stack<Integer>();
		int mintmp= Integer.MAX_VALUE;
		public void push(int node) {
	    	re.push(node);
	        //只有node小于mintmp才能入栈， 并且把mintmp设为当前node值 
	    	// 正常压入栈 re = 3 4 5 2 5 1
	    	// 最小栈为 Min = 3 3 3 2 2 1 
	    	if(node<mintmp) {
	        	mintmp=node;
	        	min.push(node);
	        }else {
	        	min.push(mintmp);
	        }
	    }
	    //需要随时出栈 并且调整最小栈的元素关系
	    public void pop() {
	        re.pop();
	        min.pop();
	    }
	    public int top() {
	        return re.peek();
	    }
	    public int min() {
	        return min.peek();
	    }
	}
}
