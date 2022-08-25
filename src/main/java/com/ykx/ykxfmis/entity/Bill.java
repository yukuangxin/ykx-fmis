package com.ykx.ykxfmis.entity;


import java.util.Date;

public class Bill {

    private Integer id;
    private Double money;
    private Date datetime;
    private String remark;
    private CateGory cateGory;

    public Bill() {
        super();
    }

    public Bill(Integer id, Double money, Date datetime, String remark, CateGory cateGory) {
        this.id = id;
        this.money = money;
        this.datetime = datetime;
        this.remark = remark;
        this.cateGory = cateGory;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public CateGory getCateGory() {
        return cateGory;
    }

    public void setCateGory(CateGory cateGory) {
        this.cateGory = cateGory;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "id=" + id +
                ", money=" + money +
                ", datetime=" + datetime +
                ", remark='" + remark + '\'' +
                ", cateGory=" + cateGory +
                '}';
    }
}
