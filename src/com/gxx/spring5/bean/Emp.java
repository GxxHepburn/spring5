package com.gxx.spring5.bean;

/**
 * @author gxx
 * @create 2021-07-26 14:42
 */
public class Emp {

    private String ename;
    private String gender;

    private Dept dept;

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public Dept getDept() {
        return dept;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void add () {
        System.out.println(ename + "::" + gender + "::" + dept);
    }
}
