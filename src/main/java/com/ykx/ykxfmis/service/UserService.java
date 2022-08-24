package com.ykx.ykxfmis.service;

import com.ykx.ykxfmis.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {
    //通过id查询user
    User findUserById(Integer id);

    //通过id,name查询user
    User findUser(Integer id, String name);

    //添加user(无ID属性)
    int registerNewUser(User newUser);

    //登录功能,查找账户
    User findUserByLogin(String name, String password);

    User findUserByLoginName(String name);

    //    显示用户下面的所有明细
    User showAllBill(Integer id);

    //通过登录名，密码登录
    User loginUser(String name,String password);
    //新建用户
boolean createUser(User user);
    //注销用户
    boolean deleteUser(User user);


    //通过Id查询该用户下的所有消费记录

    //消费统计(月消费，年消费，)

    //消费是否超标


}
