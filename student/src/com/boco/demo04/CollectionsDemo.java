package com.boco.demo04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {
	public static void main(String[] args) {
		function_1();
	}
	public static void function(){
		List<String>list=new ArrayList<String>();
		list.add("ass");
		list.add("ess");
		list.add("xss");
		list.add("css");
		Collections.sort(list);
		System.out.println(list);
	}
	
	public static void function_1(){
		List<Integer>list=new ArrayList<Integer>();
		list.add(3);
		list.add(5);
		list.add(6);
		list.add(66);
		Collections.sort(list);
		int i = Collections.binarySearch(list, 4);
		System.out.println(i);
		
	}

}
