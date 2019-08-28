package com.boco.demo03;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
/**
 * TCP服务端 java.net.serverSocket
 *  
 *  ServerSocket(int port)
 *  获取客户端的套接字socket的对象
 *  服务器获取客户端的socket
 *  socket accept（）
 */
public class TCPServer {
	public static void main(String[] args) throws IOException {
		
		ServerSocket ss=new ServerSocket(25780);
		Socket socket = ss.accept();
		InputStream in = socket.getInputStream();
		byte[] data=new byte[1024];
		int len=in.read(data);
		System.out.println(new String(data,0,len));
		
		OutputStream out = socket.getOutputStream();
		out.write("收到".getBytes());
		socket.close();
		ss.close();
	}

}
