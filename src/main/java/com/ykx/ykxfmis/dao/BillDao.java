package com.ykx.ykxfmis.dao;

import com.ykx.ykxfmis.entity.Bill;
import com.ykx.ykxfmis.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface BillDao {
    //查询所有消费记录
    List<Bill> selectAll(Integer id);

    //添加一条消费记录
    int insertBillOne(@Param("bill") Bill bill,@Param("uid") Integer uid,@Param("cid")Integer cid);
}

