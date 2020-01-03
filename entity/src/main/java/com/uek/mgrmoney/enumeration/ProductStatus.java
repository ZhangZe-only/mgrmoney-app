package com.uek.mgrmoney.enumeration;

/**
 * 产品状态
 * @author: 张泽
 * @since JDK 1.8
 * date:2020/1/3 11:31
 */
public enum ProductStatus {
    LOCKED("锁定"),SALING("销售中"),END("结束");
    private String desc;
    ProductStatus(String desc){
        this.desc = desc;
    }

    public String getDesc(){
        return this.desc;
    }
}
