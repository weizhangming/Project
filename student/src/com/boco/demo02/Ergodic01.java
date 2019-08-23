package com.boco.demo02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Ergodic01 {

	//entrySet键值对映射关系获取
	//使用map.entrySet()映射关系对象，存到set集合
	//迭代set获取set集合的元素，是映射关系对象
	//通过映射对象获取key 和value
	public static void main(String[] args) {
		function();
	}

	public static void function() {
		// 利用建获取值 keyset
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "1");
		map.put(2, "2");
		map.put(3, "3");
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		Iterator<Entry<Integer, String>> it = entrySet.iterator();
		while(it.hasNext()){
			Entry<Integer, String> next = it.next();
			//Integer key=it.next().getKey();
			//String value=it.next().getValue();这样报错
			Integer key=next.getKey();
		    String value=next.getValue();
			System.out.println(key+"  "+value);
		}

	}
	public static void function_1() {
		// 利用建获取值 keyset
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "1");
		map.put(2, "2");
		map.put(3, "3");
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		for (Entry<Integer, String> entry : entrySet) {
			System.out.println(entry);
		}

	}

}
