package com.ykx.ykxfmis.controller;

import com.ykx.ykxfmis.entity.Bill;
import com.ykx.ykxfmis.entity.CateGory;
import com.ykx.ykxfmis.service.BillService;
import com.ykx.ykxfmis.service.CateGoryService;
import com.ykx.ykxfmis.service.UserService;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.persistence.criteria.CriteriaBuilder;
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
    @Resource
    private CateGoryService cateGoryService;

    //添加bill明细
    @RequestMapping("/insertBill")
    public String insertBill(Bill bill,HttpSession session,String cname) {
        //获取userId
        int userId=(int)session.getAttribute("id");
      //获取cid
        CateGory cateGory=cateGoryService.findId(cname);
        int cid=cateGory.getId();

        billService.registerNewBill(bill,userId,cid);
        return "insertBill";
    }

    @InitBinder
    protected void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }


}
