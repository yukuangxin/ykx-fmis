package com.ykx.ykxfmis.service.impl;

import com.mysql.cj.result.Row;
import com.ykx.ykxfmis.dao.UserDao;
import com.ykx.ykxfmis.entity.User;
import com.ykx.ykxfmis.service.UserService;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    @Override
    public User findUserById(Integer id) {
        return userDao.findUserById(id);

    }

    @Override
    public User findUser(Integer id, String name) {
        return userDao.findUserByIdAndName(id, name);
    }

    @Override
    public int registerNewUser(User newUser) {
        int i = userDao.insertUser(newUser);
        System.out.println(",恭喜你，创建成功");
        return i;

    }

    @Override
    public User findUserByLogin(String name, String password) {
        User user = userDao.findUserByLoginNameAndPassword(name, password);
        System.out.println("恭喜你查询成功");
        System.out.println(user.toString());
        return user;
    }

    @Override
    public User findUserByLoginName(String name) {
        System.out.println("恭喜你查询成功");
        User user = userDao.findUserByLoginName(name);

        return user;
    }

    @Override
    public User showAllBill(Integer id) {
        User user = userDao.findBillWithUser(id);
        return user;
    }

    /**
     * 通过用户名密码登录业务逻辑
     */
    @Override
    public User loginUser(String name, String password) {
        User user = userDao.findUserByLoginNameAndPassword(name, password);
        if (user != null) {
            System.out.println("登录成功");
        } else {
            System.out.println("登录失败");
        }
        return user;
    }

    /**
     * 创建新用户业务逻辑
     */
    @Override
    public boolean createUser(User user) {
        int b = userDao.insertUser(user);
        if (b == 1) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 注销用户业务逻辑
     */
    @Override
    public boolean deleteUser(User user) {
        String loginName=user.getLoginName();
        String password=user.getPassword();
        userDao.deleteUser(loginName,password);
        User userNew = userDao.findUserByLoginNameAndPassword(loginName, password);
        if(userNew==null){
            System.out.println("删除成功");
            return true;
        }
        return false;
    }

//    @Override
//    public void registerNewUser1(User newUser) {
//        //i 记录了执行成功的记录数
//        int i=userDao.insertUser1(newUser);
//
//        System.out.println("恭喜你，创建成功"+i+"次");
//    }



  /*  @Resource
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<User> findAllUser() {
        String sql = "select * from t_user";
        List<User> userList = jdbcTemplate.query(sql,
                new RowMapper<User>() {
                    @Override
                    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
                        User user = new User();
                        user.setId(rs.getInt("u_id"));
                        user.setName(rs.getString("u_name"));
                        user.setAge(rs.getString("u_age"));
                        user.setSex(rs.getString("u_sex"));
                        return user;
                    }
                });
        return userList;
    }*/
}
