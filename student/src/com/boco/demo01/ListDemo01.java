package com.boco.demo01;

import java.util.ArrayList;
import java.util.List;

public class ListDemo01 {

	public static void main(String[] args) {
		function();
	}
	public static void function(){
		List<String>list=new ArrayList<String>();
		list.add("01");
		list.add("02");
		list.add("03");
		System.out.println(list);
		list.add(3, "02");
		System.out.println(list.get(2));
		String remove = list.remove(0);
		System.out.println(remove);
		System.out.println(list);
	}
}
