package 剑指offer66;
/*
 * 
 * 直接调用API
 * 
 * */
public class 位运算_二进制中1的个数 {
	 public static int NumberOf1(int n) {
		 	return Integer.bitCount(n);
	    }
	 public static void main(String args[]) {
		 System.out.println(NumberOf1(2));
	 }
}
