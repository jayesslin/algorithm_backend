package 剑指offer66;

import java.util.ArrayList;
import java.util.Collections;
/*
 * 输入一个字符串,按字典序打印出该字符串中字符的所有排列。
 * 例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
 * 参考图片  字符串排列组合.png
 * 
 */
public class 字符串_字符串排列 {
	ArrayList<String> res = new ArrayList<String>();   
	public ArrayList<String> Permutation(String str) {
			if(str != null && str.length()>0) {
				pp(str.toCharArray(),0);
				Collections.sort(res); 
			}
			return res;
    }
	public void  pp(char[] cs, int i ){
		if(i == cs.length-1) {
			if (!res.contains(String.valueOf(cs))) {
			res.add(String.valueOf(cs));
			}
		}else {
			for (int j=i;j<cs.length;j++) {
				//交换第一次 之后递归
				swap(cs,i,j);
				pp(cs,i+1);
				//递归结束后 交换回来 ， 回溯法
				swap(cs,i,j);
			}
		}
	}
	public void swap(char[] cs,int i,int j ) {
		char temp = cs[i];
		cs[i]=cs[j];
		cs[j]=temp;
	}
	//test 
	public static void main(String args[]) {
		/*ArrayList<String> a = new ArrayList<String>();
		a.add("dca");a.add("cad");a.add("acb");a.add("abc");
		Collections.sort(a);
		for(String res : a) {
			System.out.println(res);
		}*/
		字符串_字符串排列 kk= new 字符串_字符串排列();
		String str = "abc";
		ArrayList<String> res = new ArrayList<String>();
		res = kk.Permutation(str);
		for(String a : res) {
			System.out.println(a);
		}
	}
}
