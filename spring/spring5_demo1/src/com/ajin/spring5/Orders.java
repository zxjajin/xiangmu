package com.ajin.spring5;

/** 使用有参构造注入
 * @author ajin
 * @create 2022-10-04 3:06
 */
public class Orders {
    //属性
    private String oname;
    private String address;
    //有参数构造
    public Orders(String oname, String address) {
        this.oname = oname;
        this.address = address;
    }
    public void Test(){
        System.out.println(oname+"::"+address);
    }
}
