package com.boco.demo02;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
/**
 * 数据接收
 *   实现封装数据的类Java.net.Datagrampacket将数据接收
 *   实现数据传输的类ava.net.Datagramsocket 接收数据包
 *   实现步骤：1.创建DatagramSocket对象，绑定端口号
 *           2.创建字节数组，来接收数据
 *  		 3.创建数据包Datagrampacket对象
 *  		  4.调用DatagramSocket对象的receive（Datagrampacket）接收数据
 * 			  5.拆包
 *       发送的IP地址
 *       Datagrampacket.getAddress()
 *       接收到字节个数
 *       Datagrampacket.getLenth()
 *       发送端的端口号     
 *       关闭资源
 */
public class UDPReceive {
	public static void main(String[] args) throws Exception {
		DatagramSocket ds=new DatagramSocket(25000);
		byte[]data=new byte[1024];
		DatagramPacket dp=new DatagramPacket(data,data.length);
		ds.receive(dp);
		int length=dp.getLength();
		System.out.println(new String(data,0,length));
		ds.close();
	}
}
