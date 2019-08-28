package com.boco.demo03;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbcp.BasicDataSource;

public class DataSoruceDemo01 {
	public static void main(String[] args) throws SQLException {
     BasicDataSource base=new BasicDataSource();
     base.setDriverClassName("com.mysql.jdbc.Driver");
     base.setUrl("jdbc:mysql://localhost:3306/test");
     base.setUsername("root");
     base.setPassword("111111");
     Connection conn = base.getConnection();
     //conn.prepareStatement(sql);
	}
}
