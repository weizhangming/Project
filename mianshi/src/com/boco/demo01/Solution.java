package com.boco.demo01;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public ArrayList<String> Permutation(String str) {
       ArrayList<String> ans=new ArrayList<>();//所有排列的可能都在这里
        if(str!=null||str.length()>0){
            help(0,str.toCharArray(),ans);
            Collections.sort(ans);
        }        
        return ans;
    }
    public static void help(int i,char[] cha,ArrayList<String> ans){
        if(i==cha.length-1){
            String val = String.valueOf(cha);
            if(!ans.contains(val)){
                ans.add(val);
            }
        }else{
            for(int j=i;j<cha.length;j++){
                swap(i,j,cha);//依次选一个数固定住
                help(i+1,cha,ans);//让后面的进行全排列
                swap(i,j,cha);//恢复原来的模样，回溯关键
            }
        }
        
    }
    public static void swap(int i,int j,char[] cha){
        char temp=cha[i];
        cha[i]=cha[j];
        cha[j]=temp;
    }
    
}

