package com.boco.demo01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCDemo01 {
	/**
	 * 1.注册驱动.
	 * 告知jVM使用哪一个数据库的驱动
	   2.获得连接.
	        使用jdbc类，完成对mysql连接
	   3.获得语句执行平台
	        获取执行对象
	   4.执行sql语句
	   5.处理结果
	   6.释放资源.
	 * @throws ClassNotFoundException 
	 * @throws SQLException 
	 */
	public static void main(String[] args) throws ClassNotFoundException,
			SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/test", "root", "111111");
		String sql = "select * from sort";
		PreparedStatement pre = connection.prepareStatement(sql);
		ResultSet re = pre.executeQuery();
		while (re.next()) {
			System.out
					.println(re.getInt("sid") + "   " + re.getString("sname"));
		}

	}

}
