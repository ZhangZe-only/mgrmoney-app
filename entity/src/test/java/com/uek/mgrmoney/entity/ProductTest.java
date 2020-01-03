package com.uek.mgrmoney.entity;

import com.uek.mgrmoney.enumeration.ProductStatus;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author: 张泽
 * @since JDK 1.8
 * date:2020/1/3 11:24
 */
public class ProductTest {
    //日志
    private static Logger logger = Logger.getLogger(ProductTest.class);
    @Test
    public void createProduct(){
        Product p = new Product();
        p.setId("test001");
        p.setName("月光贷");
        p.setStartAmount(BigDecimal.valueOf(1000));
        p.setStatus(ProductStatus.END);
        p.setCreateAt(new Date());
        p.setCreateUser("zz");
        logger.info(p);
    }
}
