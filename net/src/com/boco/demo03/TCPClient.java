package com.boco.demo03;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
/**
 * 实现TCP客户端，连接到服务器 和服务器私信数据交换
 *  实现TCP客户端的类java.net.socket
 *  构造方法：
 *  socket（string ip,int port）传递服务器IP和端口号
 *  注意：构造方法只要运行，就会和服务器进行连接，连接失败，抛出异常
 *  方法： OutputStram   getOutputStram 将数据输出，输出到服务器  
 *        InputStram   getInputStram  从服务器端读取数据
 */
public class TCPClient {
	public static void main(String[] args) throws  IOException {
		Socket sc=new Socket("127.0.0.1",25780);
		OutputStream out = sc.getOutputStream();
		out.write("服务器OK".getBytes());
		//读取服务器发回的数据
		InputStream in = sc.getInputStream();
		byte[]b=new byte[1024];
		int len = in.read(b);
		System.out.println(new String(b,0,len));	
		sc.close();
	}
}
