package com.boco.gjp.service;

import java.util.List;

import com.boco.gjp.dao.ZhangWuDao;
import com.boco.gjp.domain.ZhangWu;

/**
 *业务层 接受上一次，控制层controller的数据 
 *经计算传递到dao层，操作数据库
 *调用dao层中的类创建Dao类的对象
 */
public class ZhangWuService {
   private ZhangWuDao dao=new ZhangWuDao();
   public List<ZhangWu> select(String startDate, String endDate){
	   return dao.select(startDate,endDate);
   }
  public List<ZhangWu> selectAll(){
	  return dao.selectAll();
   }
}
