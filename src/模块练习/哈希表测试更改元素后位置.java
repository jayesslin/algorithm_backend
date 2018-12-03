package 模块练习;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class 哈希表测试更改元素后位置 {
	static HashMap<Integer,Integer> x= new HashMap<Integer,Integer>();
	static Map<Integer,Integer> y = new LinkedHashMap<Integer,Integer>();
	public static void main(String[] args ) {
		/*
		x.put(32, 1);
		x.put(3, 1);
		x.put(null, 1);
		x.put(2, 10);*/
		y.put(33, 1);
		y.put(2, 1);
		y.put(3, 1);
		y.put(33, 2);
		for(Entry<Integer,Integer> e : y.entrySet()) {
			System.out.println("key is + "+ e.getKey() + " value is + "+ e.getValue());
		}
	}
}
