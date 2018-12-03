package 剑指offer66;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

/*
 * 在一个字符串(0<=字符串长度<=10000，
 * 全部由字母组成)中找到第一个只出现一次的字符,
 * 并返回它的位置, 如果没有则返回 -1（需要区分大小写）
 */
public class 字符串_第一个只出现一次的字符 {
	 public int FirstNotRepeatingChar(String str) {
		 if(str.length()==0) return -1;
	     Map<Character,Integer> x = new LinkedHashMap<Character, Integer>();   
	     for(int i=0; i<str.length(); i++) {
	    	 if(x.containsKey(str.charAt(i))){
	    		 
	    		 x.put(str.charAt(i), x.get(str.charAt(i))+1);
	    	 } else {
	    		 x.put(str.charAt(i),1);
	    	 }
	     }
	    //
	     /*for (Entry<Character,Integer>e : x.entrySet()) {
	    	 System.out.println(e.getKey()+"      "+e.getValue());
	    	 if(e.getValue()==1) {
	    		 for(int i=0; i<str.length(); i++) {
	    			 if(str.charAt(i)==e.getKey()) {
	    				 return count;
	    			 }
	    			 count++;
	    		 }
	    		
	    	 }
	    	 
	     }*/
	     for(int i=0; i<str.length(); i++) {
	    	 if(x.get(str.charAt(i))==1) {
	    		 return i;
	    	 }
	     }
		 return -1;
	    }
	 public static void main(String[] args) {
		 String a = "google";
		 字符串_第一个只出现一次的字符 x = new 字符串_第一个只出现一次的字符();
		 System.out.println(x.FirstNotRepeatingChar(a));
	 }
	 
	 
}
