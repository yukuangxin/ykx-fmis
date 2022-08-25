package com.ykx.ykxfmis;

import com.ykx.ykxfmis.dao.AdminDao;
import com.ykx.ykxfmis.entity.Admin;
import com.ykx.ykxfmis.entity.Bill;
import com.ykx.ykxfmis.entity.User;
import com.ykx.ykxfmis.service.AdminService;
import com.ykx.ykxfmis.service.BillService;
import com.ykx.ykxfmis.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.test.context.TestPropertySource;

import javax.annotation.Resource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class YkxFmisApplicationTests {
    @Resource
    private JdbcTemplate jdbcTemplate;
    @Resource
    private UserService userService;
    @Resource
    private AdminService adminService;
    @Resource
    private BillService billService;

    @Test
    void contextLoads() {
    }

    /**
     * Spring boot集成mysql测试
     * 遇到的问题： 当实体类与表对应关系不匹配的情况下(不使用myBatis情况下)，可以使用springJPAde @Column(name="" 注解)
     */
    @Test
    public void MysqlTest() {
//        String sql = "select * from t_user";
//        List<User> userList = (List<User>) jdbcTemplate.query(sql, new RowMapper<User>() {
//            @Override
//            public User mapRow(ResultSet rs, int rowNum) throws SQLException {
//                User user = new User();
//                user.setId(rs.getInt("u_id"));
//                user.setName(rs.getString("u_name"));
//                user.setAge(rs.getString("u_age"));
//                user.setSex(rs.getString("u_sex"));
//                return user;
//            }
//        });
//        System.out.println("查询成功");
//        for (User user : userList
//        ) {
//            System.out.println(user.toString());
//
//        }
    }

    @Test
    public void myBatisTest() {
        User user = userService.findUserById(1);
        System.out.println(user.toString());
    }

    @Test
    public void findUserByIdAndNameTest() {
//        User user = userService.findUser(1, "zhangsan");
//        System.out.println(user.toString());
    }

//    @Test
//    public void insertUserTest() {
//        User user = new User(12, "xiaowang", "32", "男");
//        userService.registerNewUser(user);
//    }

//    @Test
//    public void insertUser1Test() {
//        User user = new User(null, "xiaowang", "32", "男");
//        userService.registerNewUser1(user);
//    }

    @Test
    public void adminServiceTest() {
      List<Admin> adminList=adminService.selectAll();
        System.out.println(adminList.toString());
    }

    @Test
    public void billServiceTest(){
        ArrayList arrayList=new ArrayList();
        arrayList.add("2345");
        arrayList.add("bill.getDatetime()");
        arrayList.add(12);
        arrayList.add(1);
        arrayList.add(2);
        System.out.println(arrayList.toString());
    }
    @Test
    public void  showAllBillTest(){
        int i=20;
        User user=userService.showAllBill(i);
        System.out.println(user.toString());
    }
    @Test
    public void loginUserTest(){
        userService.loginUser("yu","111111");
    }


}
