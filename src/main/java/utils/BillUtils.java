package utils;

import com.ykx.ykxfmis.entity.Bill;

import java.util.ArrayList;

public class BillUtils {
    private ArrayList insetBillUtils(Bill bill,Integer uid,Integer cid){
        ArrayList arrayList=new ArrayList();
        arrayList.add(bill.getMoney());
        arrayList.add(bill.getDatetime());
        arrayList.add(bill.getRemark());
        arrayList.add(uid);
        arrayList.add(cid);
        return arrayList;
    }
}
