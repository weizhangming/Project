package com.boco.Hibernate.bean;

public class Order {
	private Integer orderId;
	private String orderName;
	private Customer customer;
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Order(Integer orderId, String orderName) {
		super();
		this.orderId = orderId;
		this.orderName = orderName;
	}
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(Integer orderId, String orderName, Customer customer) {
		super();
		this.orderId = orderId;
		this.orderName = orderName;
		this.customer = customer;
	}
   
}
