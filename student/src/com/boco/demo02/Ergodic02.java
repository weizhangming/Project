package com.boco.demo02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ergodic02 {

	public static void main(String[] args) {
		function_1();
	}

	public static void function() {
		// 利用建获取值 keyset
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "1");
		map.put(2, "2");
		map.put(3, "3");
		Set<Integer> keySet = map.keySet();
		System.out.println(keySet.getClass());// class java.util.HashMap$KeySet
												// HashMap的内部类
		Iterator<Integer> it = keySet.iterator();
		while (it.hasNext()) {
			Integer key = it.next();
			System.out.println(key + "  " + map.get(key));
		}

	}

	public static void function_1() {
		// 利用建获取值 keyset
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "1");
		map.put(2, "2");
		map.put(3, "3");
		Set<Integer> keySet = map.keySet();
		System.out.println(keySet.getClass());// class java.util.HashMap$KeySet
												// HashMap的内部类
		for (Integer integer : keySet) {
			System.out.println(integer+"  "+map.get(integer));

		}

	}

}
