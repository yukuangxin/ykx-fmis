package com.ykx.ykxfmis.dao;

import com.ykx.ykxfmis.entity.Bill;
import com.ykx.ykxfmis.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BillDao {
    //查询所有消费记录
    List<Bill> selectAll();

    //添加一条消费记录
    int insertBillOne(Bill bill);
}

