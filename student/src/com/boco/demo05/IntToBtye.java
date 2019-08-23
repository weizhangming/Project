package com.boco.demo05;

public class IntToBtye {

	public static void main(String[] args) {
	
		byte[] intToByteArray = intToByteArray(257);
		for (int i = 0; i < intToByteArray.length; i++) {
			System.out.println(intToByteArray[i]);
		}
		int i=10;
		String binaryString = Integer.toBinaryString(100);
		System.out.println(binaryString);

	}

	public static byte[] intToByteArray(int i) {  
	    byte[] result = new byte[2];  
		result[1]=(byte) ((byte) i/256);
		result[0]=(byte) ((byte) i%256);
	    return result;  
	}  
}
