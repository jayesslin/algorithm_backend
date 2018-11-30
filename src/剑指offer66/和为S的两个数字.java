package 剑指offer66;
/*
 * 输入一个递增排序的数组和一个数字S，在数组中查找两个数，使得他们的和正好是S，如果有多对数字的和等于S，输出两个数的乘积最小的。
 */

import java.util.ArrayList;
import java.util.HashMap;



public class 和为S的两个数字 {
	public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
		HashMap<Integer, Integer> res = new HashMap<Integer, Integer>();
		ArrayList<Integer> re = new ArrayList<Integer>();
		for(int i = 0;i< array.length;i++) {
        	res.put(array[i], sum-array[i]);
        }
		for(int i = 0 ;i<array.length;i++) {
			if(res.containsValue(array[i])) {
				re.add(array[i]);
				re.add(sum-array[i]);
				break;
			}
		}
		return re;
    }
	public static void  main(String[] args){
		int [] array = {1,2,3,4,5,6,7,8,9};
		int sum = 9;
		
	}
}
