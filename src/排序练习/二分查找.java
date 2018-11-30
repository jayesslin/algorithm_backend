package 排序练习;

public class 二分查找 {
	public int binary(int[] a, int k) {
		int start = 0;
		int end = a[a.length-1];
		int res = find (a,start,end,k);
		return res;
	}
	public int find(int[] a , int start,int end,int k) {
		if(start>end||k<a[start]||k>a[end]) return -1;
		int mid = (start + end) >>1;
		if(k<a[mid]) return find(a,start,mid-1,k);
		if(k>a[mid]) return find(a,mid+1,end,k);
		return mid;
	}
	
	

}
