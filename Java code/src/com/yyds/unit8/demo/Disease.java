package com.yyds.unit8.demo;
public class Disease {
    private Integer id;
    private String name; // 地区名称
    private Integer count; // 确诊数
    private Integer type; // 地区类，0低风险，1中风险，2高风险

    public Disease(Integer id, String name, Integer count, Integer type) {
        this.id = id;
        this.name = name;
        this.count = count;
        this.type = type;
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

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Disease{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", count=" + count +
                ", type=" + type +
                '}';
    }
}
