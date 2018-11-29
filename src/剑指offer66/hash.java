package 剑指offer66;

import java.util.HashSet;
import java.util.Set;

public class hash {
	
	   
		public static int find(int[] a){
	        Set res=  new HashSet();
	        for (int i=0;i<a.length;i++){
	            int x = a[i]* a[i];
	            if(!res.contains(x)){
	                res.add(x);
	            }
	        } return res.size();
	    }
		
		public static void main(String[] args) {
			int[] a = {-1,0,1};
			System.out.println(find(a));
			System.out.println(Integer.MAX_VALUE);
		}
	}

