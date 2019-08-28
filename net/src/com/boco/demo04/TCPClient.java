package com.boco.demo04;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * TCP 图片上传
 * 1.socket套接字连接服务器
 * 2.通过socket获取字节输出流，写图片
 * 3.使用自己的流对象，读取图片数据源fileInputstream
 * 4.读取图片，使用字节输出流，将图片写到服务器 字节数组缓冲
 * 5.通过socket套接字获取字节输出流，读取服务器输出信息
 * 6.关闭资源
 */
public class TCPClient {
	public static void main(String[] args) throws  IOException {
		Socket socket=new Socket("127.0.0.1",8888);
		OutputStream out = socket.getOutputStream();
		FileInputStream file=new FileInputStream("C:\\1.png");
		byte[] b=new byte[1024];
		int len=0;
		while((len =file.read(b))!=-1){
			out.write(b, 0, len);
		}
		//给服务器停止服务序列
		socket.shutdownOutput();
       //字节输出
		InputStream in = socket.getInputStream();
		len =in.read(b);
		System.out.println(new String(b,0,len));
		file.close();
		socket.close();
		
		
	}

}
