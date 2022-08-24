package com.ykx.ykxfmis.dao;

import com.ykx.ykxfmis.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserDao {
    //    通过id查找user
    User findUserById(@Param("id") Integer id);

    //    通过id,姓名查找User
    User findUserByIdAndName(@Param("id") Integer id, @Param("name") String name);

    //    添加user
    int insertUser(User user);

    //    通过登录名，密码查找user
    User findUserByLoginNameAndPassword(@Param("loginName") String loginName, @Param("password") String passwowrd);

    //    通过登录名查找user
    User findUserByLoginName(@Param("loginName") String loginName);

    //    通过用户id，连表查询该用户下的所有所有记录
    User findBillWithUser(@Param("id") Integer id);

    //    通过登录名密码删除用户信息
    void deleteUser(String loginName, String password);
//    int insertUser1(User user);
}
