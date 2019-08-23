package com.boco.demo01;

import java.util.LinkedList;

public class ListDemo03 {

	public static void main(String[] args) {
	 LinkedList<String> list=new LinkedList<String>();
	 list.add("1");
	 list.add("2");
	 list.add("3");
	 list.addFirst("0");
	 list.addLast("4");
	 System.out.println(list);
	 System.out.println(list.getFirst());
	 System.out.println(list.getLast());
	 System.out.println(list.removeFirst());
	 System.out.println(list.removeLast());
	 System.out.println(list);
	}
}
