package com.uek.mgrmoney.entity;

import org.junit.Test;

import java.math.BigDecimal;

/**
 * @author: 张泽
 * @since JDK 1.8
 * date:2020/1/3 11:03
 */
public class CallTest {
    public static void main(String[] args) {
        System.out.println(0.05+0.01);
        System.out.println(1.0-0.42);
        System.out.println(4.015*100);
        System.out.println(123.3/100);

    }

    @Test
    public void testCal(){

        BigDecimal a = BigDecimal.valueOf(0.05);
        BigDecimal b = BigDecimal.valueOf(0.01);
        BigDecimal add = a.add(b);

        System.out.println(add.doubleValue());
    }
}
