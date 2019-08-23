package com.boco.demo07;

import java.io.Serializable;


public class Person implements Serializable {
	private static final long serialVersionUID = -5603201245423365035L;
	private String name;
	private Integer age;
	private transient String sex;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Person(String name, Integer age, String sex) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", sex=" + sex + "]";
	}

}
