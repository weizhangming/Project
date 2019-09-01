package com.boco.demo01.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.junit.Test;


import com.boco.demo01.bean.Student;
public class Test01 {
	@Test
	public void testStudent(){
		
		//1.创建sessionFactory对象
		  Configuration config=new Configuration().configure();
		  ServiceRegistryBuilder builder=new ServiceRegistryBuilder();
		  builder.applySettings(config.getProperties());
		  ServiceRegistry serviceRegistry= builder.buildServiceRegistry(); 
		  SessionFactory sessionFactory = config.buildSessionFactory(serviceRegistry);
		//2.创建session对象 
		  Session session = sessionFactory.openSession();	
		//3.开启事务
		  Transaction transaction = session.beginTransaction();
		  Student s=new Student();
		  s.setStudentName("LI");
		  s.setStudentCode("2014012860");
		  s.setPassword("1223");
		  s.setAge(25);
		//4.保存操作
		  session.save(s);
		//5.提交事务  
		  transaction.commit();	
		//6.关闭事务
		 session.close();
		 sessionFactory.close();
	}

}
