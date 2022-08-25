package com.ykx.ykxfmis.controller;

import com.ykx.ykxfmis.entity.Bill;
import com.ykx.ykxfmis.entity.User;
import com.ykx.ykxfmis.service.BillService;
import com.ykx.ykxfmis.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;


/**
 * 1.@Controller注解需要配置模板才能实现跳转，@RestController注解返回的是json数据，并不是视图界面
 */
@Controller
//@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;
    @Resource
    private BillService billService;


    //跳转登录
    @RequestMapping("/show1")
    public String goLogin() {
        return "login";
    }

    //跳转注册
    @RequestMapping("/show2")
    public String goRegister() {
        return "register";
    }

    //跳转记账
    @RequestMapping("/show3")
    public String goinsertBill() {
        return "insertBill";
    }

    //登录功能
    @RequestMapping("/login")
    public String login(User loginUser, HttpServletRequest request) {
        User user = new User();
        //更新

        user = userService.loginUser(loginUser.getLoginName(), loginUser.getPassword());
        if (user != null) {
            //创建session
            HttpSession session = request.getSession();
            //将登录信息保存到session中
            session.setAttribute("id", user.getId());
            session.setAttribute("name", user.getName());
            session.setAttribute("loginName", user.getLoginName());
            return "welcome";
        } else {
            System.out.println("账号密码错误，请重新输入。");
            return "login";
        }


    }

    //注册新用户
    @RequestMapping("/register")
    public String register(User user) {

        //        判断是否空表单提交。
        if (user.getLoginName().length() != 0 || user.getPassword().length() != 0) {
            //查询数据库是否已有该用户
            User userOther = userService.findUserByLoginName(user.getLoginName());
            if (userOther == null) {
                //将表单数据添加到数据库
                userService.registerNewUser(user);
                return "login";
            } else {
                System.out.println("已有该账户");
                return "register";
            }
        } else {
            System.out.println("没有输入");
            return "register";
        }


    }

    //查询所有明细
    @RequestMapping("/showAll")
    public String showAll(Model model, HttpSession session) {
        int id = (int) session.getAttribute("id");
        //查询用户下的所有bill明细;
        List<Bill> bills = billService.findAll(id);
        model.addAttribute("bills", bills);
        return "welcome";
    }


}





