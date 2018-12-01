package 剑指offer66;

import java.util.HashMap;
import java.util.Map.Entry;

/*数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。由于数字2在数组中出现了5次，
超过数组长度的一半，因此输出2。如果不存在则输出0。*/
public class 数组_数组中出现次数超过一半的数字 {
	 public int MoreThanHalfNum_Solution(int [] array) {
	        int res = 0 ;
	        int mid = array.length >>1 ;
	        HashMap<Integer,Integer> tmp = new HashMap();
	        for(int i =0 ; i<array.length; i++) {
	        	if(tmp.containsKey(array[i])) {
	        		tmp.put(array[i],tmp.get(array[i])+1);
	        	}else {
	        		tmp.put(array[i], 1);
	        	}
	        }
	        for(Entry<Integer, Integer> e : tmp.entrySet()) {
	        	if(e.getValue() > mid ) res=e.getKey();
	        }
	        return res;
	    }
	 //方法2 ， 排序后， 数组的中位数的数A A的个数大于 数组一半 就是
	 public static void main (String[] args) {
		 数组_数组中出现次数超过一半的数字 x = new 数组_数组中出现次数超过一半的数字();
		 int[] a = {1,2,3,2,2,2,5,4,2};
		 System.out.println(x.MoreThanHalfNum_Solution(a));
	 }
}
