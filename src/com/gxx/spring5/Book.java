package com.gxx.spring5;

/**
 * @author gxx
 * @create 2021-07-26 11:42
 */
public class Book {

    private String bname;
    private String bauthor;
    private String address;

    public void setBname(String bname) {
        this.bname = bname;
    }

    public void setBauthor(String bauthor) {
        this.bauthor = bauthor;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void testDemo() {
        System.out.println(bname + "::" + bauthor + "::" + address);
    }
}
