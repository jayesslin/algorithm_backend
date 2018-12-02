package 剑指offer66;
/*
 * 求出1~13的整数中1出现的次数,并算出100~1300的整数中1出现的次数？
 * 为此他特别数了一下1~13中包含1的数字有1、10、11、12、13因此共出现6次,但是对于后面问题他就没辙了。
 * ACMer希望你们帮帮他,并把问题更加普遍化,可以很快的求出任意非负整数区间中1出现的次数（从1 到 n 中1出现的次数）。
 */
public class 整数中1出现的次数 {
	public int NumberOf1Between1AndN_Solution(int n) {
        int res = 0 ;
        for(int i=0; i<=n ; i++) {
	    	int temp = i; 
        	while (temp>0) {
	    		 int y = temp % 10;
	    		 if (y == 1 ) {
	    			 res ++;
	    		 }
	    		 temp = temp/10;
	    	 }
    	 }  return res;
     }
	public static void main(String  args[]) {
		整数中1出现的次数 x = new 整数中1出现的次数();
		  int[]a = {3,33,4,3,23,2323};
		  int s = x.NumberOf1Between1AndN_Solution(13);
		  System.out.println(s);
	  }
}

