package 二次练习;

public class 快排第二次 {
	public static int partition(int[] a, int p, int q) {
		int pivot = a[p];
		int i=p;
		for (int j =p+1; j<=q; j++) {
			if(a[j]<=pivot) {
				i+=1;
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		
	/*	int pivot = a[p];
		int i = p;
		for(int j = p+1 ; j <=q; j++) {
			if(a[j]<=pivot) {
				i=i+1;
			
				int temp = a[i];
				a[i]= a[j];
				a[j] = temp;
			}
		}*/  
		
		
		int temp = a[i];
		a[i] = a[p];
		a[p] = temp ;
		return i;
	}
	public static void qs(int[]a , int p , int r ) {
		if(p<=r) { 
		int q = partition(a, p ,r);
		qs(a,p,q-1);
		qs(a,q+1,r);
		}
		
		
	}
	public static void main(String[] args) {
		int[] a = {1,42,52,634,234,2,51,3};
		qs(a,0,a.length-1);
		for(int i : a ) {
			System.out.println(i);
		}
	}
}
