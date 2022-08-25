package com.ykx.ykxfmis.service;

import com.ykx.ykxfmis.entity.Bill;

import java.util.List;

public interface BillService {
    //查询所有明细
    List<Bill> findAll(Integer id);
    //增加一条明细
    int registerNewBill(Bill bill,Integer uid,Integer cid);
}
