package com.ykx.ykxfmis.service;

import com.ykx.ykxfmis.entity.Bill;

import java.util.List;

public interface BillService {
    List<Bill> findAll();
    int registerNewBill(Bill bill);
}
