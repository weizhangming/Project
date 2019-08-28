package com.boco.demo01;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo {

	public static void main(String[] args) throws UnknownHostException {
		function();
	}

	private static void function() throws UnknownHostException {
		InetAddress localHost = InetAddress.getLocalHost();
		InetAddress byName = InetAddress.getByName("www.baidu.com");
		System.out.println(localHost);
		System.out.println(byName);
		String hostAddress = localHost.getHostAddress();
		System.out.println(hostAddress);
	}

}
