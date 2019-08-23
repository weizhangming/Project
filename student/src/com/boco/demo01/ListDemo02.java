package com.boco.demo01;

import java.util.ArrayList;
import java.util.List;

public class ListDemo02 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("abc1");
		list.add("abc2");
		list.add("abc3");
		list.add("abc4");
		for (int i = 0; i < list.size(); i++) {

			if(list.get(i).equals("abc2")){
				list.add("ABC3");
			}
		}
		System.out.println(list);
	}
}
