package com.boco.hiberbnate.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.boco.Hibernate.bean.Customer;
import com.boco.Hibernate.bean.Order;

public class HibernateTest {

	private SessionFactory sessionFactory;
	private Session session;
	private Transaction transaction;
	@Before
	public void inint(){
		//1.创建sessionFactory对象
		  Configuration config=new Configuration().configure("hibernate.cfg.xml");
		  ServiceRegistryBuilder builder=new ServiceRegistryBuilder();
		  builder.applySettings(config.getProperties());
		  ServiceRegistry serviceRegistry= builder.buildServiceRegistry(); 
		  sessionFactory = config.buildSessionFactory(serviceRegistry);
		//2.创建session对象 
		  session = sessionFactory.openSession();	
		//3.开启事务
		  transaction = session.beginTransaction();
	}
	@Test
	public void createTable(){
		
	}
	
	@Test
	public void test01(){
		Customer customer =new Customer();
		customer.setCustomerName("customer01");
		
	} 
	
	@After
	public void destroy(){
		transaction.commit();
		session.close();
		sessionFactory.close();
	}
}

