package com.boco.demo02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy {
	//复制文件 效率低
	public static void main(String[] args) {
	    FileInputStream in=null;
	    FileOutputStream out=null;
	    try{
	    	in=new FileInputStream("E:\\wei.text");
	    	out=new FileOutputStream("D:\\wei.text");
	    	int len =0;
	    	byte [] b=new byte[1024];
	    	while((len=in.read(b))!=-1){
	    		out.write(b,0,len);
	    	}
	    }catch (IOException ex) {
			ex.printStackTrace();
			throw new RuntimeException("文件复制失败");
		}finally{
			try{
				if(out!=null)
				  out.close();
			}catch (IOException ex) {
				throw new RuntimeException("输出流关闭失败");
			}finally{
				try{
					if(in!=null)
						in.close();
				}catch (IOException ex) {
					throw new RuntimeException("输入流关闭失败");
				}
			}			
		}
	    
	}

}
