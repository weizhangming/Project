package com.boco.demo02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

/**
 * 实现UDP协议的发送端
 *   实现封装数据的类Java.net.Datagrampacket
 *   实现数据传输的类ava.net.Datagramsocket
 *   
 *   实现步骤：
 *   1.创建Datagrampacket对象，封装数据，接受的地址和端口号
 *   2.创建Datagramsocket
 *   3.Datagramsocket对象的send,发送数据
 *   4.关闭资源
 */
public class UDPSend {
	public static void main(String[] args) throws IOException {
		byte [] data="123".getBytes();
		InetAddress hostAddress = InetAddress.getByName("127.0.01");
		DatagramPacket dataPacket=new DatagramPacket(data,data.length,hostAddress,25000);
		DatagramSocket ds=new DatagramSocket();
		ds.send(dataPacket);
		ds.close();
	}
	
}
