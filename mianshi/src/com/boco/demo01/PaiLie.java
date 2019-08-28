package com.boco.demo01;

import java.util.ArrayList;
import java.util.List;

public class PaiLie {

	private  static String str="12";
	public static void main(String[] args) {
	List<String> list=new ArrayList<String>();
		if(str!=null&&str.length()>0){
			help(0,str.toCharArray(),list);
		}
		System.out.println(list.toString());
	}
	private static void help(int i, char[] charArray, List<String> list) {
		// TODO Auto-generated method stub
		if(i==charArray.length){
			String val=String.valueOf(charArray);
			if(!list.contains(val)){
				list.add(val);
			}
		}else{
			for(int j=i;j<charArray.length;j++){
				swap(i,j,charArray);
				help(i+1,charArray,list);
				swap(i,j,charArray);
			}
			
		}
	}
	private static void swap(int i, int j, char[] charArray) {
		char temp=charArray[i];
		charArray[i]=charArray[j];
		charArray[j]=temp;
		
	}


}
