package com.ykx.ykxfmis.entity;

public class CateGory {
    private Integer id;
    private String name;
    private String type;
    private Integer budget;

    public CateGory() {
        super();
    }

    public CateGory(Integer id, String name, String type, Integer budget) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.budget = budget;
    }

    public CateGory(Integer id, String name, Integer budget) {
        this.id = id;
        this.name = name;
        this.budget = budget;
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

    public Integer getBudget() {
        return budget;
    }

    public void setBudget(Integer budget) {
        this.budget = budget;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "CateGory{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", budget='" + budget + '\'' +
                '}';
    }
}
