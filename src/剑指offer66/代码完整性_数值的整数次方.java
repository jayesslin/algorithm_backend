package 剑指offer66;
/*
 * 
 * 需要考虑  负数的指数
 * 
 * */
public class  代码完整性_数值的整数次方 {
	public static double Power(double base, int exponent) {
        double result = base ;	
		for(int i =1; i<Math.abs(exponent);i++) {
        		result = result * base ; 
        	}
		if(exponent< 0 ) result  = 1 / result;
        	return result;
	  }
	public static void main(String args[]) {
		 System.out.println(Power(-2,-1));
	 }
}
