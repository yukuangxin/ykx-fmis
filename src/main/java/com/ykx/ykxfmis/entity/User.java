package com.ykx.ykxfmis.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;
import java.util.Objects;


public class User {

    private Integer id;

    private String name;

    private Integer age;

    private String sex;
    private String mail;
    private String password;
    private String phone;
    private String loginName;
    private List<Bill> billList;


    public User() {
        super();
    }

    public User(Integer id, String name, Integer age, String sex, String mail, String password, String phone, String loginName) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.mail = mail;
        this.password = password;
        this.phone = phone;
        this.loginName = loginName;
    }

    public List<Bill> getBillList() {
        return billList;
    }

    public void setBillList(List<Bill> billList) {
        this.billList = billList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", mail='" + mail + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                ", loginName='" + loginName + '\'' +
                ", billList=" + billList +
                '}';
    }
}




