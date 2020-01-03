package com.uek.mgrmoney.entity;

import com.uek.mgrmoney.enumeration.ProductStatus;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 理财产品实体类
 * @author: 张泽
 * @since JDK 1.8
 * date:2020/1/3 10:42
 * 重点：
 *      1. lockupPeriod 锁定期  Integer 而不用int
 *      2. 金额 为什么要使用BigDecimal
 *      Java/c/c++ 都会遇见这样问题，浮点类型的数据在计算机底层的存储伪随机数
 *      1/3 伪数，不准确但是我们现在的需求要完全准确。
 *       System.out.println(0.05+0.01);
 *         System.out.println(1.0-0.42);
 *         System.out.println(4.015*100);
 *         System.out.println(123.3/100);
 *
 *         java 语言为了解决这个问题，封装了一个工具类，用于准确计算
 */
@Data
@NoArgsConstructor
public class Product implements Serializable {
    //产品编号
    private String id;
    //产品名称
    private String  name;
    //状态
    private String status;
    //起投金额
    private BigDecimal startAmount;
    //投资步长
    private BigDecimal stepAmount;
    //锁定期
    private Integer lockupPeriod;
    //收益率
    private BigDecimal earningRate;
    //备注
    private String remark;
    //创建时间
    private Date createAt;
    //产品创建者
    private String createUser;
    //产品更新时间
    private Date updateAt;
    //产品更新者
    private String updateUser;

    public void setStatus(ProductStatus ps){
        this.status = ps.name();
    }
}
