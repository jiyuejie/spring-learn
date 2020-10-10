package com.spring.test.pojo;

public class Dormitory {

    private Integer dNo ;

    private Integer dNum ;

    @Override
    public String toString() {
        return "Dormitory{" +
                "dNo=" + dNo +
                ", dNum=" + dNum +
                '}';
    }

    public Integer getdNum() {
        return dNum;
    }

    public void setdNum(Integer dNum) {
        this.dNum = dNum;
    }

    public Integer getdNo() {
        return dNo;
    }

    public void setdNo(Integer dNo) {
        this.dNo = dNo;
    }
}
