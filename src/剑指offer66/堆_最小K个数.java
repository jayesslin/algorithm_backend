package 剑指offer66;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

/*
 * 输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。
 * 优先队列 
 * 最大的比 后面的 小
 */
public class 堆_最小K个数 {
	public  ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
		ArrayList<Integer> res = new  ArrayList<Integer>();
		if(input.length<k || k==0)  return res; 
		
		PriorityQueue<Integer> x = new PriorityQueue<Integer>(k, new Comparator<Integer>() {
			@Override
			//最大堆生成器是 o2 到 o1  ， 最小堆是 o1到 o2
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
		            }
			        });
		for(int i=0;i<k;i ++) {
			x.add(input[i]);
		}
		for(int i = k; i<input.length;i++ ) {
			if(x.peek()>input[i]) {
				x.poll();
				x.add(input[i]);
			}
		}
		for (Integer a : x) {
			res.add(a);
		}
		return res;
	}
}
