package com.boco.demo02;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayHandler;
import org.apache.commons.dbutils.handlers.ArrayListHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.boco.jdbcutil.JDBCUtilsConfig;
/*
 * 
 * queryRunner的query方法，返回值为泛型
 *
 */
import com.boco.model.Sort;

public class QueryRunnerDemo02 {

	private static Connection conn=JDBCUtilsConfig.getConnection();
	public static void main(String[] args) throws SQLException {
		//arrayHandler();
		//arrayListHandler();
		//beanHandler();
		beanListHandler();
	}
	
	private static void beanListHandler()throws SQLException {
		QueryRunner qr = new QueryRunner();
		String sql = "select * from sort";
		//BeanHandler(Class<T>Type)
		List<Sort> sortList = qr.query(conn, sql, new BeanListHandler<Sort>(Sort.class));
		for (Sort sort : sortList) {
			System.out.println(sort);
		}		
	}
	private static void beanHandler()throws SQLException {
		QueryRunner qr = new QueryRunner();
		String sql = "select * from sort";
		//BeanHandler(Class<T>Type)
		Sort sort = qr.query(conn, sql, new BeanHandler<Sort>(Sort.class));
		System.out.println(sort);
		
	}

	private static void arrayListHandler() throws SQLException {
		QueryRunner qr = new QueryRunner();
		String sql = "select * from sort";
		List<Object[]> result = qr.query(conn, sql, new ArrayListHandler());
		for (int i = 0; i < result.size(); i++) {
			Object[] obj = result.get(i);
			for (Object object : obj) {
				System.out.print(object+"\t");
			}
			System.out.println();
		} 
	}
	private static void arrayHandler() throws SQLException {
		QueryRunner qr=new QueryRunner();
		String sql="select * from sort";
		Object[] result =qr.query(conn, sql, new ArrayHandler());
		for (Object object : result) {
			System.out.println(object);
		}
		
	}
}
