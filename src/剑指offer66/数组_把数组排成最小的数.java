package 剑指offer66;

import java.util.Arrays;
import java.util.Comparator;

public class 数组_把数组排成最小的数 {
	public String PrintMinNumber(int [] numbers) {
		String[] x = new String [numbers.length];	
		StringBuffer res =new StringBuffer();
		for(int i = 0; i<numbers.length;i++) {
				x[i] = String.valueOf(numbers[i]);
			}
		Arrays.sort(x, new Comparator<String>(){
			//制定排序规则，  32 ，和 3 比较    323 小于 332 ， 所以 3 大于 32  排在后面
			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				String c1 = o1 + o2 ;
				String c2 = o2 + o1;
				return c1.compareTo(c2);
			}
			
		});
		for (int i = 0; i<numbers.length;i++) {
			res .append( String.valueOf(x[i]));
		}
		return res.toString();
		
    }
	
	public static void main(String args[]) {
		int[] a = {3,32,321};
		数组_把数组排成最小的数 x= new 数组_把数组排成最小的数();
		System.out.println(x.PrintMinNumber(a));
	}
}
