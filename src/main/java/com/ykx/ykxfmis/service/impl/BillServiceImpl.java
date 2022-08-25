package com.ykx.ykxfmis.service.impl;

import com.ykx.ykxfmis.dao.BillDao;
import com.ykx.ykxfmis.entity.Bill;
import com.ykx.ykxfmis.service.BillService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BillServiceImpl implements BillService {
    @Resource
    private BillDao billDao;

    @Override
    public List<Bill> findAll(Integer id) {
        List<Bill> bills = billDao.selectAll(id);
        return bills;
    }

    @Override
    public int registerNewBill(Bill bill,Integer uid,Integer cid) {
        int i=billDao.insertBillOne(bill,uid,cid);
        return i;
    }
}
