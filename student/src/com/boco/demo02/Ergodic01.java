package com.boco.demo02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Ergodic01 {

	//entrySet��ֵ��ӳ���ϵ��ȡ
	//ʹ��map.entrySet()ӳ���ϵ���󣬴浽set����
	//����set��ȡset���ϵ�Ԫ�أ���ӳ���ϵ����
	//ͨ��ӳ������ȡkey ��value
	public static void main(String[] args) {
		function();
	}

	public static void function() {
		// ���ý���ȡֵ keyset
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "1");
		map.put(2, "2");
		map.put(3, "3");
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		Iterator<Entry<Integer, String>> it = entrySet.iterator();
		while(it.hasNext()){
			Entry<Integer, String> next = it.next();
			//Integer key=it.next().getKey();
			//String value=it.next().getValue();��������
			Integer key=next.getKey();
		    String value=next.getValue();
			System.out.println(key+"  "+value);
		}

	}
	public static void function_1() {
		// ���ý���ȡֵ keyset
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "1");
		map.put(2, "2");
		map.put(3, "3");
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		for (Entry<Integer, String> entry : entrySet) {
			System.out.println(entry);
		}

	}

}
