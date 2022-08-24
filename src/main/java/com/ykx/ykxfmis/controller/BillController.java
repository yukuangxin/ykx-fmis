package com.ykx.ykxfmis.controller;

import com.ykx.ykxfmis.entity.Bill;
import com.ykx.ykxfmis.service.BillService;
import com.ykx.ykxfmis.service.UserService;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
@RequestMapping("/bill")
public class BillController {
    @Resource
    private BillService billService;
    @Resource
    private UserService userService;



    //添加明细
    @RequestMapping("/insertBill")
    public String insertBill(Bill bill,HttpSession session) {

        billService.registerNewBill(bill);
        return "insertBill";
    }



    @InitBinder
    protected void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }


}
