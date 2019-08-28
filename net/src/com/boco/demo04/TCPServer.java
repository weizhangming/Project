package com.boco.demo04;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 1.ServerSocket套接字对象，监听端口8888
 * 2.使用accept方法获取客户端的连接对象
 * 3.客户端连接对象获取字节输入流，读取客户端发送的图片
 * 4.创建File对象，绑定上传文件夹，判断文件夹是否存在，不存在在，创建
 * 5.创建字节输出流，数据目的file 对象向所在文件夹
 * 6.字节流读取图片，字节流将图片写入到文件夹中
 * 7.将上传成功写客户端
 * 8.关闭资源
 */
public class TCPServer {
	public static void main(String[] args) throws IOException {
		ServerSocket server=new ServerSocket(8888);
		Socket socket = server.accept();
		InputStream in = socket.getInputStream();
		File upload=new File("D:\\upload");
		if(!upload.exists()){
			upload.mkdirs();
		}
		FileOutputStream fos=new FileOutputStream(upload+"\\t.png");
		byte [] b=new byte[1024];
		int len=0;
		while ((len=in.read(b))!=-1){
			fos.write(b, 0, len);
		}
		socket.getOutputStream().write("上传成功".getBytes());
		fos.close();
		socket.close();
		server.close();
	}

}
