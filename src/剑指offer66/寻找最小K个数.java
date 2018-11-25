package 剑指offer66;

import java.util.ArrayList;

public class 寻找最小K个数 {
	public static int partition(int[] a, int p ,int q) {
		int pivot = a[p];
		int i = p;
		for(int j = p+1 ; j <=q; j++) {
			if(a[j]<=pivot) {
				i=i+1;
				//交换j  和 i++
				int temp = a[i];
				a[i]= a[j];
				a[j] = temp;
			}
		}  
		//交换 a[i] 和 a[p]
		int temp = a[i] ;
		a[i] = a[p];
		a[p] = temp;
		return i;
	}
	public static void findK(int[] a, int p, int r, int k) {
		if(p<r) {
			int q= partition(a,p,r);
			if(q==k-1) return;
			findK(a,p,q-1,k);
			findK(a,q+1,r,k);
		}
	}
	 public static ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
		 ArrayList<Integer> res = new ArrayList<Integer>();
		 if(input.length==0) return null;
		 if(input.length<=k) {
	    	 for(int i=0;i<input.length;i++) {
	    		    System.out.println(i);
		        	res.add(input[i]);
		        }
	    	 return res;
		 }
		 findK(input,0,input.length-1,k);
	        
	        for(int i =0;i<k;i++) {
	        	res.add(input[i]);
	        }
	        return res;
	    }
	 //测试
	 public static void main(String args[]) {
		 int[] c = {4,5,1,6,2,7,3,8};
		 int k  = 4;
		 ArrayList<Integer> res = GetLeastNumbers_Solution(c,k);
		 if(res==null) {System.out.println("null");}
		 else {
		 for (int a : res ) {
			 System.out.println(a);
		 }
		 }
	 }
}
