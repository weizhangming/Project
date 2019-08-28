package com.boco.demo01;

import java.util.ArrayList;
import java.util.List;

/**
 * 用1,2,2,3,4,5这六个数，用java写一个main函数，打印出不同的排列，
 * 要求“4”不能在第三位，"3"与"5"不能相连
 */
public class arrayDemo {
	private static List<String>list =new ArrayList<String>();
	public static void main(String[] args) {
		group("","123345");
		System.out.println(list.toString());
	}

	private static void group(String str, String nstr) {
		if(str.length()!=nstr.length()){
			String rest=getRest(str,nstr);
			for (int i = 0; i < rest.length(); i++) {
				String temp= str+rest.substring(i,i+1);
				if(temp.indexOf("4")!=2&&temp.indexOf("35")==-1&&temp.indexOf("53")==-1){
					if(!list.contains(temp)&&temp.length()==nstr.length()){
						list.add(temp);
					}
					group(temp,nstr);
				}
			}
			
		}
	}

	private static String getRest(String str, String nstr) {
		String rest="";
	    if(nstr.length()>str.length()){
	    	rest=nstr;
	    	for (int i = 0; i < str.length(); i++) {
	    		rest=rest.replaceFirst(str.substring(i,i+1),"");				
			}
	    }
		return rest;
	}

}
