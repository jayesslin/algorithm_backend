package 模块练习;

import java.util.ArrayList;

public class 遍历一个整数 {
	static void bianliInt(int n) {
		ArrayList<Integer> x = new ArrayList<Integer>();
		while (n> 0) {
			 x.add(n%10);
			 n = n /10;
		 }
		for(int i = 0 ; i<x.size() ;i++) {
			System.out.println(x.get(i));
		}
		 
	}
	public static void main(String[] args) {
		bianliInt(23151);
	}
}
