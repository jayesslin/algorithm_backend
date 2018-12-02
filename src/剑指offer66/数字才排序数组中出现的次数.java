package 剑指offer66;

import java.util.HashMap;
import java.util.HashSet;

/*
 * 统计一个数字在排序数组中出现的次数。
 */
public class 数字才排序数组中出现的次数 {
	  public int GetNumberOfK(int [] array , int k) {
	    
	     int res = 0 ;
		  for(int i=0; i<array.length ; i++) {
	    	 int n = array[i];
	    	 while (n>0) {
	    		 int y = n % 10;
	    		 /*if(x.containsKey(y)) {
	    			 x.put(y, x.get(y)+1);
	    		 }else {
	    			 x.put(y, 1);
	    		 }*/
	    		 if (y == k ) {
	    			 res ++;
	    		 }
	    		 n = n/10;
	    	 }
	     }
		  return res;
	    }
	  public static void main(String  args[]) {
		  数字才排序数组中出现的次数 x = new 数字才排序数组中出现的次数 ();
		  int[]a = {3,33,4,3,23,2323};
		  int s = x.GetNumberOfK(a, 3);
		  System.out.println(s);
	  }
}
