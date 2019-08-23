package com.boco.demo02;

import java.util.HashMap;
import java.util.Map;

public class MapDemo01 {
	public static void main(String[] args) {
		function_2();
	}
	public static void function(){
		Map<String,String> map=new HashMap<String,String>();
		String v=map.put("a", "1");
		System.out.println(v);
		map.put("b", "2");
		map.put("c", "3");
		v=map.put("c", "6");
		System.out.println(v);
		System.out.println(map);
	}

	public static void function_1(){
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(1, "1");		
		map.put(2, "2");
		map.put(3, "3");
		System.out.println(map.get(1));//1
		System.out.println(map.get(4));//null
	
	}
	public static void function_2(){
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(1, "1");		
		map.put(2, "2");
		map.put(3, "3");
		String remove = map.remove(1);
		System.out.println(remove);//1
		System.out.println(map);//{2=2, 3=3}
		System.out.println(map.size());//2
	
	}
}
