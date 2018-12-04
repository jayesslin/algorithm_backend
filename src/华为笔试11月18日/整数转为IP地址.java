package 华为笔试11月18日;

import java.util.Scanner;

public class 整数转为IP地址 {
	public static class Ip{ 
		public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        while (sc.hasNext()) {
	            long n = sc.nextLong();
	            
	            System.out.println(longToIp(n));
	            System.out.println(long2Ip(n));
	        }
	    }
		
	public static  String longToIp(long ip) { 
		StringBuilder result = new StringBuilder(15); 
		  
		for (int i = 0; i < 4; i++) { 
		  
		  result.insert(0,Long.toString(ip & 0xff)); 
		  
		  if (i < 3) { 
		    result.insert(0,'.'); 
		  } 
		  
		  ip = ip >> 8; 
		} 
		return result.toString(); 
		 } 
		  
		 //ip = 3232235778 
	}
	public static String long2Ip(long ip){
		StringBuilder builder = new StringBuilder(String.valueOf(ip >>> 24));
		builder.append(".");
		builder.append(String.valueOf((ip & 0X00FFFFFF) >>> 16));
		builder.append(".");
		builder.append(String.valueOf((ip & 0X0000FFFF) >>> 8));
		builder.append(".");
		builder.append(String.valueOf(ip & 0X000000FF));
		return builder.toString();
	}
	
}
