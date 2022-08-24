package com.ykx.ykxfmis.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;
@Entity
public class Bill {
    @Id
    private Integer id;
    private Double money;
    private Date datetime;
    private String remark;

    public Bill() {
        super();
    }

    public Bill(Integer id, Double money, Date date, String remark) {
        this.id = id;
        this.money = money;
        this.datetime = datetime;
        this.remark = remark;
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

    @Override
    public String toString() {
        return "Bill{" +
                "id=" + id +
                ", money='" + money + '\'' +
                ", date=" + datetime +
                ", remark='" + remark + '\'' +
                '}';
    }
}
