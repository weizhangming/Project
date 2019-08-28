package com.boco.gjp.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.boco.gjp.domain.ZhangWu;
import com.boco.gjp.tools.JDBCUtils;

/**
 * 增删改查
 * 
 */
public class ZhangWuDao {
	private QueryRunner qr = new QueryRunner(JDBCUtils.getDataSource());

	public List<ZhangWu> selectAll() {
		String sql="select * from gjp_zhangwu  ";
		List<ZhangWu> list=null;
		try {
			 list = qr.query(sql, new BeanListHandler<>(ZhangWu.class));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;

	}
	public  List<ZhangWu> select(String startDate, String endDate) {
		
		List<ZhangWu> list=null;
		String sql="select * from gjp_zhangwu where createtime between ? and ?";
		Object [] params={startDate,endDate};
		try {
			list = qr.query(sql, new BeanListHandler<>(ZhangWu.class), params);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("查询失败");
		}

		return list;

	}
}
