package com.boco.gjp.view;

import java.util.List;
import java.util.Scanner;

import com.boco.gjp.controller.ZhangWuController;
import com.boco.gjp.domain.ZhangWu;

/**
 * 视图层，用户看到和操作的界面 数据传递给controller层实现 成员位置创建controller对象
 * 
 */
public class MainView {
	private ZhangWuController controller = new ZhangWuController();
	public void run() {
		Scanner sc=new Scanner(System.in);
		while(true){
			System.out.println("---------------管家婆家庭记账软件---------------");
			System.out.println("1.添加账务　2.编辑账务　3.删除账务　4.查询账务　5.退出系统");
			System.out.println("请输入要操作的功能序号[1-5]:");
			int choose=sc.nextInt();
			switch(choose){
			case 1:
				//添加账务
				break;
			case 2:
				//编辑账务
				break;
			case 3:
				//删除账务
				break;
			case 4:
				//查询账务
				selectZhangWu();
				break;
			case 5:
				//退出系统
				System.exit(0);
				break;
			}
		}
		
	}

	private void selectZhangWu() {
	 System.out.println("1.查询所有　2.按条件查询");	
	 Scanner sc=new Scanner(System.in);
	 int s=sc.nextInt();
	 switch(s){
	 case 1:
		 selectAll();
		 break;
	 case 2: 
		 select();
		 break;
	 }
	}

	private void select() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入开始日期:");
		String startDate=sc.nextLine();
		System.out.println("请输入结束日期:");
		String endDate=sc.nextLine();
		List<ZhangWu> list = controller.select(startDate,endDate);
		for(ZhangWu zw:list){
			System.out.println(zw.getZwid()+"\t"+zw.getFlname()+"\t"+zw.getZhangwu()
					+"\t"+zw.getMoney()+"\t"+zw.getCreatetime()+zw.getDescription());
		}
		
	}

	private void selectAll() {
		
		List<ZhangWu> list = controller.selectAll();
		System.out.println("ID\t类别\t账户\t金额\t时间\t说明\t");
		for(ZhangWu zw:list){
			System.out.println(zw.getZwid()+"\t"+zw.getFlname()+"\t"+zw.getZhangwu()
					+"\t"+zw.getMoney()+"\t"+zw.getCreatetime()+zw.getDescription());
		}
	}
	
}
