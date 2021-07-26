package com.gxx.spring5;

/**
 * @author gxx
 * @create 2021-07-26 11:59
 */
public class Orders {

    private String oname;
    private String  address;

    public Orders(String oname, String address) {
        this.oname = oname;
        this.address = address;
    }

    public void oredersTest() {
        System.out.println(oname + "::" + address);
    }
}
