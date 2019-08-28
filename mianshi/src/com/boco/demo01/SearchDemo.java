package com.boco.demo01;

import java.util.Arrays;

/**
 * 有一组数据a[1000]存放了1000个数，这1000个数取值1-999,且只有两个相同的数
 * 剩下的999个数不同，写一个搜索方法找出相同的那个数的值
 */
public class SearchDemo {
	private static final int size=1000;
	public static void main(String[] args) {
		int []data =new int[size];
		//准备数据
		for(int k=0;k<data.length;k++){
			data[k]=k+1;
		}
		data[999]=567;
		result(data);
		
	}
	private static void result(int[] data) {
		Arrays.sort(data);
		for (int i = 0; i < data.length; i++) {
			int target=data[i];
			data[i]=0;
			int result=binaryFind(data,target);
			if(result!=-1){
				System.out.println(data[result]);
				break;	
			}
		}
	}
	private static int binaryFind(int[] data, int target) {
		int start=0;
		int end=data.length-1;
		while(start<=end){
			int middleIndex=(start+end)/2;
			if(target==data[middleIndex]){
				return middleIndex;
			}if(target>=data[middleIndex]){
				start=middleIndex+1;
			}else{
				end=middleIndex-1;
			}
		}
		return -1;
	}

}
