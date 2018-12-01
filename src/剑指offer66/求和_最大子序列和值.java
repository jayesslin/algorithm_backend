package 剑指offer66;
/*
 * HZ偶尔会拿些专业问题来忽悠那些非计算机专业的同学。今天测试组开完会后,
 * 他又发话了:在古老的一维模式识别中,常常需要计算连续子向量的最大和,当向量全为正数的时候,问题很好解决。
 * 但是,如果向量中包含负数,是否应该包含某个负数,并期望旁边的正数会弥补它呢？例如:{6,-3,-2,7,-15,1,2,2},
 * 连续子向量的最大和为8(从第0个开始,到第3个为止)。给一个数组，返回它的最大连续子序列的和，
 * 你会不会被他忽悠住？(子向量的长度至少是1)
 */
public class 求和_最大子序列和值 {
	public int FindGreatestSumOfSubArray1(int[] array) {
		  	int res=array[0]; 
	        for(int i =1; i< array.length ; i++) {
	        	 for(int j =i+1 ; j< array.length ; j++) {
	 	        	 array[i]+=array[j];
	        		res = Math.max(res, array[i]);
	 	        }
	        }
	        return res;
	    }
	
	// 动态规划解法 ， 思想  一个连续子序列 ， 如果前面i-1个元素 和不是负数 ，到你这个正数 ， 相之和肯定比你本身大。
	public int FindGreatestSumOfSubArray(int[] array) {
			int res = array[0]; //记录当前所有子数组的和的最大值
			int max=array[0];   //包含array[i]的连续数组最大值
			for (int i = 1;  i <array.length ; i++) {
				//如果前面i-1个元素 和不是负数 ，到你这个正数 ， 相之和肯定比你本身大。
				max =  Math.max(max+ array[i],array[i]);
				//维持最大数组和的结果
				res = Math.max(max, res);
		}
		return res; 
	}
	
	public static void main(String[] args) {
		int[] a = {6,-3,-2,7,-15,1,2,2};
		求和_最大子序列和值 x= new  求和_最大子序列和值();
		System.out.println(x.FindGreatestSumOfSubArray(a));
	}
}
