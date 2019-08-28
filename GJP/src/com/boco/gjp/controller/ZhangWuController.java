package com.boco.gjp.controller;

import java.util.List;

import com.boco.gjp.domain.ZhangWu;
import com.boco.gjp.service.ZhangWuService;

/**
 * 控制器层 接受视图的数据，数据传递个service层 成员位置，创建service对象
 */
public class ZhangWuController {
	private ZhangWuService service = new ZhangWuService();

	public List<ZhangWu> select(String startDate, String endDate) {
	   return service.select(startDate,endDate);
	}

	public List<ZhangWu> selectAll() {
       return service.selectAll();
	}
}
