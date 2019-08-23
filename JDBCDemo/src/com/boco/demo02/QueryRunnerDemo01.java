package com.boco.demo02;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;

import com.boco.jdbcutil.JDBCUtils;
import com.boco.jdbcutil.JDBCUtilsConfig;

public class QueryRunnerDemo01 {

	//使用update(connnect ,sql，可变参数)
	public static void main(String[] args) throws SQLException {
		//insert();
		//update();
		delete();
	}

	private static void delete() throws SQLException {
		QueryRunner qr=new QueryRunner();
		String sql="delete from sort where sid=?";
		Connection conn = JDBCUtilsConfig.getConnection();
		int update = qr.update(conn, sql, 5);
		System.out.println(update);
		DbUtils.closeQuietly(conn);		
	}

	private static void update() throws SQLException {
		QueryRunner qr=new QueryRunner();
		String sql="update sort set sname=?,sprice=?,sdesc=? where sid=?";
		Connection conn = JDBCUtilsConfig.getConnection();
		Object [] params={"花火",2.0,"日向",1};
		int update = qr.update(conn, sql, params);
		System.out.println(update);
		DbUtils.closeQuietly(conn);
	}

	private static void insert() throws SQLException {
		QueryRunner qr=new QueryRunner();
		String sql="insert into sort(sname,sprice,sdesc) values(?,?,?)";
		Connection conn = JDBCUtilsConfig.getConnection();
		//可变参数也可使用object 数组
		Object [] params={"dds",400.0,"说明"};
		//qr.update(conn, sql, "天气",3000.0,"太准了");
		int update = qr.update(conn, sql, params);
		System.out.println(update);
		DbUtils.closeQuietly(conn);
		
	}

}
