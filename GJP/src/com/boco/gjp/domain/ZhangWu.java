package com.boco.gjp.domain;

public class ZhangWu {
	private int zwid;
	private String flname;
	private double money;
	private String zhangwu;
	private String createtime;
	private String description;
	
	public ZhangWu() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ZhangWu(int zwid, String flname, double money, String zhangwu,
			String createtime, String description) {
		super();
		this.zwid = zwid;
		this.flname = flname;
		this.money = money;
		this.zhangwu = zhangwu;
		this.createtime = createtime;
		this.description = description;
	}

	public int getZwid() {
		return zwid;
	}

	public void setZwid(int zwid) {
		this.zwid = zwid;
	}

	public String getFlname() {
		return flname;
	}

	public void setFlname(String flname) {
		this.flname = flname;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public String getZhangwu() {
		return zhangwu;
	}

	public void setZhangwu(String zhangwu) {
		this.zhangwu = zhangwu;
	}

	public String getCreatetime() {
		return createtime;
	}

	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "ZhangWu [zwid=" + zwid + ", flname=" + flname + ", money="
				+ money + ", zhangwu=" + zhangwu + ", createtime=" + createtime
				+ ", description=" + description + "]";
	}
	
}
