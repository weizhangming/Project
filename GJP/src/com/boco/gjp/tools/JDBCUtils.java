package com.boco.gjp.tools;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;

public class JDBCUtils {
	private static BasicDataSource datasource=new BasicDataSource();
	static{
		datasource.setDriverClassName("com.mysql.jdbc.Driver");
		datasource.setUrl("jdbc:mysql://localhost:3306/gjp");
		datasource.setUsername("root");
		datasource.setPassword("111111");
		//连接池中数量配置
		datasource.setInitialSize(10);//初始化的连接数
		datasource.setMaxActive(5);//最大连接数
		datasource.setMaxIdle(5);//最大空闲
		datasource.setMinIdle(2);//最小空闲
	}
	public static DataSource getDataSource(){
		return datasource;
	}
}
