package 剑指offer66;

import java.util.ArrayList;

public class 快速排序 {
	public static int partition(int[] a , int p, int q ) {
		int i = p;
		for(int j=p+1; j<=q; j++) {
			if (a[j]<a[p]) {
				i += 1;
				int temp = a[i];
				a[i] = a[j];
				a[j] =temp;
			}
		}
		int temp = a[i];
		a[i] = a[p];
		a[p]=  temp;
		return i;
	}
	public static void quick(int[] a , int p, int r) {
		if(p<r) {
			int q = partition(a,p,r);
			quick(a,p,q-1);
			quick(a,q+1,r);
		}
	}
	public static ArrayList<Integer> findk(int[] a, int k ){
		ArrayList<Integer> res = new ArrayList<Integer>();
		quick(a,0,a.length-1);
		for(int i = 0 ; i <k; i ++) {
			res.add(a[i]);
		}
		return res; 
	}
	public static void main(String args[]) {
		int [] a = {4,5,1,6,2,7,3,8};
		ArrayList<Integer> res = findk(a,4);
		for(int i: res) {
			System.out.println(i);
		}
	}
}
