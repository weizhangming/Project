package com.boco.demo01;

import java.io.File;
import java.io.IOException;

public class FileDemo03 {
	// �ļ��Ĵ�����ɾ��

	public static void main(String[] args) throws IOException {
		function_3();

	}

	public static void function() throws IOException {
		// �����ļ��Ĺ���;boolean CreateNewFile();�������ļ�·�����ļ�������File�Ĺ������и���
		File file = new File("D:\\weizhangming");
		boolean createNewFile = file.createNewFile();
		System.out.println(createNewFile);
	}

	public static void function_1() throws IOException {
		// ɾ���ļ��Ĺ���;boolean delete();ɾ�����ļ�·�����ļ�������File�Ĺ������и���
		File file = new File("D:\\weizhangming");
		boolean delete = file.delete();
		System.out.println(delete);
	}
	
	//�ļ��д���
	public static void function_2() throws IOException {
		// �����ļ��еĹ���;boolean mkdir();���������ļ��У���File�Ĺ������и���
		// �����ļ��еĹ���;boolean mkdirs();��������ļ��У���File�Ĺ������и���
		File file = new File("D:\\weizhangming");
		boolean make = file.mkdir();
		System.out.println(make);
	}
	//�ļ���ɾ��
		public static void function_3() throws IOException {
			// �����ļ��еĹ���;boolean mkdir();���������ļ��У���File�Ĺ������и���
			File file = new File("D:\\weizhangming");
			boolean make = file.delete();
			System.out.println(make);
		}
}
