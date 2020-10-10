package com.spring.test.pojo;

public class Project {

   private Integer pId ;

   private String pName ;

   private String pTeacher ;

    @Override
    public String toString() {
        return "Project{" +
                "pId=" + pId +
                ", pName='" + pName + '\'' +
                ", pTeacher='" + pTeacher + '\'' +
                '}';
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getpTeacher() {
        return pTeacher;
    }

    public void setpTeacher(String pTeacher) {
        this.pTeacher = pTeacher;
    }

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }
}
